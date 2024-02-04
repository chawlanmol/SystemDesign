package Problems.FileSystem;

import Problems.DesignHashMap.HashMap;
import jdk.nashorn.internal.objects.annotations.Constructor;
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
