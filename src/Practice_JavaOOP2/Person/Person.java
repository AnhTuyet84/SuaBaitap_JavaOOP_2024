package Practice_JavaOOP2.Person;

public class Person {
    public String name;
    public int age;
    public String gender;
    private String phone; //Dùng private vì đề bài yêu cầu ở class company ko thể gọi được thông tin này
    private String address;//Dùng private vì đề bài yêu cầu ở class company ko thể gọi được thông tin này

    public Person(String name, int age, String gender, String phone, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }
    //Dùng protected thì cùng package gọi được
    protected void showInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: "+ phone );
        System.out.println("Address: " + address);
    }

}
