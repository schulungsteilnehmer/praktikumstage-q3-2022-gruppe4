import java.util.Scanner;

public class Schuler {
    private String name;
    private String datum;
    private int fehltage;
    private int efehltage;

    public Schuler() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Datum: ");
        datum = sc.nextLine();
        System.out.println("Fehltage: ");
        fehltage = Integer.parseInt(sc.nextLine());
        System.out.println("entschuldigte Fehltage: ");
        efehltage = Integer.parseInt(sc.nextLine());
        sc.close();
    }

    public String getName() {
        return name;
    }

    public String getDatum() {
        return datum;
    }

    public int getFehltage() {
        return fehltage;
    }

    public int getEfehltage() {
        return efehltage;
    }
}
