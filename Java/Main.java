package Java;

class Main {
    public static void main(String[] args) {
    
        Car car = new Car("AMG167", new Account("Anyi Manuela Gallego", "8135638136", "anyima@gmail.com", "ysuagsgw"));
        //car.passengenger = 4;
        car.printDataCar();
        
        UberX uberX = new UberX("AMG167", new Account("Anyi Manuela Gallego", "73517353", "Anyi7@gmail.com", "agushasjuehe" ), "Mercedes", "A75");
        //uberX.passengenger = 4;
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("AMG167", new Account("Anyi Manuela Gallego", "8361837382", "Anyiu89@gmail.com", "hsgaueieheg"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        Car car2 = new Car("ELI789", new Account("Elizabeth Palacio", "819373541672", "Eli34@gmail.com", "hagshsgwu"));
        //car2.passengenger = 4;
        car2.printDataCar();
        
        User user = new User("Elizabeth Palacio", "819373541672", "Eli34@gmail.com", "hagshsgwu");
        user.printDataUser();



        
        
    }

}