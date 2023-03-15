package Java;
import java.util.Date;

class Card extends Payment {
    String Frachise;
    Date Duedate;
    String CVV;

    public Card(Integer id, String Franchise, Date Duedate, String CVV){
        super(id);
        this.Frachise = Franchise;
        this.Duedate = Duedate;
        this.CVV = CVV;
        

        this.printlnDataPayment();
    }
}

