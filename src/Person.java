public class Person {

    String firstName;
    String lastName;
    int age;
    boolean isMarried;
    String[] pets;
    double salary;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public Person(String firstName, String lastName, int age,boolean isMarried, String[] pets, double salary) {
        this(firstName,lastName,age);
        this.isMarried = isMarried;
        this.pets = pets;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge (){
        return age;
    }

    public boolean isTeen(){
        return age >=13 && age<=19;
    }
}
