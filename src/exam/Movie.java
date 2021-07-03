package exam;

public class Movie {
    public Genre[] Genres;
    public Director Director;
    public String Name;
    public int RestrictionAge;

    public Movie(String name,int age,Director director,Genre[] genres){
        Genres=genres;
        Director=director;
        Name=name;
        RestrictionAge=age;
        checkGenre();
    }

    private void checkGenre(){
        boolean exists=false;
        for (int i=0;i<Genres.length;i++) {
            if(Director.getGenre()==Genres[i]){
                exists=true;
                break;
            }
        }
        if(!exists){
            throw new GenreException("Bad Movie Exception");

        }
    }

    public int getRestrictionAge(){
        return RestrictionAge;
    }
}
