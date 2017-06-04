import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoordinatesReader {
    private static Logger logger = LogManager.getLogger(CoordinatesReader.class.getSimpleName());
    public static ArrayList<Double> readFromFile(File fileName) throws WrongFileException,InvalidDataException {
        ArrayList<Double> list = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName.getPath()), StandardCharsets.UTF_8);
            for (String line : lines) {
                Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    list.add(Double.parseDouble(matcher.group()));
                }
            }
            logger.info("Readed " + list.size() + " points  \n\t " + list.toString());
        }
        catch (NoSuchFileException e){
            logger.error("File searching failure: ", e);
            throw new WrongFileException("File's not found: ", e);
        }
        catch (IOException e) {
            logger.error("Data reading failure: ", e);
            throw new InvalidDataException("data reading failure", e);
        }
        return list;
    }
}
