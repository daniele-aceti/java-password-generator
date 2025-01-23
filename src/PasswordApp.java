import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {
        Scanner userInfo = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String name = userInfo.nextLine(); //posso avere anche un doppio nome o cognome con next prende solo un token troncatura
        System.out.println("Inserisci il tuo cognome");
        String surName = userInfo.nextLine(); 
        System.out.println("Inserisci il tuo colore preferito");
        String color = userInfo.nextLine();
        System.out.println("Inserisci la tua data di nascita suddivisa in : ");
        System.out.println("giorno");
        int day = userInfo.nextInt(); //giorno
        System.out.println("mese  " + day + "/");//stampa della richiesta mese riportando il giorno in video
        int month = userInfo.nextInt();
        System.out.println("anno  " + day + "/" + month + "/"); //stampa della richiesta anno riportando giorno mese in video
        int year = userInfo.nextInt();
        System.out.println("anno  " + day + "/" + month + "/" + year); //stampa completa della data di nascita
        System.out.println(name + "-" + surName + "-" + color + "-" + (day + month + year));
    }
}