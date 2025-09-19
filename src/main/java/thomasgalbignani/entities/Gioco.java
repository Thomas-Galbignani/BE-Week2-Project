package thomasgalbignani.entities;

public abstract class Gioco {
    public static Gioco getPrice;
    protected String title;
    protected String id;
    protected String uscita;
    protected double price;

    public Gioco(String id, String title, String uscita, double price) {
        this.id = id;
        this.title = title;
        this.uscita = uscita;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUscita() {
        return uscita;
    }

    public void setUscita(String uscita) {
        this.uscita = uscita;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gioco{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", uscita='" + uscita + '\'' +
                ", price=" + price +
                '}';
    }
}
