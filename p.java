import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class p {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter password: ");
        String pass = in.nextLine();

        List<String> commonPasswords = Arrays.asList(
            "123456","1234", "password", "123456789", "12345678",
            "12345", "1234567", "qwerty", "abc123",
            "111111", "123123", "admin", "letmein",
            "welcome", "monkey", "dragon", "master"
        );

        if (commonPasswords.contains(pass.toLowerCase())) {
            System.out.println("[X] Too common. Choose another.");
            return;
        }

        boolean hasUpper  = false;
        boolean hasDigit  = false;
        boolean hasSymbol = false;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c))      hasUpper  = true;
            if (Character.isDigit(c))          hasDigit  = true;
            if (!Character.isLetterOrDigit(c)) hasSymbol = true;
        }

        int score = 0;
        if (pass.length() >= 8)  score++;
        if (pass.length() >= 12) score++;
        if (hasUpper)            score++;
        if (hasDigit)            score++;
        if (hasSymbol)           score++;

        StringBuilder tips = new StringBuilder();
        if (pass.length() < 8) tips.append("\n  - min 8 characters");
        if (!hasUpper)         tips.append("\n  - add uppercase letter");
        if (!hasDigit)         tips.append("\n  - add number");
        if (!hasSymbol)        tips.append("\n  - add symbol (@ # ! ...)");

        if (score <= 2) {
            System.out.println(" Weak password." + tips);
        } else if (score <= 4) {
            System.out.println(" Medium password." + tips);
        } else {
            System.out.println(" Strong password!");
        }
        in.close();
    }

}