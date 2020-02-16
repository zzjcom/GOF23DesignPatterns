package structural.flyweight;

/**
 * 享元类
 */
public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate c);
}


class ConcreteChess implements ChessFlyWeight{

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色:"+color);
        System.out.println("棋子位置:"+c.getX()+"-----"+c.getY());
    }
}
