import java.util.Scanner;

//Класс Lab1 описан для работы с классом Point3d
public class Lab1 {
    public static void main(String[] args){
        //Инициализация массива из трёх точек и трёх координат
        Point3d[] points = new Point3d[3];
        double[] coords = new double[3];
        //Создание объекта класса Scanner для считывания координат точек
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            //Итерация в цикле для считывания координат три раза и записи их в массив сначала координат, потом точек
            for(int j = 0; j < 3; j++){
                char coord;
                if(j == 0)coord = 'x';
                else if (j == 1)coord = 'y';
                else coord = 'z';
                System.out.print("Введите координату " + coord + " точки " + (i + 1) + ": ");
                coords[j] = scanner.nextDouble();
            }
            points[i] = new Point3d(coords[0], coords[1], coords[2]);
        }
        //Проверка на совпадение координат точек
        if(points[0].compare(points[1]) || points[0].compare(points[2]) || points[1].compare(points[2])) {
            System.out.println("Одна из точек совпадает с другой!");
            return;
        }
        System.out.println("Площадь треугольника: " + computeArea(points[0], points[1], points[2]));
    }

    //Функция для вычисления площади треугольника по трем точкам с применением формулы Герона.
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3){
        double a = point1.distanceTo(point2);
        double b = point1.distanceTo(point3);
        double c = point2.distanceTo(point3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
