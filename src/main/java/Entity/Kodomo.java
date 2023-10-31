package Entity;

public class Kodomo implements Genre{
    @Override
    public String getGenre() {
        return "Anime genre - Kodomo.";
    }

    @Override
    public void hero() {
        System.out.println("The main characters are often characters from fairy tales.");
    }

    @Override
    public void plot() {
        System.out.println("\n" +
                "The Kodomo genre is characterized by film adaptations of children's fairy tales, a simple and " +
                "understandable plot, the absence of scenes of violence and an abundance of humor.");
    }

    @Override
    public void audience() {
        System.out.println("Target audience: children under 10-11 years of age.");
    }
}
