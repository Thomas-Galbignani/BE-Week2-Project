package thomasgalbignani.entities;

public class Videogame extends Gioco {

    Piattaforma platform;
    int duration;
    Genere genere;


    public Videogame(String id, String title, String uscita, double price, Piattaforma platform, int duration, Genere genere) {
        super(id, title, uscita, price);
        this.platform = platform;
        this.duration = duration;
        this.genere = genere;
    }


    public Piattaforma getPlatform() {
        return platform;
    }

    public void setPlatform(Piattaforma platform) {
        this.platform = platform;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
}
