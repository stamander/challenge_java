import java.util.Scanner;
class Main {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("名前:");

    String firstName = scanner.next();

    System.out.print("名字");
    

    String lastName = scanner.next();

    System.out.println("名前は" + firstName + " " + lastName + "です");



  }
}
