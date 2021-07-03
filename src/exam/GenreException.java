package exam;

public class GenreException extends RuntimeException{

    public String Error;
    public GenreException(String error){
        Error=error;
    }
}
