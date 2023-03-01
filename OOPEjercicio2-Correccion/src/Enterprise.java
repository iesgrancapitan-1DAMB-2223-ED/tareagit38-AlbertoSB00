public class Enterprise {

    // Properties.
    private String idCard;
    private String name;
    private int type;
    private String activity;
    private IBAN iban;
    private char customerValuation;
    private LoanRequest loanRequest;

    // Static properties.
    private static final int PUBLIC_LIMITED_COMPANY = 1;
    private static final int PUBLIC_LIABILITY_COMPANY = 2;
    private static final int SELF_EMPLOYED = 3;

    // Constructor.
    public Enterprise(String idCard, String name, int type, String activity, IBAN iban, LoanRequest loanRequest) throws Exception {

        // this.idCard
        this.idCard = idCard;

        // this.name
        this.name = name;

        // this.type
        this.setType(type);

        // this.activity
        this.activity = activiti;

        // this.iban
        this.iban = iban;

        // this.loanRequest
        this.loanRequest = loanRequest;
    }

    // Get & Set Methods.

    // String idCard
    // String name
    // int type
    public void setType( int type ) throws Exception {
        if( type != Enterprise.PUBLIC_LIMITED_COMPANY && type != Enterprise.PUBLIC_LIABILITY_COMPANY && type != Enterprise.SELF_EMPLOYED ){
            throw new Exception("The type is wrong.");
        }
        else{
            this.type = type;
        }
    }
    // String activity
    // IBAN iban
    // char customerValuation
    // LoanRequest loanRequest


    // Other methods.

    // clone() Method.

    // toString() Method.
}
