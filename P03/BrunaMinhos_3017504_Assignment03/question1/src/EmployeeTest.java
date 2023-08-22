public class EmployeeTest {

    public static void main(String[] args) {
        // create objects
        Employee employee = new Employee("546594P", "Amora Santos", 845.23);
        Department department = new Department("Software", employee, "061335687");

        // print details
        employee.printDetails();
        department.printDetails();

        //change employee object
        employee.setName("Linda Bella");
        employee.setPpsNum("158745T");
        employee.setSalary(4529.78);

        department.printDetails();
        employee.printDetails();
    }    
}
