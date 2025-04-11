import org.w3c.dom.ls.LSOutput;

public class testCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("green",3.5 , 4);
        System.out.println(cylinder.getVolume());
    }
}
