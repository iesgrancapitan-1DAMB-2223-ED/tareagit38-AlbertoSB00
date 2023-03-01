import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // We create iban1 object.
        IBAN iban1 = null;
        try{
            iban1 = new IBAN("es0012345678901234567890", 1500f, 0.1f, LocalDate.of(2020, 12, 12));
            System.out.println(iban1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            iban1 = new IBAN("es0012345678901234567", 1500f, 0.1f, LocalDate.of(2020, 12, 12));
            System.out.println(iban1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        // We create iban2 object and clone.
        IBAN iban2 = iban1.cloneIBAN();
        System.out.println(iban2);

        // We create lr1 object.
        LoanRequest lr1 = null;
        try{
            lr1 = new LoanRequest(1, 500000f, LoanRequest.MORTGAGE, LocalDate.now(), '€', 360);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(lr1);
    }
}