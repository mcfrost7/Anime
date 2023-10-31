package Entity;

public abstract class Subgenre {

    protected Genre genre;

    protected String animeName;

    protected String amountOfEpisodes;

    protected String episodeLength;

    public Subgenre(String animeName, String amountOfEpisodes, String episodeLength) {
        this.animeName = animeName;
        this.amountOfEpisodes = amountOfEpisodes;
        this.episodeLength = episodeLength;
    }

    protected Subgenre() {
    }

    public String getGenre() {
        return genre.getGenre();
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public String getAmountOfEpisodes() {
        return amountOfEpisodes;
    }

    public void setAmountOfEpisodes(String amountOfEpisodes) {
        this.amountOfEpisodes = amountOfEpisodes;
    }

    public String getEpisodeLength() {
        return episodeLength;
    }

    public void setEpisodeLength(String episodeLength) {
        this.episodeLength = episodeLength;
    }

    public void hero(){genre.hero();};
    public void plot(){genre.plot();}
    public void audience(){genre.audience();}

    public abstract void printInfo();

}
