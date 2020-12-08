package stqa.homework.ek;


public class MyFirstProgram {

  public static void main(String[] args) {
    hello("user");
    hello("Kat");

    Square s = new Square(5);
    System.out.println("Плащадь квадрата со стороной " + s.l + "=" + s.aria ());

    Rectangle r =new Rectangle(2,4);
    System.out.println("Плащадь прямоугольника со стороной " + r.a + " и " + r.b + " = " + r.aria ());
  }

  public static void hello(String somebody) {
    System.out.println("Let's Start, " + somebody +"!");
  }

}

