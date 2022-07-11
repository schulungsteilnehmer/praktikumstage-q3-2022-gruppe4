class Main {
    public static void main(String[] args) {
        Lesen l = new Lesen();
        Fach[] faecher = l.datenEinlesen();

        Zeugnis z = new Zeugnis();
        System.out.println(z.berechneSchnitt(faecher));
        
    }
}