import java.util.Scanner;

class Lesen {
    public Fach[] datenEinlesen() {
        Fach[] fi = new Fach[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Fach: ");
            String fach = sc.nextLine();
            System.out.println("1 LK, 0 kein LK: ");
            int zlk = Integer.parseInt(sc.nextLine());
            boolean lk;
            lk = (zlk == 1);
            System.out.println("Note: ");
            int note = Integer.parseInt(sc.nextLine());
            Fach f = new Fach(fach, lk, note);
            fi[i] = f;
        }
        sc.close();
        return fi;
    }
}
