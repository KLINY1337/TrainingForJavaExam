package ticket23;

public class CircleFactory extends GeomFiguresFactory {

    @Override
    public Circle createFigure() {
        System.out.println("Круг создан");
        return new Circle();
    }
}
