public class TriangleEvent {
    private Triangle source;
    public TriangleEvent(Triangle source){
        this.source = source;
    }
    public Triangle getSource() {
        return source;
    }
}
