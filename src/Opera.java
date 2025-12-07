import java.util.ArrayList;

public class Opera extends MusicalShow{
    int choirSize;

    public Opera(String title, ArrayList<Actor> listOfActors, Director director, int duration, String musicAuthor,
                 String librettoText, int choirSize) {
        super(title, listOfActors, director, duration, musicAuthor);
        this.choirSize = choirSize;
    }
    public static String printLibrettoForOpera() {
        return "Либретто оперы 'Пер Гюнт'";
    }

}
