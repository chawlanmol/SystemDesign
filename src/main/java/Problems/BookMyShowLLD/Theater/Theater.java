package Problems.BookMyShowLLD.Theater;

import Problems.BookMyShowLLD.Screen;
import Problems.BookMyShowLLD.Show;

import java.util.List;
import java.util.stream.Collectors;

public class Theater {
    private Integer theaterId;
    private List<Screen> screens;
    private String name;
    private List<Show> shows;
    public String address;

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public Theater(Integer theaterId, List<Screen> screens, String name) {
        this.screens = screens;
        this.name = name;
        this.theaterId = theaterId;
    }

    public List<Show> getShowsByMovieName(String movieName) {
       return shows.stream().filter(show -> show.getMovie().getName() == movieName).collect(Collectors.toList());
    }
}
