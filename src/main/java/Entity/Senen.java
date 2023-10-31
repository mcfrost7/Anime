package Entity;

public class Senen implements Genre{

    @Override
    public String getGenre() {
        return "Anime genre - Shonen.";
    }

    @Override
    public void plot() {
        System.out.println("The main features of the genre are the male protagonist,\n" +
                "rapid development and dynamics of the plot (this is especially noticeable in comparison with shojo manga).\n" +
                " Works in the shonen genre, as a rule, contain more humorous scenes, concentrate\n" +
                " нon the themes of male friendship, camaraderie, rivalry in life, sports or combat.");
    }

    @Override
    public void hero() {
    System.out.println("The main character is often distinguished by wide eyes, a slight smile and a spiky hairstyle." +
            " Male heroes, as a rule, are always self-confident, brave, care about their comrades, never lose heart and" +
            " never give up (even if the situation seems absolutely hopeless), and also, from the point of view of realism," +
            " have enormous luck. A typical portrait of the main character is a perfectionist or egocentric who stubbornly moves towards his goal");
    }

    @Override
    public void audience() {
        System.out.println("Anime for teenage boys aged approximately 8-10 to 16-18 years old.");
    }
}
