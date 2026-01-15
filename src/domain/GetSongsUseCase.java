package domain;

import java.util.ArrayList;
import java.util.List;

public class GetSongsUseCase {

    public ArrayList<Song> execute(){
        Song song=new Song();
        song.setId("1");
        song.setTitle("macarena");
        song.setAuthor("Los Del Rio");
        song.setDuration("4:00:00");

        Song song2=new Song();
        song2.setId("2");
        song2.setTitle("pollito pepe");
        song2.setAuthor("Las ketchup");
        song2.setDuration("3:00:00");

        ArrayList<Song> songs=new ArrayList<>();
        songs.add(song);
        songs.add(song2);

        return songs;
    }
}
