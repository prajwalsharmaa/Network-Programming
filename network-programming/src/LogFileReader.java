import java.io.*;

public class LogFileReader {
    static void main() {
        try {
            FileInputStream input =
                    new FileInputStream("E:\\WorkSpace\\logs\\log.txt");

            InputStreamReader ins = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(ins);

            int count404 = 0;
            int count401 = 0;
            int count200 = 0;

            for (String line = reader.readLine();
                 line != null;
                 line = reader.readLine()) {
                System.out.println(line);


                if (line.contains("404")) {
                    count404++;
                }

                if (line.contains("401")) {
                    count401++;
                }

                if (line.contains("200")) {
                    count200++;
                }
            }
            System.out.println();
            System.out.println("Status code responses:");
            System.out.println("404: " + count404);
            System.out.println("401: " + count401);
            System.out.println("200: " + count200);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}