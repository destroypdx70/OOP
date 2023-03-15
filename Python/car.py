from account import Account

class Car:
    id = int
    license = Account("","","","","")
    driver = str
    passegenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver

    def setPassenger(self,passegenger):
        if passegenger >= 4:
            self.__passenger = int(passegenger)
            print("Passengers assigned : " + str(self.__passenger)) 

        else:
            print("The number of seats is not valid for this category")

    def getPassenger(self):
        if self.__passenger != int:
            print(self.__passenger)