public class question1Test {
    public static void main(String[] args) {
        question1 testSwitch = new question1();
        System.out.println("Switch should be false by default");
        System.out.println("Getting switch status");
        testSwitch.getSwitchStatus(); // getting the start of the status
        System.out.println("Flipping switch to true");
        testSwitch.flipSwitch(true); // turning it to true it will be the opposite as before 
        System.out.println("Getting switch status");
        testSwitch.getSwitchStatus();
    }
}
