package Problems.DocumentService;

import java.util.HashMap;
import java.util.Map;

public class AuditDocument  {

    Integer documentID;
    String content;
    Map<Integer , AccessType> userToAccessMap;

    public AuditDocument(Integer documentID, Integer userId) {
        this.documentID = documentID;
        this.userToAccessMap = new HashMap<>();
        userToAccessMap.put(userId, AccessType.ADMIN);
    }

    public String getContent(Integer userId) throws Exception{
       if(userToAccessMap.get(userId) == null) throw new Exception("No access found");
       return content;
    }

    public void setContent(Integer userid , String content) throws Exception {
        AccessType accessType = userToAccessMap.get(userid);
        if(accessType == null) throw new Exception("No access found");
        if(accessType.equals(AccessType.ADMIN) || accessType.equals(AccessType.EDIT)) {
            this.content = content;
        }
    }

    public Integer getDocumentID() {
        return documentID;
    }

    public void setDocumentID(Integer documentID) {
        this.documentID = documentID;
    }

    public Map<Integer, AccessType> getUserToAccessMap() {
        return userToAccessMap;
    }

    public void setUserToAccessMap(Map<Integer, AccessType> userToAccessMap) {
        this.userToAccessMap = userToAccessMap;
    }
    public void giveAccessToUser(Integer userId, AccessType accessType) {
        userToAccessMap.put(userId, accessType);
    }

}
