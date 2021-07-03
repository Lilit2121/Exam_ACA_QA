package exam;

public class Director extends Person{
    public Genre Genre;
    public Director(String name,Genre genre) {
        super(name);
        Genre=genre;
    }

    public Genre getGenre(){
        return Genre;

    }

}
