public class Actor extends Person{
    int height;

    public Actor(String name, Gender gender, String surname, Integer height) {
        super(name, gender, surname);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актер{" +
                "рост=" + height +
                ", имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                '}';
    }
}
