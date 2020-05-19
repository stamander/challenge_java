import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");

    System.out.println("【自転車の情報】");


    bicycle.printData();

    System.out.println("-----------------");
    System.out.println("走る距離を入力してください");

    int runDistance = scanner.nextInt();

    bicycle.run(runDistance);
    System.out.println("-----------------");

    Car car = new Car("フェラーリ","赤");
    car.printData();
  }
}