package thomasgalbignani.entities;

public class Boardgame extends Gioco {

    int players;
    int duration;


    public Boardgame(String id, String title, double uscita, double price, int players, int duration) {
        super(id, title, uscita, price);
        this.players = players;
        this.duration = duration;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
