package Problems.DocumentService;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private Integer userId;
    private String userName;
    private List<AuditDocument> documentList;

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.documentList = new LinkedList<>();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<AuditDocument> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<AuditDocument> documentList) {
        this.documentList = documentList;
    }

    void giveAccess(Integer userId, Integer documentId, AccessType AccessType) {
      AuditDocument auditDocument = (AuditDocument) documentList.stream().filter(auditDocument1 -> auditDocument1.getDocumentID().equals(documentId)).collect(Collectors.toList());
      auditDocument.giveAccessToUser(userId, AccessType);
    }


}
