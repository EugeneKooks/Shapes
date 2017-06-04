import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleParameters {

    private static Logger logger = LogManager.getLogger(TriangleParameters.class.getSimpleName());
        private double square;
        private double perimeter;
            public TriangleParameters(double square, double perimeter) {
            this.square = square;
            this.perimeter = perimeter;
            logger.info("Triangle's parameters: " + "square = " + this.square + ", perimeter = " + this.perimeter);
        }
    @Override
    public String toString() {
        return "Triangle's parameters are: "+   "square =" + this.square + ", perimeter =" + this.perimeter + '}';
    }
        }

