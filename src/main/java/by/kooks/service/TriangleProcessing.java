
public class TriangleProcessing {


    public static double perimeter(Triangle triangle) {
        return  triangle.getP1().getDistance(triangle.getP2()) + triangle.getP2().getDistance(triangle.getP3()) + triangle.getP1().getDistance(triangle.getP3());
    }
    public static double square(Triangle triangle) {

        double halfPerimeter = (triangle.getP1().getDistance(triangle.getP2()) + triangle.getP2().getDistance(triangle.getP3()) + triangle.getP1().getDistance(triangle.getP3())) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - triangle.getP1().getDistance(triangle.getP2())) * (halfPerimeter - triangle.getP2().getDistance(triangle.getP3())) *
                (halfPerimeter - triangle.getP1().getDistance(triangle.getP3())));
    }
    public boolean isTriangle(Point A, Point B, Point C) {
        return (A.getDistance(B) + B.getDistance(C))>A.getDistance(C)&&
                (A.getDistance(C) + B.getDistance(C))>A.getDistance(B)&&
                 (A.getDistance(B) + A.getDistance(C))>B.getDistance(C);

    }
    public boolean isRightTriangle(Point A, Point B, Point C){
        if (isTriangle(A,B,C))
            return (Math.round(Math.pow(A.getDistance(B),2))+ Math.round(Math.pow(B.getDistance(C),2)) == Math.round(Math.pow(A.getDistance(C),2))||
                    Math.round(Math.pow(A.getDistance(B),2))+ Math.round(Math.pow(A.getDistance(C),2)) == Math.round(Math.pow(B.getDistance(C),2))||
                    Math.round(Math.pow(A.getDistance(C),2))+ Math.round(Math.pow(B.getDistance(C),2)) == Math.round(Math.pow(A.getDistance(B),2)));
        else return false;}

}
