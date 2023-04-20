package Problems.PendencySystem;

import java.util.List;

public interface ITracking {

    void startTracking(Integer id , List<String> tags) throws InvalidTrackingIdException;
    void stopTracking(Integer id) throws  InvalidTrackingIdException;
    Integer getCounts(List<String> tags);


}
