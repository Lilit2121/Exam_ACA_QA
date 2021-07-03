package exam;

public class Viewer extends Person{
    public int Age;
    public Viewer(String name,int age) {
        super(name);
        Age=age;
    }

    public boolean CanWatchMovie(Movie movie){
        return Age>=movie.getRestrictionAge();
    }
}
