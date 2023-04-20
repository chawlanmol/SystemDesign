package Problems.BookMyShowLLD.Theater;

import Problems.BookMyShowLLD.Movie.Movie;
import Problems.BookMyShowLLD.Show;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TheaterController {

    List<Theater> theaterList;
    Map<String , List<Theater>> cityToTheater;


    public List<Theater> getTheaterList() {
        return theaterList;
    }

    public void setTheaterList(List<Theater> theaterList) {
        this.theaterList = theaterList;
    }

    public Map<String, List<Theater>> getCityToTheater() {
        return cityToTheater;
    }

    public void setCityToTheater(Map<String, List<Theater>> cityToTheater) {
        this.cityToTheater = cityToTheater;
    }

    public List<Theater> getTheatersByCity(String city) {
        return cityToTheater.getOrDefault(city, new LinkedList<>());
    }

    public Map<Theater, List<Show>> getAllShows(Movie movie, String city) {

        Map<Theater, List<Show>> theatreVsShows = new HashMap<>();

        List<Theater> theatres = cityToTheater.get(city);

        for(Theater theater : theatres) {
            List<Show> shows = new ArrayList<>();
            for(Show show: theater.getShows()) {
                if(show.getMovie().equals(movie)) shows.add(show);
            }
            if(shows.size() > 0) theatreVsShows.put(theater, shows);
        }
        return  theatreVsShows;
    }

}
