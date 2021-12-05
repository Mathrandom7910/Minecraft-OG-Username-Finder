package main.FetchPage;

public class CheckName {
    public static Boolean isAvailable(String name){
        return Fetch.fetchUrl("https://api.mojang.com/users/profiles/minecraft/" + name) == null;
    }
}
