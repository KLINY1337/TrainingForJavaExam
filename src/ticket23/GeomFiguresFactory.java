package ticket23;

public abstract class GeomFiguresFactory {
    public abstract Figure createFigure();
}

    /*GeomFiguresFactory factory1, factory2;
    factory1 = new CircleFactory();
    factory2 = new RectangleFactory();
    factory1.createFigure(); // Круг создан
    factory2.createFigure(); // Прямоугольник создан*/

// Разработайте класс иерархию классов Геометрическая фигура, Прямоугольник, Круг. Используйте паттер Фабрика