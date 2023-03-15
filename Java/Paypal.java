package Java;

class Paypal extends Payment {
    String Reference;
    String branch;

    public Paypal(Integer id, String Reference, String branch){
        super(id);
        this.Reference = Reference;
        this.branch = branch;

        this.printlnDataPayment();
    }
}