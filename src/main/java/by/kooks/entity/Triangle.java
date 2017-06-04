public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;
    private TriangleObserver observer;
public Triangle(Point p1,Point p2, Point p3){
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
}
    public void setP1(Point p1) {
        this.p1 = p1;
        notifyObservers();
    }
    public void setP2(Point p2) {
        this.p2 = p2;
        notifyObservers();
    }
    public void setP3(Point p3) {
        this.p3 = p3;
        notifyObservers();
    }
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public Point getP3() {
        return p3;
    }
    public void addObserver(TriangleObserver observer) {
        this.observer = observer;
        observer.addObservable(this);
    }
    public void removeObserver() {
        observer.removeObservable(this);
        observer = null;
    }
    private void notifyObservers() {
        if(observer != null) {
            observer.handleEvent(new TriangleEvent(this));
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        if (p1 != null ? !p1.equals(triangle.p1) : triangle.p1 != null) return false;
        if (p2 != null ? !p2.equals(triangle.p2) : triangle.p2 != null) return false;
        return p3 != null ? p3.equals(triangle.p3) : triangle.p3 == null;
    }
    @Override
    public int hashCode() {
        int result = p1 != null ? p1.hashCode() : 0;
        result = 31 * result + (p2 != null ? p2.hashCode() : 0);
        result = 31 * result + (p3 != null ? p3.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "New triangle is built from next points: " +
                "Point1" + p1 + ", Point2" + p2 + ", Point3" + p3;
    }
}
