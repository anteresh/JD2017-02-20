package by.it.prigozhanov.jd01_14;

import java.io.*;

/**
 * Created by v-omf on 3/24/2017!
 */
public class TaskC {

    static void processFolder(String prefix, File object) {
        if (object.isFile()) {
            System.out.println("File: " + prefix+ object.getName());
        } else {
            System.out.println("Directory: " +prefix+ object.getName());
            File dir[] = object.listFiles();
            if (dir!= null && dir.length > 0) {
            for (File f : dir) {
                processFolder(prefix + "     ", f);
            }
            }
        }
    }

    public static void main(String[] args) {
        String root= System.getProperty("user.dir");
        String path = root + "/src/by/it/prigozhanov/jd01_14/";
        File file = new File(path);
        processFolder(" ", file);
    }

}
