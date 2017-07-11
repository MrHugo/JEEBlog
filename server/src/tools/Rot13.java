package tools;

/**
 * Created by Valentin Barat on 11/07/2017.
 * Please report any bug to valentin.barat@epita.fr.
 */
public class Rot13
{
    public static String apply(String txt)
    {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);

            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;

            res.append(c);
        }

        return res.toString();
    }
}
