from car import Car
from account import Account
from user import User
from driver import Driver


if __name__ == "__main__":
    print("Hi world")

    car = Car("AMG167", Account("826381362383", "Anyi Manuela Gallego", "7353810362", "hasduagtsg@gmail.com", "kasyedga890"))
    print(vars(car))
    print(vars(car.driver))

    user = User("78363893728", "Elizabeth Palacio", "789271473", "eli456@gmail.com", 73)
    print(vars(user))
    
    driver = Driver("6253826363", "Noah Palacio", "73618363", "Noah89@gmail.com", 23)
    print(vars(driver))
