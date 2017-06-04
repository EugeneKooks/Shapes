import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

public class TriangleCreator {
    private static Logger logger = LogManager.getLogger(TriangleCreator.class.getSimpleName());
    public static  ArrayList<Triangle> createTrianglesFromPoints (ArrayList<Double> list){
        ArrayList<Triangle> allTriangles = new ArrayList<>();
        for (int i = 0; i<list.size();i=i+6){
            Point point1 = new Point(list.get(i),list.get(i+1));
            Point point2 = new Point(list.get(i+2),list.get(i+3));
            Point point3 = new Point(list.get(i+4),list.get(i+5));
            Triangle newBornTriangle = new Triangle(point1,point2,point3);
            allTriangles.add(newBornTriangle);
            logger.info(allTriangles.size() + " triangle(s) 've been created from points");
           }
return allTriangles;
    }}

