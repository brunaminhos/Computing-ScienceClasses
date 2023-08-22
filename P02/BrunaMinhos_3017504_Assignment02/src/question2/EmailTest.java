package question2;

public class EmailTest {

    //main method for test email
    public static void main(String[] args) {
        Email email = new Email();
        email.setWorkEmail("bruna@work.com");
        email.setHomeEmail("bruna@home.com");
        String workEmail = email.getWorkEmail();
        String homeEmail = email.getWorkEmail();
        System.out.println("Work email is " + workEmail);
        System.out.println("Home email is " + homeEmail);
    }
}
