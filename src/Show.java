import java.util.ArrayList;
import java.util.Objects;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;


    public Show(String title, ArrayList<Actor> listOfActors, Director director, int duration) {
        this.title = title;
        this.listOfActors = listOfActors;
        this.director = director;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(listOfActors, show.listOfActors);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listOfActors);
    }
}
