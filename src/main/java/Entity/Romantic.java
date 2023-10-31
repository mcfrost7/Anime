package Entity;

public class Romantic extends Subgenre{

    protected String mainHero;

    protected String amountOfCouples;

    protected  String genderOfMC;

    public String getMainHero() {
        return mainHero;
    }

    public void setMainHero(String mainHero) {
        this.mainHero = mainHero;
    }

    public String getAmountOfCouples() {
        return amountOfCouples;
    }

    public void setAmountOfCouples(String amountOfCouples) {
        this.amountOfCouples = amountOfCouples;
    }

    public String getGenderOfMC() {
        return genderOfMC;
    }

    public void setGenderOfMC(String genderOfMC) {
        this.genderOfMC = genderOfMC;
    }

    public Romantic(String genre,String animeName, String amountOfEpisodes, String episodeLength, String mainHero, String amountOfCouples, String genderOfMC) {
        super(animeName, amountOfEpisodes, episodeLength);
        if ("Senen".equals(genre)) {
            this.genre = new Senen();
        } else if ("Shojo".equals(genre)) {
            this.genre = new Shojo();
        } else if ("Kodomo".equals(genre)) {
            this.genre = new Kodomo();
        } else {
            throw new IllegalStateException("Unexpected value: " + genre);
        }
        this.mainHero = mainHero;
        this.amountOfCouples = amountOfCouples;
        this.genderOfMC = genderOfMC;
    }

    @Override
    public void printInfo() {
        System.out.println("---Romantic---");
        System.out.println(genre.getGenre());
        System.out.println("Name: " + getAnimeName());
        System.out.println("Episodes: " + getAmountOfEpisodes());
        System.out.println("Length: " + getEpisodeLength());
        System.out.println("Genre: " + getGenre());
        System.out.println("Name of main hero: " + getMainHero());
        System.out.println("Amount of couples: " + getAmountOfCouples());
        System.out.println("Gender of main character: " + getGenderOfMC());
        System.out.print("Typical hero: ");
        genre.hero();
        System.out.print("Typical plot: ");
        genre.plot();
        System.out.print("Typical audience: ");
        genre.audience();
    }
}
