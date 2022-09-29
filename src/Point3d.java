//Класс трёхмерной точки в пространстве.
public class Point3d {
    //Объявляем переменные координат привантно, чтобы к ним не было доступа вне класса
    private double x, y, z;

    //Конструктор класса
    Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Базовый конструктор класса
    Point3d(){
        this(0.0, 0.0, 0.0);
    }

    //Геттеры
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    //Сеттеры
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }

    //Сравнивает объект с другим объектом, подаваемым через аргумент, по значению.
    public boolean compare(Point3d point){
        return (this.x == point.x && this.y == point.y && this.z == point.z);
    }

    //Возвращает геометрическое расстояние между двумя точками.
    public double distanceTo(Point3d point){
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2) + Math.pow(this.z - point.z, 2));
    }
}
