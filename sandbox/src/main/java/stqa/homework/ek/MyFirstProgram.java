package stqa.homework.ek;

import java.sql.SQLOutput;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("user");
    hello("Kat");

    double len = 5;
    System.out.println("Плащадь квадрата со стороной " + len + "=" + aria (len));

    double a = 2;
    double b = 4;
    System.out.println("Плащадь прямоугольника со стороной " + a + " и " + b + " = " + aria (a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Let's Start, " + somebody +"!");
  }

  public static double aria (double l) {
    return l * l;
  }

  public static double aria (double a, double b) {
    return a*b;
  }
}