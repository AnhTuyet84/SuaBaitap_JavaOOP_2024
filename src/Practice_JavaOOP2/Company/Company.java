package Practice_JavaOOP2.Company;

import Practice_JavaOOP2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Ánh Tuyết", 40, "Females", "0956245660","TPHCM");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);

    }

}
