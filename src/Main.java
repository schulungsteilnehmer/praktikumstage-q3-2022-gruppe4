class Main {
    public static void main(String[] args) {
        Lesen l = new Lesen();
        Fach[] faecher = l.datenEinlesen();
        Schuler s = new Schuler();

        Zeugnis z = new Zeugnis();
        System.out.println(z.berechneSchnitt(faecher));

    }
}