
import org.junit.Test;
import java.io.File;
import java.util.ArrayList;

public class AppTest {

    @Test
    public void mainTest() throws Exception {
        File myFile = new File("src\\main\\java\\by\\kooks\\files\\source_file.txt");
        ArrayList<Double> allCoordinates = CoordinatesReader.readFromFile(myFile);
        ArrayList<Triangle> allTriangles = TriangleCreator.createTrianglesFromPoints(allCoordinates);
        Triangle triangle0 = allTriangles.get(0);
        triangle0.setP1(new Point(allCoordinates.get(6), allCoordinates.get(7)));
        triangle0.setP2(new Point(allCoordinates.get(8), allCoordinates.get(9)));
        triangle0.setP3(new Point(allCoordinates.get(10), allCoordinates.get(11)));
        System.out.println(triangle0.equals(allTriangles.get(1)));
        double square = TriangleProcessing.square(allTriangles.get(0));
        double perimeter = TriangleProcessing.perimeter(allTriangles.get(0));
        TriangleParameters parameters0 = new TriangleParameters(square,perimeter);
        TriangleStock stock = TriangleStock.getInstance();
        stock.putInStock(parameters0);
        square = TriangleProcessing.square(allTriangles.get(1));
        perimeter = TriangleProcessing.perimeter(allTriangles.get(1));
        TriangleParameters parameters1 = new TriangleParameters(square,perimeter);
        stock.putInStock(parameters1);
    }
}
