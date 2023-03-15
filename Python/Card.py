from payment import Payment
from datetime import date
class Card(Payment):
    Frachise = str
    Duedate = date.today()
    CVV = str

    def __init__(self, id, Franchise, Duedate, CVV):
        super.__init__(id)
        self.Franchise = Franchise
        self.Duedate = Duedate
        self.CVV = CVV