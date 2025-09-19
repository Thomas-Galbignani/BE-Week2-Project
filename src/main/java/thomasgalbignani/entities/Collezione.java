package thomasgalbignani.entities;

import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Collezione {


    HashMap<String, Gioco> collection = new HashMap<>();
    int numeroDiGiochiTotali = collection.size();
    double prezzoPiùAlto = Double.MAX_VALUE;

    public void add(Videogame game) {

        if (!collection.containsKey(game.id)) {
            collection.put(game.id, game);
        } else {
            System.out.println("NO");
        }

    }

    public void add(Boardgame game) {

        if (!collection.containsKey(game.id)) {
            collection.put(game.id, game);
        } else {
            System.out.println("NO");
        }

    }

    public Gioco searchById(String id) {
        return collection.get(id);

    }

    public List<Gioco> searchByPrice(double price) {
        Predicate<Gioco> prezzoMinoreDiQuelloCercato = gioco -> gioco.getPrice() < price;
        return collection.values().stream().filter(prezzoMinoreDiQuelloCercato).toList();
    }

    public List<Boardgame> searchByNumersOfPlayers(int players) {

        Predicate<Gioco> controllaSeDaTavola = gioco -> gioco instanceof Boardgame;
        List<Boardgame> allBoardgames = (List<Boardgame>) collection.values().stream()
                .filter(controllaSeDaTavola).map(gioco -> (Boardgame) gioco).toList();
        Predicate<Boardgame> numeroDiGiocatori = gioco -> gioco.getPlayers() == players;
        return allBoardgames.stream().filter(numeroDiGiocatori).toList();


    }

    public void removeById(Gioco id) {
        collection.remove(id);

    }

    public void replaceGameById(String id, Gioco game) {
        collection.replace(id, game);
    }

    @Override
    public String toString() {
        return "Collezione{" +
                "collection=" + collection +
                '}';
    }

    public double getMediaDeiPrezzi() {
        return collection.values().stream().collect(Collectors.averagingDouble(Gioco::getPrice));
        // l'alternativa è fare un ciclo for normale per andare a verificare ogni singolo prezzo e poi dopo andarli a sommare tutti
        // cosi come la quantità di giochi presenti, salvarsi i due valori in due variabili distinte
        // poi per fare la media fare: sommaPrezzi(es) / numeroDiGiochiTotali
    }

    public void getStatistics() {
        System.out.println("il numero totale di videogiochi è : " + numeroDiGiochiTotali +
                " " + "la media di tutti i prezzi dei giochi è:" + getMediaDeiPrezzi());
    }


}

