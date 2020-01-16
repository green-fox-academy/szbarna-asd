import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class SwearWords {

  public static void main(String[] args) throws IOException {
    String filePath = "asd.txt";
    List<String> swearWords = Arrays.asList("fuck", "bloody", "cock", "shit2", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt");
    int counter = 0;

    try { // Required by Files.readAllLines(filePath);
      Path path = Paths.get("asd.txt");
      List<String> lines = Files.readAllLines(path);

     lines.toArray();


    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }

    System.out.println(counter);
  }
}
