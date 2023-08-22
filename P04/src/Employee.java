public class Employee {
    private String employeeId;
    private String department;
    private person person;

    // empty contructor
    public Employee (){}

    // contructor
    public Employee(String employeeId, String department, person person){
        this.employeeId = employeeId;
        this.department = department;
        this.person = new person(person.getName(), person.getPhoneNumber(), person.getGender());
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setPerson(person person){
        this.person = new person(person.getName(), person.getPhoneNumber(), person.getGender());
    }

    public person getPerson(){
        return person;
    }

    public String toString(){
        String employeeInfo = "Patient Details\nName: " + person.getName() + "\nPhone Number: " + person.getPhoneNumber() + "\nGender: " + person.getGender() + "\nEmployee ID: " + employeeId + "\nDepartment " + department;
        return employeeInfo;
    }
}
