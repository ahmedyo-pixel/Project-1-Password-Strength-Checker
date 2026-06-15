import java.util.Scanner;

public class password2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = in.nextLine();

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;

        
        for (char c : pass.toCharArray()) {

            if (Character.isUpperCase(c))
                hasUpper = true;

            else if (Character.isDigit(c))
                hasDigit = true;

            else if (!Character.isLetterOrDigit(c))
                hasSymbol = true;
        }

        // Strong
        if (pass.length() >= 8 && hasUpper && hasDigit && hasSymbol) {

            System.out.println("Strong password");

        }
        // Medium
        else if (pass.length() > 8 || pass.length() > 4) {

            System.out.print("Medium password. Missing: ");

            if (!hasUpper)
                System.out.print("uppercase letter ");

            if (!hasDigit)
                System.out.print("number ");

            if (!hasSymbol)
                System.out.print("symbol ");

            if (pass.length() < 8)
                System.out.print("8 characters");

        }
        // Weak
        else {

            System.out.println(
                "Weak password. Must contain:\n" +
                "- At least 8 characters\n" +
                "- Uppercase letter\n" +
                "- Number\n" +
                "- Symbol"
            );
        }

        in.close();
    }
}