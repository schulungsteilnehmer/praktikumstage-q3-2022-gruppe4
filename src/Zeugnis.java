public class Zeugnis {
    private int ges = 0;
    private double schnitt;
    private int note;
    private String versetzung;

    public Zeugnis() {

    }

    public double berechneSchnitt(Fach[] faecher) {
        int zaehler = 0;
        for (int i = 0; i < 8; i++) {
            if (faecher[i].getLk()) {
                note = faecher[i].getNote() * 2;
            } else {
                note = faecher[i].getNote();
            }
            ges += note;
        }
        if (zaehler > 2) {
            versetzung = "Schüler erfüllt die Versetzungskriterien nicht";
        } else {
            versetzung = "Schüler erfüllt die Versetzungskriterien";
        }
        double x = ges / 10;
        double schnitt1 = (17 - x) / 3;
        schnitt = Math.round(10.0 * schnitt1) / 10.0;
        return schnitt;
    }

    public void konsolenAusgabe(Fach[] faecher) {
        Lesen l = new Lesen();
        System.out.println("Name des Schülers: " + l.getName());
        System.out.println("Zeugnisausstellungsdatum: " + l.getDatum());
        for (int i = 0; i < 8; i++) {
            System.out.println(faecher[i].getFach() + ": " + faecher[i].getNote());
        }
        System.out.println("Notendurchschnitt: " + schnitt);
        System.out.println(versetzung);
    }
}