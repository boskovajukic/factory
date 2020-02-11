
package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        
        System.out.println("Pocetak");
        
        String message = "Ovo je poruka";
        
        Car fiat = new Car("Fiat Punto", 2010, 180, "Black", 45, 20, 6);
        
        
        
        fiat.setModel("Fiat Punto");
        fiat.setBuildYear(2010);
        fiat.setColor("Black");
        fiat.setconsumption(6);
        fiat.setCurrentFuel(20);
        fiat.setMaxSpeed(180);
        fiat.setMaxFuel(45);
//        fiat.buildYear = 2010;
//        fiat.color = "Black";
//        fiat.consumption = 6;
//        fiat.maxSpeed = 180;
//        fiat.currentFuel = 20;
//        fiat.maxFuel = 45;
//        
        fiat.showData();
        
        
        System.out.println("________________");
        
        
        Car ford = new Car("Ford", 2015, 190, "Red", 40, 10, 5);
//        Car ford = new Car();
//        ford.setModel("Ford Fiesta");
//        ford.setBuildYear(2015);
//        ford.buildYear = 2015;
        
        ford.showData();
        
        System.out.println("________________");
        
        
//        System.out.println("Model: " + ford.getModel());
        
        Car peugeot = new Car("306", 2001, 180, "Red", 40, 7, 6);
        
        peugeot.showData();
        
        System.out.println("________________");
        
        Car Lada = new Car("Lada Niva", 1980, 190, "green", 40, 20, 10);
        Lada.showData();
        
    }
    
}
