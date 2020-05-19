
public class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");

    System.out.println("【自転車の情報】");


    bicycle.printData();

    System.out.println("-----------------");

    bicycle.run(10);
  }
}