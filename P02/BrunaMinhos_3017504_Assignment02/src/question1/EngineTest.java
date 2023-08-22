package question1;

public class EngineTest {
    
    //main method used for test engine
    public static void main (String [] args){
        Engine testEngine = new Engine(500);
        int testCC = testEngine.get();
        System.out.println("Test engine CC: " + testCC);
        testEngine.edit(250);
        System.out.println(testEngine.toString());
    }
}
