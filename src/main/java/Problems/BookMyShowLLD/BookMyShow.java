package Problems.BookMyShowLLD;

import Problems.BookMyShowLLD.Movie.Movie;
import Problems.BookMyShowLLD.Movie.MovieController;
import Problems.BookMyShowLLD.Theater.Theater;
import Problems.BookMyShowLLD.Theater.TheaterController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    MovieController movieController;
    TheaterController theaterController;

    public BookMyShow(MovieController movieController, TheaterController theaterController) {
        this.movieController = movieController;
        this.theaterController = theaterController;
    }

    public void CreateBooking(String city, String movieName) {
        List<Movie> movies = movieController.getMoviesByCityName(city);
        Movie movie =(Movie) movies.stream().filter(movie1 -> movie1.getName().equals(movieName));
        Map<Theater, List<Show>> theaterListMap = theaterController.getAllShows(movie, city);

    }

}
