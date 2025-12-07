public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;


    public Person(String name, Gender gender, String surname) {
        this.name = name;
        this.gender = gender;
        this.surname = surname;
    }

    enum Gender {
        MALE,
        FEMALE
    }

}
