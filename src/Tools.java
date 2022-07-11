import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tools {
    public boolean datumTesten(Schuler s) {
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        df.setLenient(false);
        try {
            df.parse(s.getDatum());
            return true;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean noteTesten(int n) {
        if (n > 0 && n < 15) {
            return true;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public boolean nameTesten(Schuler s) {
        Pattern pattern = Pattern.compile("[a-zA-Z-\\s]+");
        Matcher matcher = pattern.matcher(s.getName());
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean fachTesten(Fach f) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(f.getFach());
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

}
