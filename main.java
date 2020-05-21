import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    
    Scanner scanner = new Scanner(System.in);
    Car car = new Car("フェラーリ","赤");
    Bicycle bicycle = new Bicycle("ビアンカ","緑");


    System.out.println("【車の情報】");
    car.printData();
 
    System.out.print("走行距離を入力してください：");

    int carDistance = scanner.nextInt();

    car.run(carDistance);

    System.out.println("あなたは今ガソリンスタンドにいます");
    System.out.print("給油量を入力してください:");

    int fuel = scanner.nextInt();

    car.charge(fuel);
    

    System.out.println("=================");
    System.out.println("【自転車の情報】");
    bicycle.printData();

    System.out.print("走行距離を入力してください：");

    int bicycleDistance = scanner.nextInt();
    bicycle.run(bicycleDistance);

    


   
  }
}
