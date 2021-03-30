import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Assignment3Q10 {

    List<MovieDetails> list = new ArrayList<>();

    public static void main(String[] args) {}

    public static void sort(ArrayList<MovieDetails> movieDetails, Comparator<MovieDetails> movieDetailsComparator){}

    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails){}

    public void addMovie(MovieDetails movie) {
        list.add(movie);
    }

    public void removeMovies(String movieName) {
        for(MovieDetails m:list){
            if(m.getMovieName().equals(movieName)){
                list.remove(m);
                return;
            }
        }
    }

    public void removeAllMovies(List<MovieDetails> movies) {
        for(MovieDetails m:movies){
            list.remove(m);
        }
    }

    public MovieDetails find_movie_By_mov_Name(String movieName) {

        for(int i=0; i<list.size();i++){
            if(list.get(i).getMovieName().equals(movieName)){
                return list.get(i);
            }
        }

        return null;
    }

    public List<MovieDetails> find_movie_By_Genre(String genre) {
        List<MovieDetails> moviesByGenre = new ArrayList<>();
        for(MovieDetails m:list){
            if(m.getGenre().equals(genre)){
                moviesByGenre.add(m);
            }
        }

        return moviesByGenre;
    }

    public static Comparator<MovieDetails> sortAccordingly(String sortBy) {
        Comparator<MovieDetails> movieComparator = null;
        if(sortBy.equals("movieName")){
            movieComparator = Comparator.comparing(MovieDetails::getMovieName);
        }else if(sortBy.equals("genre")){
            movieComparator = Comparator.comparing(MovieDetails::getGenre);
        }else if(sortBy.equals("actress")){
            movieComparator = Comparator.comparing(MovieDetails::getActress);
        }else if(sortBy.equals("actor")){
            movieComparator = Comparator.comparing(MovieDetails::getActor);
        }

        return movieComparator;

    }
}
