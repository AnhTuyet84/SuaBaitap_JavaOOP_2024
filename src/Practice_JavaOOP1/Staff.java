package Practice_JavaOOP1;

public class Staff {
    public String name;
    public int age;
    public String gender;
    public String phone;
    public String address;

    public Staff(String name, int age, String gender, String phone, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public void showInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: "+ phone );
        System.out.println("Address: " + address);
    }

}
