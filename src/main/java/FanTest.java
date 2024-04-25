package src.main.java;
import src.main.java.Fan;

public class FanTest {
  public static void main(String[] args) {
    // Assigns data to the string created in the Fan class and prints it
    Fan fan1 = new Fan();
    fan1.setSpeed(3);
    fan1.setRadius(10);
    fan1.setColor("yellow");
    fan1.setOn(true);
    System.out.println(fan1.toString());

    Fan fan2 = new Fan();
    fan2.setSpeed(2);
    fan2.setRadius(5);
    fan2.setColor("blue");
    fan2.setOn(false);
    System.out.println(fan2.toString());
  }
}