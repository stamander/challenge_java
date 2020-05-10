import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("名前：");
    String firstName = scanner.next();
    System.out.println("名字：");
    String lastName= scanner.next();
    System.out.println("年齢：");
    int age = scanner.nextInt();
    System.out.println("身長(m)：");
    double height = scanner.nextDouble();
    System.out.println("体重(kg)：");
    double weight = scanner.nextDouble();
    
    System.out.println("名前は"+ firstName + " " + lastName +"です");
    System.out.println("年齢は"+ age +"歳です");
    if(age >=20){
      System.out.println("成年者です");
    }else{
      System.out.println("未成年者です");
    }
    System.out.println("身長は"+height+"です");
    System.out.println("体重は"+weight+"です");
    
    
    
    
    
  }
}
