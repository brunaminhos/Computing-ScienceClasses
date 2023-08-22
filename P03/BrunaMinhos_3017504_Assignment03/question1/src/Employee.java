public class Employee {

    private String ppsNum;
    private String name;
    private Double salary;

    // employee constructor
    public Employee (String ppsNum, String name, Double salary){
        this.ppsNum = ppsNum;
        this.name = name;
        this.salary = salary;
    }

    public void setPpsNum(String ppsNum){
        this.ppsNum = ppsNum;
    }

    public String getPpsNum(){
        return ppsNum;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public Double getSalary(){
        return salary;
    }

    public void printDetails(){
        System.out.println("***Employee Details***\n---PPS---\n" + "   " + ppsNum + "\n\n---Name---\n" + "   " + name + "\n\n---Salary---\n" + "   " + salary + "\n");
    }
}
