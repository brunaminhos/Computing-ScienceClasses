package question1;

public class VehicleTest {
        
    //main method for test vehiacle
    public static void main(String[] args) {
        Vehicle c = new Vehicle ();
        Engine cEngine = new Engine(500);
        c.setMake("ford");
        c.setModel("focus");
        c.setEngine(cEngine);
        System.out.println(c.getMake());
        System.out.println(c.getModel());
        System.out.println(c.getEngine());
    }
}
