class Paypal extends Payment{
    constructor(id, reference, branch){
        super(id)
        this.reference = reference;
        this.branch = branch;
    }
}