public class Test {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Lesen l = new Lesen();
        l.metaEinlesen();

        Fach[] faecher = {
                new Fach("Mathe", true, 12),
                new Fach("Informatik", true, 8),
                new Fach("Erdkunde", false, 14),
                new Fach("Physik", false, 6),
                new Fach("Englisch", false, 9),
                new Fach("Sport", false, 15),
                new Fach("Geschichte", false, 3),
                new Fach("Darstellendes Spiel", false, 15)
        };

        Zeugnis z = new Zeugnis();
        System.out.println(z.berechneSchnitt(faecher));
        z.konsolenAusgabe(faecher);
    }

    public static void test2() {
        Lesen l = new Lesen();
        l.metaEinlesen();
        System.out.println(l.getDatum());

        Tools t = new Tools();
        System.out.println(t.datumTesten());
    }
}
