public class person {
    
    private String name;
    private int phoneNumber;
    private char gender;
    
    // empty contructor
    public person(){}

    // constructor
    public person(String name, int phoneNumber, char gender){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setGender(char gender){
        this.gender = Character.toUpperCase(gender);
    }

    public char getGender(){
        return Character.toUpperCase(gender);
    }

    public String toString(){
        String personInfo = "Person Details\nName: " + name + "\nPhone Number: " + phoneNumber + "\nGender: " + gender;
        return personInfo;
    }
}
