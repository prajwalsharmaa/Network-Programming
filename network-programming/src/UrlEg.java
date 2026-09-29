import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlEg {
    static void main(){
        try {
            URL url1 = new URL("https://example.com");
            URLConnection con = url1.openConnection();
            InputStream ins = con.getInputStream();
            InputStreamReader isr = new InputStreamReader(ins);

            BufferedReader br = new BufferedReader(isr);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println(e);
        }//Program to read data from url using openConnection method.
    }
}//url vs uri and OpenStream method
