
package Bai1;


public class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String hooby;
    
    public Person(){
}

    public Person(String name, String dateOfBirth, String gender, String hooby) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.hooby = hooby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHooby() {
        return hooby;
    }

    public void setHooby(String hooby) {
        this.hooby = hooby;
    }
    
    
}
