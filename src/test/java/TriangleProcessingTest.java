import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TriangleProcessingTest {

    private static Point A;
    private static Point B;
    private static Point C;
    private static Triangle triangle;
    private static TriangleProcessing triangleProcessing;
    @BeforeClass
    public static void initPoints(){
    A = new Point(0,2);
    B = new Point(-2,2);
    C = new Point(-2,0);
    triangle = new Triangle(A,B,C);
    triangleProcessing = new TriangleProcessing();
    }
    @AfterClass
    public static void clearPoints() {
        A = null;
        B = null;
        C = null;
        triangle = null;
        triangleProcessing = null;
    }
    @Test
    public void perimeter()  {
        double actual = TriangleProcessing.perimeter(triangle);
        double expected = 6;
        Assert.assertEquals((int)expected, (int)actual);
    }
    @Test
    public void square() {
        int actual = (int)(Math.round(TriangleProcessing.square(triangle)));
        int expected = 2;
        Assert.assertEquals(expected, (actual));
    }
    @Test
    public void isTriangle() {
    TriangleProcessing triangleprocessing = new TriangleProcessing();
        boolean test = triangleprocessing.isTriangle(A, B, C);
        Assert.assertTrue("Точки лежат на одной прямой", test);
    }
    @Test
    public void isRightTriangle() {
        boolean test = triangleProcessing.isRightTriangle(A,B,C);
        Assert.assertTrue("Треугольник прямоугольным не является", test);
    }
}