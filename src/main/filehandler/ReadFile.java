package main.filehandler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {
    public static ArrayList<String> read(String path) throws Exception {
        ArrayList<String> names = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        for(String line; (line = reader.readLine()) != null;){
            names.add(line);
        }
        reader.close();
        return names;
    }
}
