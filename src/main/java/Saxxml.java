import Entity.Adventure;
import Entity.Figter;
import Entity.Romantic;
import Entity.Subgenre;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Saxxml {

    private static ArrayList<Subgenre> animeList = new ArrayList<>();

    public static ArrayList<Subgenre> parse(String path) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File(path), handler);

        return animeList;
    }


    private static class XMLHandler extends DefaultHandler {
        private String genre, animeName, amountOfEpisodes, episodeLength, lastElementName;

        private String setting, age, blackHumor, motivation, amountOfFriends, nameOfAntogonist, mainHero, amountOfCouples, genderOfMC;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElementName.equals("genre"))
                    genre = information;
                else if (lastElementName.equals("animeName"))
                    animeName = information;
                else if (lastElementName.equals("amountOfEpisodes"))
                    amountOfEpisodes = information;
                else if (lastElementName.equals("episodeLength"))
                    episodeLength = information;
                else if (lastElementName.equals("setting"))
                    setting = information;
                else if (lastElementName.equals("age"))
                    age = information;
                else if (lastElementName.equals("blackHumor"))
                    blackHumor = information;
                else if (lastElementName.equals("motivation"))
                    motivation = information;
                else if (lastElementName.equals("amountOfFriends"))
                    amountOfFriends = information;
                else if (lastElementName.equals("nameOfAntogonist"))
                    nameOfAntogonist = information;
                else if (lastElementName.equals("mainHero"))
                    mainHero = information;
                else if (lastElementName.equals("amountOfCouples"))
                    amountOfCouples = information;
                else if (lastElementName.equals("genderOfMC"))
                    genderOfMC = information;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if ((genre != null && !genre.isEmpty()) && (animeName != null && !animeName.isEmpty()) && (amountOfEpisodes != null && !amountOfEpisodes.isEmpty()) && (episodeLength != null && !episodeLength.isEmpty())) {
                if ((setting != null && !setting.isEmpty()) && (age != null && !age.isEmpty()) && (blackHumor != null && !blackHumor.isEmpty())) {
                    animeList.add(new Figter(genre,animeName,amountOfEpisodes,episodeLength, setting, age, blackHumor));
                    age = null;
                    setting = null;
                    blackHumor = null;
                } else if ((motivation != null && !motivation.isEmpty()) && (amountOfFriends != null && !amountOfFriends.isEmpty()) && (nameOfAntogonist != null && !nameOfAntogonist.isEmpty())) {
                   animeList.add(new Adventure(genre,animeName,amountOfEpisodes,episodeLength,motivation,amountOfFriends,nameOfAntogonist));
                    motivation = null;
                    amountOfFriends = null;
                    nameOfAntogonist = null;
                } else if ((mainHero != null && !mainHero.isEmpty()) && (amountOfCouples != null && !amountOfCouples.isEmpty()) && (genderOfMC != null && !genderOfMC.isEmpty())) {
                    animeList.add(new Romantic(genre,animeName,amountOfEpisodes,episodeLength, mainHero, amountOfCouples, genderOfMC));
                    mainHero = null;
                    amountOfCouples = null;
                    genderOfMC = null;
                }
            }

        }
    }
}
