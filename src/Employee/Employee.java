package Employee;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private String email;
    private int phoneNumber;
    public int age;

    public Employee(String name, String surname, String position, String email, int phoneNumber, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void workWithTables(){
        enteringData();
        groupingData();


    }
    private void enteringData(){

        System.out.println("entering data into a table");
    }
    private void groupingData(){
        System.out.println("grouping data");
        System.out.println("/////////////////////////");
    }
}
