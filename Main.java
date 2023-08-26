import java.util.Scanner;  // Import the Scanner class
class Main {
  public static void main(String[] args) {
  //creating a scanner for input
  //asking user for an integer
  Scanner number = new Scanner(System.in);
    System.out.println("please choose a number:");  
  int num = number.nextInt();
    System.out.println("The integer you entered was " + num);
    System.out.println("Your new integer is " + (num + 1));
  }
}