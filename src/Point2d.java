//Класс, полученный из задания
public class Point2d {
    //Приватные поля, не унаследуются, но необходимо сохранить единый стиль для наследования методов.
    private double xCoord;
    private double yCoord;
    public Point2d(double x, double y){
        xCoord = x;
        yCoord = y;
    }
    public Point2d(){
        this(0.0, 0.0);
    }
    //Геттеры и сеттеры тоже унаследутся
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public void setX(double x){
        xCoord = x;
    }
    public void setY(double y) {
        yCoord = y;
    }
}
