import java.util.ArrayList;

public class TriangleStock {
    private static TriangleStock instance;
    private final ArrayList<TriangleParameters> stock = new ArrayList<>();
    private TriangleStock(){}
    public static TriangleStock getInstance(){
        if (instance == null){instance = new TriangleStock();}
        return instance;
    }
    public void putInStock(TriangleParameters data){
        stock.add(data);
    }
}
