import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Benutzer alex = new Benutzer("Alex", "Pizza");
        Benutzer flo = new Benutzer("Florian", "Test");

        //Den Nutzer nach Passwort fragen:
        Scanner eingabewertBenutzer = new Scanner(System.in);
        System.out.print("Bitte gib dein Benutzernamen ein...");
        String eingabeBenutzername = eingabewertBenutzer.next();
        if (alex.getBenutzername().equals(eingabeBenutzername) ){
            String passwortUser = alex.getPasswort();
            passwortabfrage(passwortUser);
        }
        else{
            if (flo.getBenutzername().equals(eingabeBenutzername)){
                String passwortUser = flo.getPasswort();
                passwortabfrage(passwortUser);
            }
            else {
                System.out.println("Dein Benutzername existiert nicht.");
            }
        }
    }

    public static void passwortabfrage(String passwortUser){
        Scanner eingabewert = new Scanner(System.in);
        System.out.print("Bitte gib ein Passwort zur Überprüfung ein");
        String eingabe = eingabewert.next();
        if (eingabe.equals(passwortUser)){
            System.out.println("Das Passwort ist richtig");
        }
        else {
            System.out.println("Das Passwort ist falsch");
        }
    }
}
