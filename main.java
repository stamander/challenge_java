import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.setName("フェラーリ");
    car.setColor("赤");


    Bicycle bicycle = new Bicycle();
    bicycle.setName("ビアンキ");
    bicycle.setColor("緑");


    System.out.println("【車の情報】");
    car.printData();

    System.out.println("ガソリン量:"+car.getFuel()+"L");


    Scanner scanner = new Scanner(System.in);
    System.out.print("給油量を入力してください");

    int fuel = scanner.nextInt();

    car.charge(fuel);
    

    System.out.println("=================");
    System.out.println("【自転車の情報】");
    bicycle.printData();

   
  }
}
