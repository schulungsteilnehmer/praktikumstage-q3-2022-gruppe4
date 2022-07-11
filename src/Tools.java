import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Tools {
    public boolean datumTesten() {
        Lesen l = new Lesen();
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        df.setLenient(false);
        try {
            df.parse(l.getDatum());
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    // public boolean noteTesten() {

    // }
}
