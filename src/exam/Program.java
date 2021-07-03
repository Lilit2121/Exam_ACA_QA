package exam;

public class Program {
    public static void main(String[] args) {
        Director director1 = new Director("D1", Genre.Genre1);
        Director director2 = new Director("D2", Genre.Genre2);
        Director director3 = new Director("D3", Genre.Genre3);
        Director director4 = new Director("D4", Genre.Genre4);
        Viewer viewer = new Viewer("Lilit", 24);
        Movie[] movies = {
                new Movie("M1", 18, director1, new Genre[]{Genre.Genre1, Genre.Genre2}),
                new Movie("M2", 22, director2, new Genre[]{Genre.Genre1, Genre.Genre2}),
                new Movie("M3", 26, director4, new Genre[]{Genre.Genre4, Genre.Genre1}),
                new Movie("M4", 16, director2, new Genre[]{Genre.Genre3, Genre.Genre2}),
                new Movie("M5", 29, director3, new Genre[]{Genre.Genre3}),
        };

        boolean result=viewer.CanWatchMovie(movies[3]);
        System.out.println(result);


    }

}