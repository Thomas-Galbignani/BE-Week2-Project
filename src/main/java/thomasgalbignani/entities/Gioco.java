package thomasgalbignani.entities;

public abstract class Gioco {
    public static Gioco getPrice;
    protected String title;
    String id;
    double uscita;
    double price;

    public Gioco(String id, String title, double uscita, double price) {
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

    public double getUscita() {
        return uscita;
    }

    public void setUscita(double uscita) {
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
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", uscita=" + uscita +
                ", price=" + price +
                '}';
    }
}
