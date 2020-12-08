package stqa.homework.ek;

public class Point {

 public static void main (String [] arg) {

   PointCoordinates p1 = new PointCoordinates(2,5);
   PointCoordinates p2 = new PointCoordinates(3,7);

  System.out.println("Расстояние между точками P1 (" + p1.x + ";" + p1.y + " ) и P2 (" + p2.x + ";" + p2.y + ") =" + distance(p1, p2));
  }
  public static double distance(PointCoordinates p1, PointCoordinates  p2){
    return Math.sqrt(Math.pow(p2.x-p1.x,2) + Math.pow(p2.y-p1.y,2));
    //return Math.sqrt((p2.x- p1.x)*(p2.x- p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
  }

}
