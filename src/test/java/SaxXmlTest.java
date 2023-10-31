import Entity.Romantic;
import Entity.Subgenre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SaxXmlTest {
    @Test
    public void shouldAnime()
    {
        ArrayList<Subgenre> anime = new ArrayList<>();
        try
        {
            anime = Saxxml.parse("forTesting.xml");
        }
        catch(Exception e) { System.out.println("Error!"); }
        ArrayList<Subgenre> test = makeResult();
        Assertions.assertTrue(anime.get(0).getGenre().equals(test.get(0).getGenre()));
        Assertions.assertTrue(anime.get(0).getAnimeName().equals(test.get(0).getAnimeName()));
        Assertions.assertTrue(anime.get(0).getAmountOfEpisodes().equals(test.get(0).getAmountOfEpisodes()));
        Assertions.assertTrue(anime.get(0).getEpisodeLength().equals(test.get(0).getEpisodeLength()));

    }

    ArrayList<Subgenre> makeResult()
    {
        ArrayList<Subgenre> test = new ArrayList<>();
        Romantic roman1 = new Romantic("Shojo", "Toradora", "1", "90", "Toro", "2", "Toro");
        test.add(roman1);
        Romantic roman2 = new Romantic("Shojo", "Horimia", "12", "24", "Hori", "4", "W");
        test.add(roman2);
        return test;
    }
}
