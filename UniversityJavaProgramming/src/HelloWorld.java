import java.util.Scanner;
 
public class HelloWorld{
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
   //Takes user input for two numbers
  System.out.print("Input first number: ");
  double num1 = in.nextDouble();
   
  System.out.print("Input second number: ");
  double num2 = in.nextDouble();
  
  //Mathmatical Formulas that also round without the use of printf
  double sum = Math.round(((num1 + num2)*10000)/10000.0);
  double product = Math.round(((num1 * num2)*10000)/10000.0);
  double division = Math.round(((num1 / num2)*10000)/10000.0);
  double difference = Math.round(((num1 - num2)*10000)/10000.0);
  
  //This prints the answers and does some rounding
  System.out.printf("Number one is: %.4f , number two is %.4f , The Sum is %.4f , The product is %.4f , The division is %.4f , The difference is %.4f", num1, num2, sum, product, division, difference);
   
  //Takes user input for two numbers
  System.out.print("Input radius: ");
  double radius = in.nextDouble();
  
  //This works out a circle/spheres data
  double area = Math.PI * radius * radius;
  double circumference = 2 * Math.PI * radius;
  double volume = (4.00/3) * Math.PI * Math.pow(radius,3);
  
  //This prints that data
  System.out.printf("This is the radius: %.4f,This is the area %.4f, This is the Circumference %.4f, This is the Volume %.4f", radius, area, circumference, volume);
  
  //This is used to input angle
  System.out.print("Input angle: ");
  double angle = in.nextDouble();
  
  double cos = Math.cos(Math.toRadians(angle));
  double sin = Math.sin(Math.toRadians(angle));
  double tan = Math.tan(Math.toRadians(angle));
  
  System.out.printf("This is the angle: %.4f, This is the cos %.4f, This is the sin %.4f, This is the tan %.4f ", angle, cos, sin, tan);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  /*int sumMul = (num1 * num2);
  int sumDif = (num1 - num2);
  int sumMod = (num1 % num2);
  float sumDiv = (num1 / num2);
  
  System.out.printf("%d x %d = %d " num1,num2, sumMul);
  System.out.printf("num1 + " - " + num2 + " = " + sumDif"num1, num2, );
  System.out.printf(num1 + " % " + num2 + " = " + sumMod);
  System.out.printf(num1 + " /  " + num2 + " = " + sumDiv);
  
  
  
  System.out.print("Input first number: ");
  float firstint = in.nextInt();
   
  System.out.print("Input second number: ");
  float secondint = in.nextInt();
  
  System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
  System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
  System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
  System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
  System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
  System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
  System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
  
  double perimeter = 2 * Math.PI * radius;
          double area = Math.PI * radius * radius;
          System.out.println("Perimeter of the circle is " + perimeter);
          System.out.println("Area of the circle is " + area);
*/
  
 }
 
}
