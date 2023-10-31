package Entity;

public class Shojo implements Genre{
    @Override
    public String getGenre() {
        return "Anime genre - Shoujo.";
    }

    @Override
    public void hero() {
        System.out.println("The main character most often appears before the audience (readers) in the image of a sweet," +
                " inexperienced and good princess. Embarrassment and constant heartache are integral allies of almost every girl. ");
    }

    @Override
    public void plot() {
        System.out.println("The plot of shoujo is dominated by romance and, in general, the development of relationships" +
                " between characters, which, as a rule, are much more complicated than in shonen. Side romances, by the way," +
                " are very often same-sex: either women are more tolerant of homosexuality, or they are just so much a fan of the " +
                "“forbidden love” trope. Clothes and food are often mentioned, which can serve as the main theme of entire episodes.");
    }

    @Override
    public void audience() {
        System.out.println("Anime and manga for older girls and girls from 12 to 16-18 years old.");
    }
}
