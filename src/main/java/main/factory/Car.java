
package main.factory;


public class Car {
    private final String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    
    
    
    public Car() {
        this.model = "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;
    }
    
    public  Car(String customModel, int customBuildYear, int customMaxSpeed, String customColor, int customMaxFuel, int customCurrentFuel, int customconsumption) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.maxSpeed = customMaxSpeed;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.consumption = customconsumption;
    }
    
    public String getVehicleType() {
        return this.vehicleType;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String customModel) {
        this.model = customModel;
    }
    
    public int getBuildYear() {
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear) {
                this.buildYear = customBuildYear;
    }
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int customMaxSpeed) {
                this.maxSpeed = customMaxSpeed;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String customColor) {
        this.color = customColor;
    }
    
    public int getMaxFuel() {
        return this.maxFuel;
    }
    
    public void setMaxFuel(int customMaxFuel) {
                this.maxFuel = customMaxFuel;    
    }
    
    public int getCurrentFuel() {
        return this.currentFuel;
    }
    
    public void setCurrentFuel(int customCurrentFuel) {
                this.currentFuel = customCurrentFuel;
    }
    
    public int getConsumption() {
        return this.consumption;
    }
    
    public void setconsumption(int customconsumption) {
                this.consumption = customconsumption;
    }
    
    public void showData() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrošnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara je: " + this.getMaxFuel());
        System.out.println("Maksimalna brzina: " + this.getMaxSpeed());
        
    }
    
    public void travel(int distanceTraveled) {
        // kolicina goriva da se smanji za onoliko koliko je potroseno
        // kilometraza treba da se uveca
        //kuci napravi jos jedan atribut za kilometrazu "mileage"
        //napravi get i set metode za mileage
        //prosiri jedan od konstruktora tako da moze da se koristi i setuje mileage
        //jos vezbe definisi jos jedan atribut za stanje motora da li je ukljucen ili nije
        
        
    }
}
