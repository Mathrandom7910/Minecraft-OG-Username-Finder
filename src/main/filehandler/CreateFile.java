package main.filehandler;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void file(String fileName, String[] fileText) throws IOException {
        File file = new File(fileName);
        if(!file.exists()){
            file.createNewFile();
        }
        PrintWriter fw = new PrintWriter(file);
        for(int i = 0; i < fileText.length; i++){
            fw.println(fileText[i]);
        }
        fw.flush();
    }

    public static void batch(String batchName, String[] batchText) throws IOException{
        String[] bt = new String[batchText.length + 1];
        bt[0] = "@echo off";
        for(int i = 1; i < bt.length; i++){
            bt[i] = batchText[i - 1];
        }
        CreateFile.file(batchName + ".bat", bt);
    }
}
