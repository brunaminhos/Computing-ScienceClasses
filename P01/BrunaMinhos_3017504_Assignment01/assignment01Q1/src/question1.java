public class question1 {

    boolean onOffSwitch;
    
    public question1(){
        onOffSwitch = false; // switch set to false by default
    }

    public void flipSwitch(boolean setting){
        this.onOffSwitch = setting; // sets the switch to the parameter passed as setting 
    }

    public void getSwitchStatus(){
        String switchStatus = Boolean.toString(onOffSwitch); // converts boolean to a string
        System.out.println(switchStatus); // Prints out the value of the converted string
    }
}
