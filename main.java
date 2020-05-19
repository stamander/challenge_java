import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Car car = new Car("フェラーリ","赤");


   



    System.out.println("【車の情報】");
    car.printData();



    Scanner scanner = new Scanner(System.in);
    System.out.print("給油量を入力してください:");

    int fuel = scanner.nextInt();

    car.charge(fuel);
    


  }
}
