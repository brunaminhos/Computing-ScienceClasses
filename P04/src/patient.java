public class patient {
    private String patientId;
    private String bloodType;
    private person person;

    // empty contructor
    public patient (){}

    // contructor
    public patient(String patientId, String bloodType, person person){
        this.patientId = patientId;
        this.bloodType = bloodType;
        this.person = new person(person.getName(), person.getPhoneNumber(), person.getGender());
    }

    public void setPatientId(String patientId){
        this.patientId = patientId;
    }

    public String getPatientId(){
        return patientId;
    }

    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }

    public String getBloodType(){
        return bloodType;
    }

    public void setPerson(person person){
        this.person = new person(person.getName(), person.getPhoneNumber(), person.getGender());
    }

    public person getPerson(){
        return person;
    }

    public String toString(){
        String patientInfo = "Patient Details\nName: " + person.getName() + "\nPhone Number: " + person.getPhoneNumber() + "\nGender: " + person.getGender() + "\nPatient ID: " + patientId + "\nBlood type: " + bloodType;
        return patientInfo;
    }
}
