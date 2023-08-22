public class Department {
    
    private String deptName;
    private Employee manager;
    private String officePhoneNumber;

    // contructor for all variables
    public Department (String deptName, Employee manager, String officePhoneNumber){
        this.deptName = deptName;
        this.manager = new Employee(manager.getPpsNum(), manager.getName(), manager.getSalary());
        this.officePhoneNumber = officePhoneNumber;
    }

    // constructor with default phone number
    public Department (String deptName, Employee manager){
        this.deptName = deptName;
        this.manager = new Employee(manager.getPpsNum(), manager.getName(), manager.getSalary());
        officePhoneNumber = "-";
    }

    // defensive constructor
    public Department (Department department){
        deptName = department.deptName;
        manager = new Employee(department.manager.getPpsNum(), department.manager.getName(), department.manager.getSalary());
        officePhoneNumber = department.officePhoneNumber;
    }
    
    // setter
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }

    //defensive setter
    public void setDeptName(Department department){
        deptName = department.deptName;
    }

    public void setManager(Employee manager){
        this.manager = new Employee(manager.getPpsNum(), manager.getName(), manager.getSalary());
    }

    public void setManager(Department department){
        manager = new Employee(department.manager.getPpsNum(), department.manager.getName(), department.manager.getSalary());
    }

    public void setOfficePhoneNumber(String officePhoneNumber){
        this.officePhoneNumber = officePhoneNumber;
    }

    public void setOfficePhoneNumber(Department department){
        officePhoneNumber = department.officePhoneNumber;
    }
    
    public void printDetails(){
        System.out.println("***Department Details***\n---Department Name---\n" + "   " + deptName + "\n\n---Manager---\n" + "   " + manager + "\n\n---Office Phone Number---\n" + "   " + officePhoneNumber + "\n");
    }
}

