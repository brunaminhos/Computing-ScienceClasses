package question1;

    //variables
public class Vehicle {
    private String make;
    private String model;
    private Engine engine;

    //constructor method for vehicle
    public void setVehicle(String mk, String mdl, Engine e){
        make = mk;
        model = mdl;
        engine = e;
    }
    //method that sets value for engine make
    public void setMake(String Make){
        make = Make;
    }
    //method that return value of engine make
    public String getMake(){
        return make;
    }
    public void setModel(String Model){
        model = Model;
    } 
    public String getModel(){
        return model;
    }
    public void setEngine(Engine Engine){
        engine = Engine;
    }
    public Engine getEngine(){
        return engine;
    }
}