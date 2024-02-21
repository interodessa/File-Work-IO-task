package app;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileReadService {
    public String fromFile(String file) {
        try (final BufferedReader buffer = new BufferedReader(new InputStreamReader(
                new FileInputStream(Const.BASE_PATH + file + ".txt")))) {

            String textFromFale;
            StringBuilder stringBuilder = new StringBuilder();
            while ((textFromFale = buffer.readLine()) != null) {
                stringBuilder.append(textFromFale).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
