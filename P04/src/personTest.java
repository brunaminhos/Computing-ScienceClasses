public class personTest {
    public static void main(String[] args){
        person person =  new person("Bob Kelly", 3578945, 'M');
        Employee employee = new Employee("0574", "Sales", person);
        patient patient = new patient("4750", "O-", person);

        String employeeInfo = employee.toString();
        String patientInfo = patient.toString();

        // The Name, phone number and gender should be the same
        System.out.println(employeeInfo);
        System.out.println(patientInfo);
    }
}