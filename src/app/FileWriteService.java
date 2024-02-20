package app;
import utils.Const;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileWriteService {
    public static String toFile(String text, String fileName) {
        try (FileOutputStream fout =
                     new FileOutputStream(Const.BASE_PATH + fileName + ".txt")) {
            byte[] arr = text.getBytes();
            fout.write(arr, 0, arr.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return "File created!";
    }
}
