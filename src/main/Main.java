package main;

import main.FetchPage.CheckName;
import main.filehandler.CreateFile;
import main.filehandler.CreateInitFiles;
import main.filehandler.ReadFile;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        try {
            CreateInitFiles.createBatch();
            CreateInitFiles.createdWanted();
            CreateInitFiles.createFound();
            CreateInitFiles.createReadMe();
            ArrayList<String> names = ReadFile.read("nameSearch.txt");
            ArrayList<String> availableNames = new ArrayList<>();
            names.forEach(name -> {
                Boolean available = CheckName.isAvailable(name);
                if(available){
                        availableNames.add(name);
                }
                System.out.println(name + " - " + available);
            });
            String[] namesAr = new String[availableNames.size()];
            for(int i = 0; i < availableNames.size(); i++){
                namesAr[i] = availableNames.get(i);
            }
            try {
                CreateFile.file("namesFound.txt", namesAr);
            }catch(Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
