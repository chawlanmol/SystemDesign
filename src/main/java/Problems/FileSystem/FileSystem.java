package Problems.FileSystem;

import lombok.Data;

@Data
public class FileSystem {

    Directory root;

    String rootPath;

    void demo() {
        root = new Directory("/");
    }

    public void mkdir(String path) {


    }
    public void ls(String path) {
        String[] paths = path.split("/");

        for(int i = 0; i < paths.length; i++) {


        }
    }

}