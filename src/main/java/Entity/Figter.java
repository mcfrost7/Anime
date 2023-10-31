package Entity;

public class Figter extends Subgenre{

    protected String setting;

    protected String age;

    protected String blackHumor;

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBlackHumor() {
        return blackHumor;
    }

    public void setBlackHumor(String blackHumor) {
        this.blackHumor = blackHumor;
    }

    public Figter(String genre, String animeName, String amountOfEpisodes, String episodeLength, String setting, String age, String blackHumor) {
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
        this.setting = setting;
        this.age = age;
        this.blackHumor = blackHumor;
    }


    @Override
    public void printInfo() {
        System.out.println("---Figter---");
        System.out.println(genre.getGenre());
        System.out.println("Name: " + getAnimeName());
        System.out.println("Episodes: " + getAmountOfEpisodes());
        System.out.println("Length: " + getEpisodeLength());
        System.out.println("Genre: " + getGenre());
        System.out.println("Setting: " + getSetting());
        System.out.println("Age limit: " + getAge());
        System.out.println("Black humor: " + getBlackHumor());
        System.out.print("Typical hero: ");
        genre.hero();
        System.out.print("Typical plot: ");
        genre.plot();
        System.out.print("Typical audience: ");
        genre.audience();
    }
}
