public class Director extends Person{
    int numberOfShows;

    public Director(String name, Gender gender, String surname, int numberOfShows) {
        super(name, gender, surname);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссер{" +
                "количество постановок=" + numberOfShows +
                ", имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                ", пол=" + gender +
                '}';
    }
}
