package Problems.PendencySystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PendencySystem implements ITracking {

    Map<Integer , String> idToHashCode;

    public PendencySystem() {
        this.idToHashCode = new HashMap<>();
    }

    @Override
    public void startTracking(Integer id, List<String> tags) throws InvalidTrackingIdException{
        if(idToHashCode.containsKey(id)) {
            String message = "Id already been Tracked";
            System.out.println(message);
            throw new InvalidTrackingIdException(message);
        }
        String hashString = "";
        for(int i = 0 ; i < tags.size() ;i++) {
            hashString += tags.get(i) + "#";
        }
        idToHashCode.put(id, hashString);
    }

    @Override
    public void stopTracking(Integer id) throws InvalidTrackingIdException{
        if(!idToHashCode.containsKey(id)) {
            String message = "This is not been tracked";
            System.out.println(message);
            throw new InvalidTrackingIdException(message);
        }
        idToHashCode.remove(id);
    }

    @Override
    public Integer getCounts(List<String> tags) {

        String prefix = "";
        for(int i = 0; i < tags.size() ; i++) {
            prefix += tags.get(i) + "#";

        }
        Integer count = 0;

        for (Map.Entry<Integer,String> entry : idToHashCode.entrySet()) {
            Integer id = entry.getKey();
            String hashValue = entry.getValue();
            if(hashValue.startsWith(prefix)) count++;
        }
        return count;
    }
}
