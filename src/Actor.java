import java.util.Objects;

public class Actor extends Person{
    int height;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }

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
