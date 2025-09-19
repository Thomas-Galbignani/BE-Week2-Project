package thomasgalbignani;

import thomasgalbignani.entities.*;

import java.util.Scanner;

public class Application {

    static Scanner scanner = new Scanner(System.in);
    static boolean stop = false;
    static Collezione iTuoigiochi = new Collezione();

    public static void main(String[] args) {


        while (!stop) {
            System.out.println("Ciao!");
            System.out.println("premi 1 se vuoi aggiungere un elemento ");
            System.out.println("premi 2 per visualizzare le statistiche della collezione");

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
//                    System.out.println("inserisci il tipoi di gioco");
//                    String gameType = scanner.nextLine();
//                    System.out.println("inserisci l'id");
//                    System.out.println("id: ");
//                    String id = scanner.nextLine();
//                    System.out.println("inserisci il titolo");
//                    System.out.println("titolo: ");
//                    String title = scanner.nextLine();
//                    System.out.println("inserisci la data di uscita");
//                    System.out.println("data di uscita:");
//                    String dataDiUscita = scanner.nextLine();
//
//                    System.out.println("inserisci il prezzo");
//                    System.out.println("prezzo: ");
//                    double prezzo = scanner.nextDouble();
//
//                    System.out.println("inserisci il numero di giocatori ( il minimo è 2 e il massimo è 10 )");
//                    int numeroGiocatori = scanner.nextInt();
//                    System.out.println("inserisci la durata media di una sessione di gioco (in minutii)");
//                    int durataSessione = scanner.nextInt();
//
//
//                    System.out.println("inserisci la piattaforma sulla quale vorrai giocare");
//                    Piattaforma platform = Piattaforma.valueOf(scanner.nextLine());
//                    System.out.println("inserisci il genere di gioco al quale vorrai giocare");
//                    Genere genere = Genere.valueOf(scanner.next());
//                    System.out.println("inserisci la durata standard di una partita ( in ore)");
//                    int durataPartita = scanner.nextInt();
//
//
//                    System.out.println("Premi EX per uscire.");
//                    String exit = scanner.nextLine();
//                    if (exit.equalsIgnoreCase("EX")) {
//                        System.out.println("Programma terminato.");
//                    }

                    aggiungiGioco();
                    break;
                case 2:
                    iTuoigiochi.getStatistics();
                    break;

            }


        }

    }

    private static void aggiungiGioco() {

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Titolo: ");
        String title = scanner.nextLine();

        System.out.print("Data di uscita: ");
        String dataDiUscita = scanner.nextLine();

        System.out.print("Prezzo: ");
        double prezzo = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Tipo di gioco (Videogame/Boardgame): ");
        String gameType = scanner.nextLine();

        if (gameType.equalsIgnoreCase("Videogame")) {
            System.out.print("Piattaforma (" + java.util.Arrays.toString(Piattaforma.values()) + "): ");
            Piattaforma platform = Piattaforma.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Genere (" + java.util.Arrays.toString(Genere.values()) + "): ");
            Genere genere = Genere.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Durata standard (in ore): ");
            int durataPartita = scanner.nextInt();
            scanner.nextLine();

            Videogame videogame = new Videogame(id, title, dataDiUscita, prezzo, platform, durataPartita, genere);
            iTuoigiochi.add(videogame);
            System.out.println("Videogame aggiunto con successo.");

        } else if (gameType.equalsIgnoreCase("Boardgame")) {
            System.out.print("Numero di giocatori (2-10): ");
            int numeroGiocatori = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Durata media sessione (in minuti): ");
            int durataSessione = scanner.nextInt();
            scanner.nextLine();

            Boardgame boardgame = new Boardgame(id, title, dataDiUscita, prezzo, numeroGiocatori, durataSessione);
            iTuoigiochi.add(boardgame);
            System.out.println("Boardgame aggiunto con successo.");

        } else {
            System.out.println("Tipo di gioco non riconosciuto.");
        }
    }
}