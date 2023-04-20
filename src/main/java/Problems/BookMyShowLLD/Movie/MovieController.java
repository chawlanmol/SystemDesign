package Problems.BookMyShowLLD.Movie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MovieController {

    List<Movie> movieList;
    Map<String , List<Movie>> cityToMovie;

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public Map<String, List<Movie>> getCityToMovie() {
        return cityToMovie;
    }

    public void setCityToMovie(Map<String, List<Movie>> cityToMovie) {
        this.cityToMovie = cityToMovie;
    }

    public MovieController() {
        this.movieList = new LinkedList<>();
    }

    public void addMovie(String city , Movie movie) {
        movieList.add(movie);
        List<Movie> movies = cityToMovie.getOrDefault(city, new LinkedList<>());
        movies.add(movie);
        cityToMovie.put(city, movies);
    }

    public List<Movie> getMoviesByCityName(String city) {
        return cityToMovie.getOrDefault(city, new ArrayList<>());
    }
}
