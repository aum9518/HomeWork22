import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter songs = new FileWriter("song.txt");
        songs.write("We were good, we were gold\n" +
                "Kinda dream that can’t be sold\n" +
                "We were right ’til we weren’t\n" +
                "Built a home and watched it burn\n" +
                "" +
                "" +
                "Mmm, I didn’t wanna leave you, I didn’t wanna lie\n" +
                "Started to cry, but then remembered I\n" +
                "" +
                "" +
                "I can buy myself flowers\n" +
                "Write my name in the sand\n" +
                "Talk to myself for hours\n" +
                "Say things you don’t understand\n" +
                "I can take myself dancing\n" +
                "And I can hold my own hand\n" +
                "Yeah, I can love me better than you can\n");
        songs.close();

        try {
            Song song = new Song("Flowers", "Miley Cyrus", songs);
            System.out.println("Title: " + song.getTitle() + "\nAuthor: " + song.getAuthor());
            FileReader fileReader = new FileReader("song.txt");
            BufferedReader bf = new BufferedReader(fileReader);
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}