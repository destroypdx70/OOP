class Card extends Payment{
    constructor(id, Franchise, Duedate, CVV ){
        super(id)
        this.Franchise = Franchise;
        this.Duedate = Duedate;
        this.CVV = CVV;
    }
}