package question2;

public class Employee {
    
    //variables
    private String firstName;
    private String surname;
    private Email email;

    //method that give value to the first name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //method that return value of the first name
    public String getFirstName(){
        return firstName;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setEmail(Email email){
        this.email = email;
    }

    public Email getEmail(){
        return email;
    }
    //method that returs firstname and surname as one string
    public String getFullName(){
        return firstName + " " + surname;
    }
    //method that calls email method to return home email
    public String getHomeEmail(){
        return email.getHomeEmail();
    }
    //method that calls email method to return work email
    public String getWorkEmail(){
        return email.getWorkEmail();
    }
}
