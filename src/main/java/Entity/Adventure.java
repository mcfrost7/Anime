package Entity;

public class Adventure extends Subgenre{

    protected String motivation;

    protected String amountOfFriends;

    protected String nameOfAntogonist;

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public String getAmountOfFriends() {
        return amountOfFriends;
    }

    public void setAmountOfFriends(String amountOfFriends) {
        this.amountOfFriends = amountOfFriends;
    }

    public String getNameOfAntogonist() {
        return nameOfAntogonist;
    }

    public void setNameOfAntogonist(String nameOfAntogonist) {
        this.nameOfAntogonist = nameOfAntogonist;
    }

    public Adventure(String genre, String animeName, String amountOfEpisodes, String episodeLength, String motivation, String amountOfFriends, String nameOfAntogonist) {
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
        this.motivation = motivation;
        this.amountOfFriends = amountOfFriends;
        this.nameOfAntogonist = nameOfAntogonist;
    }

    @Override
    public void printInfo() {
        System.out.println("---Adventure---");
        System.out.println(genre.getGenre());
        System.out.println("Name: " + getAnimeName());
        System.out.println("Episodes: " + getAmountOfEpisodes());
        System.out.println("Length: " + getEpisodeLength());
        System.out.println("Genre: " + getGenre());
        System.out.println("Motivation: " + getMotivation());
        System.out.println("Amount of Friends: " + getAmountOfFriends());
        System.out.println("Name of Antogonist: " + getNameOfAntogonist());
        System.out.print("Typical hero: ");
        genre.hero();
        System.out.print("Typical plot: ");
        genre.plot();
        System.out.print("Typical audience: ");
        genre.audience();
    }
}
