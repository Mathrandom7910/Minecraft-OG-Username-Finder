package main.FetchPage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Fetch {
    public static String fetchUrl(String pageUrl){
        StringBuilder text = new StringBuilder();
        try {
            URL url = new URL(pageUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            if(con.getResponseCode() == 204) return null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            for(String line; (line = reader.readLine()) != null;){
                text.append(line);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return text.toString();
    }
}
