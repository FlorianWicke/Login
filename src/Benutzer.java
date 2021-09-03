public class Benutzer {
    String benutzername;
    String passwort;

    public Benutzer(String benutzername, String passwort){
        this.benutzername = benutzername;
        this.passwort = passwort;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
}
