package question2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Email email = new Email();
        employee.setFirstName("Bruna");
        employee.setSurname("Minhos");
        email.setWorkEmail("brunaminhos@work.com");
        email.setHomeEmail("brunaminhos@home.com");
        employee.setEmail(email);
        System.out.println(employee.getFullName());
        System.out.println(employee.getHomeEmail());
        System.out.println(employee.getWorkEmail());
    }
}
