from payment import Payment
class Paypal(Payment):
    Reference = str
    Branch = str

    def __init__(self, id, Reference, Branch):
        super.__init__(id)
        self.Reference = Reference
        self.Branch = Branch