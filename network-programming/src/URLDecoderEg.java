import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class URLDecoderEg {
    static void main() {
        String encoded = "Hello+World+%26+Java";

        String decoded = URLDecoder.decode(encoded, StandardCharsets.UTF_8);

        System.out.println(decoded);
    }
}
