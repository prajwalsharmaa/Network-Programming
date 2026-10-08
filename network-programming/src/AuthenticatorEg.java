import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class AuthenticatorEg {
    static void main() {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(
                        "username",
                        "password".toCharArray()
                );
            }
        });
    }
}
