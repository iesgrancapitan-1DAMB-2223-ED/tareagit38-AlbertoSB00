import java.sql.Struct;

public class NaturalPerson implements Cloneable {

    // Properties.
    private String idCard;
    private String name;
    private String surname;
    private boolean paySlip;
    private String address;
    private IBAN iban;
    private char costumerValuation;
    private LoanRequest loanRequest;

    // Constructor.
    public NaturalPerson(String idCard, String name, String surname, boolean paySlip, String address, IBAN iban, LoanRequest loanRequest){

        // this.idCard
        this.idCard = idCard;

        // this.name
        this.name = name;

        // this.surname
        this.surname = surname;

        // this.paySlip
        this.paySlip = paySlip;

        // this.address
        this.address = address;

        //this.iban
        this.iban = iban;

        // this.loanRequest
        this.loanRequest = loanRequest;
    }

    // Get & Set Methods.

    // String idCard;
    public String getIdCard(){ return this.idCard; }
    public void setIdCard( String idCard ){ this.idCard = idCard; }

    // String name;
    public String getName(){return this.name; }
    public void setName( String name ){ this.name = name; }

    // String surname;
    public String getSurname(){ return this.surname; }
    public void setSurname( String surname ){ this.surname = surname; }

    // boolean paySlip;
    public boolean getPaySlip(){ return this.paySlip; }
    public void setPaySlip( boolean paySlip ){ this.paySlip = paySlip; }

    // String address;
    public String getAddress(){ return this.address; }
    public void setAddress( String address ){ this.address = address; }

    // IBAN iban;
    public IBAN getIban(){ return this.iban; }
    public void setIban( IBAN iban ){ this.iban = iban; }

    // LoanRequest loanRequest;
    public LoanRequest getLoanRequest(){ return this.loanRequest; }
    public void setLoanRequest( LoanRequest loanRequest ){ this.loanRequest = loanRequest; }

    // Other methods.

    // clone() Method.
    public NaturalPerson cloneNaturalPerson(){
        try {
            return (NaturalPerson) this.clone();
        }
        catch ( CloneNotSupportedException cnse ){
            System.out.println("This call doesn't support objects clone.");
            return null;
        }
    }

    // toString() Method.
    @Override
    public String toString() {
        return "NaturalPerson{" +
                "idCard='" + this.idCard + '\'' +
                ", name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", paySlip=" + (this.paySlip ? "Yes" : "No") +
                ", address='" + this.address + '\'' +
                ", iban=" + this.iban +
                '}';
    }
}
