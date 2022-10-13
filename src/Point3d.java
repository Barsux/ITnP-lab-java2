//Класс трёхмерной точки в пространстве наследуемый от двумерной точки
public class Point3d extends Point2d {
    //Объявляем переменные координат привантно, чтобы к ним не было доступа вне класса. Объявляем ещё раз, потому что они не наследовались от двумерной.
    private double xCoord;
    private double yCoord;
    private double zCoord;
    //Конструктор класса тоже делаем заново
    Point3d(double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }
    //Базовый конструктор класса
    Point3d(){
        this(0.0, 0.0, 0.0);
    }
    //Новый геттер
    public double getZ() {
        return zCoord;
    }
    //Новый сеттер
    public void setZ(double z) {
        this.zCoord = z;
    }
    //Сравнивает объект с другим объектом, подаваемым через аргумент, по значению.
    public boolean compare(Point3d point){
        return (this.xCoord == point.getX() && this.yCoord == point.getY() && this.zCoord == point.getZ());
    }
    //Возвращает геометрическое расстояние между двумя точками.
    public double distanceTo(Point3d point){
        return Math.sqrt(Math.pow(this.xCoord - point.getX(), 2) + Math.pow(this.yCoord - point.getY(), 2) + Math.pow(this.zCoord - point.getZ(), 2));
    }
}
