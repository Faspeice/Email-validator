import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",
                "root@localhost",
                "bug@@@com.ru",
                "@val.ru",
                "Just Text2"
        };

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        for (String email : emails) {
            System.out.println("Email: " + email + " is valid: " + pattern.matcher(email).matches());
        }
    }
}