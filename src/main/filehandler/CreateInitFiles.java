package main.filehandler;

import java.io.File;

public class CreateInitFiles {
    public static void createdWanted(){
        try {
            if(!new File("nameSearch.txt").exists()) CreateFile.file("nameSearch.txt", new String[]{"username1", "username2", "username3", "etcetera"});
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void createBatch(){
        try {
            if(!new File("run").exists())  CreateFile.batch("run", new String[]{"java -jar ./MCUserNameSearch.jar", "pause"});
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void createFound(){
        try {
            if(!new File("namesFound.txt").exists())  CreateFile.file("namesFound.txt", new String[]{});
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void createReadMe(){
        try {
            CreateFile.file("README.txt", new String[]{"Use the run.bat file to run the program with the console",
                    "Fill the nameSearch.txt file with your requested usernames separated by a new line, as shown by the example"});
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
