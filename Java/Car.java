package Java;

class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passengenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        passengenger = 4;
        System.out.println("Passenger: " + passengenger);
    }

    void printDataCar() {
        if(passengenger != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passenger " + passengenger);
        }
    }

    public Integer getPassenger(){
        return passengenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4){
            this.passengenger = passenger;
        }else{
            System.out.println("The size of passenger most to be 4");
        }
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}