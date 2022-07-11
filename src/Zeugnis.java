public class Zeugnis {
    private int ges = 0;
    private double schnitt;
    private int note;
    private boolean versetzung;

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
            if (faecher[i].getNote() < 6) {
                zaehler++;
            }
            ges += note;
        }

        if (zaehler > 2) {
            versetzung = false;
        } else {
            versetzung = true;
        }
        double x = ges / 10;
        double schnitt1 = (17 - x) / 3;
        schnitt = Math.round(10.0 * schnitt1) / 10.0;
        return schnitt;
    }

    public void konsolenAusgabe(Fach[] faecher, Schuler s) {
        int ufehltage = s.getFehltage() - s.getEfehltage();
        System.out.println("Name des Schülers: " + s.getName());
        System.out.println("Zeugnisausstellungsdatum: " + s.getDatum());
        System.out.println("Fehltage: " + s.getFehltage());
        System.out.println("davon unentschuldigte Fehltage: " + ufehltage);
        for (int i = 0; i < 8; i++) {
            System.out.println(faecher[i].getFach() + ": " + faecher[i].getNote());
        }
        System.out.println("Notendurchschnitt: " + schnitt);
        if (ufehltage >= 30) {
            versetzung = false;
        }
        if (versetzung) {
            System.out.println("Der Schüler wird versetzt");
        } else {
            System.out.println("Der Schüler wird nicht versetzt");
        }
    }
}