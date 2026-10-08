import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoderEg {
    static void main() {
        String text = "Hello World & Java";

        String encoded = URLEncoder.encode(text, StandardCharsets.UTF_8);

        System.out.println(encoded);
    }
}
