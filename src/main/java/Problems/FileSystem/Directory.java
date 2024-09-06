package Problems.FileSystem;

import Problems.DesignHashMap.HashMap;
import lombok.Data;

@Data
public class Directory {

    String directoryName;

    String path;

    HashMap<String , File> fileHashMap;

    HashMap<String, Directory> directoryHashMap;

    Directory(String path) {
        this.path = path;
    }

}
