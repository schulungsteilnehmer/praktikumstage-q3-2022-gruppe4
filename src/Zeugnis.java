public class Zeugnis {
    private int ges = 0;
    private double schnitt;
    private int note;

    public Zeugnis() {

    }

    public double berechneSchnitt(Fach[] faecher) {

        for (int i = 0; i < 8; i++) {
            if (faecher[i].getLk()) {
                note = faecher[i].getNote() * 2;
            } else {
                note = faecher[i].getNote();
            }
            ges += note;
        }

        double x = ges / 10;
        double schnitt1 = (17 - x) / 3;
        schnitt = Math.round(10.0 * schnitt1) / 10.0;
        return schnitt;
    }
}