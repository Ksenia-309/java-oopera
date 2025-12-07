import java.util.ArrayList;

public class MusicalShow extends Show{
    String musicAuthor;

    public MusicalShow(String title, ArrayList<Actor> listOfActors, Director director, int duration, String musicAuthor) {
        super(title, listOfActors, director, duration);
        this.musicAuthor = musicAuthor;
    }
}
