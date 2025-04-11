//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(2.3f, 4.5f,4.2f,4.5f);
        p.move();
        System.out.println(p.getX());
    }
}