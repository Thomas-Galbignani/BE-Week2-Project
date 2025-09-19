package thomasgalbignani;

import thomasgalbignani.entities.Collezione;
import thomasgalbignani.entities.Genere;
import thomasgalbignani.entities.Piattaforma;

import java.util.Scanner;

public class Application {

    static Scanner scanner = new Scanner(System.in);

    static boolean stop = false;

    public static void main(String[] args) {

        Collezione iTuoigiochi = new Collezione();


        while (!stop) {
            System.out.println("Ciao!");
            System.out.println("premi 1 se vuoi aggiungere un elemento ");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("inserisci il tipoi di gioco");
                    String gameType = scanner.nextLine();
                    System.out.println("inserisci l'id");
                    System.out.println("id: ");
                    String id = scanner.nextLine();
                    System.out.println("inserisci il titolo");
                    System.out.println("titolo: ");
                    String title = scanner.nextLine();
                    System.out.println("inserisci la data di uscita");
                    System.out.println("data di uscita:");
                    String dataDiUscita = scanner.nextLine();

                    System.out.println("inserisci il prezzo");
                    System.out.println("prezzo: ");
                    double prezzo = scanner.nextDouble();

                    System.out.println("inserisci il numero di giocatori ( il minimo è 2 e il massimo è 10 )");
                    int numeroGiocatori = scanner.nextInt();
                    System.out.println("inserisci la durata media di una sessione di gioco (in minutii)");
                    int durataSessione = scanner.nextInt();


                    System.out.println("inserisci la piattaforma sulla quale vorrai giocare");
                    Piattaforma platform = Piattaforma.valueOf(scanner.nextLine());
                    System.out.println("inserisci il genere di gioco al quale vorrai giocare");
                    Genere genere = Genere.valueOf(scanner.next());
                    System.out.println("inserisci la durata standard di una partita ( in ore)");
                    int durataPartita = scanner.nextInt();


                    System.out.println("Premi EX per uscire.");
                    String exit = scanner.nextLine();
                    if (exit.equalsIgnoreCase("EX")) {
                        System.out.println("Programma terminato.");
                    }
            }


        }

    }
}