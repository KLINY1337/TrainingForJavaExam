package ticket23;

import java.awt.*;

public class RectangleFactory extends GeomFiguresFactory {

    @Override
    public Rectangle createFigure() {
        System.out.println("Прямоугольник создан");
        return new Rectangle();
    }
}
