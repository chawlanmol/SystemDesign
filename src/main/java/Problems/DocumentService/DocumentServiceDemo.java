package Problems.DocumentService;

import Utilities.LoggerUtil;

import javax.swing.text.Document;

public class DocumentServiceDemo {

    public void Demo() throws Exception {
        User user1 = new User(1, "Anmol");
        User user2 = new User(2, "Harshita");

        AuditDocument document = new AuditDocument(1 , user1.getUserId());

        document.setContent(user1.getUserId(), "this is annmol document");
        document.getContent(user1.getUserId());
        LoggerUtil.log(document.getContent(user1.getUserId()));

    }
}
