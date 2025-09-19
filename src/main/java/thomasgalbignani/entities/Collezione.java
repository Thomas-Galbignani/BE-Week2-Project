package thomasgalbignani.entities;

import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class Collezione {


    HashMap<String, Gioco> collection = new HashMap<>();

    public void add(Gioco game) {

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

}

