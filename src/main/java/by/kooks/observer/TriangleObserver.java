import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class TriangleObserver implements Observer{
    private static Logger logger = LogManager.getLogger(TriangleObserver.class.getSimpleName());

    private ArrayList<Triangle> list = new ArrayList<>();
    @Override
    public void handleEvent(TriangleEvent event) {
        Triangle triangle = event.getSource();
        double square = TriangleProcessing.square(triangle);
        double perimeter = TriangleProcessing.perimeter(triangle);
        TriangleParameters parameters = new TriangleParameters(square,perimeter);
        TriangleStock stock = TriangleStock.getInstance();
        stock.putInStock(parameters);
        logger.info("Changed "+ triangle.toString());
    }
    public void addObservable(Triangle triangle) {
        list.add(triangle);
    }
    public void removeObservable(Triangle triangle) {
        list.remove(triangle);
    }
}
