import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {

        //Validasi kata menggunakan regex
        Pattern pattern = Pattern.compile(" ", Pattern.CASE_INSENSITIVE);

        // Inputan sebuaah kalimat
        Matcher matcher = pattern.matcher("Ini adalah sekolah QA Batch 17");

        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
