import java.util.Scanner;


class Main {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("何人の情報を入力しますか？");
    int person = scanner.nextInt();

    int maxAge = 0;

    for(int i =0; i<person;i++){

    System.out.println(i + 1 +"人目");

    System.out.print("名前:");
    String firstName = scanner.next();

    System.out.print("名字");
    String lastName = scanner.next();

    System.out.print("年齢:");
    int age = scanner.nextInt();

    System.out.print("身長:");
    double height = scanner.nextDouble();

    System.out.print("体重:");
    double weight = scanner.nextDouble();

    Person.printData(firstName,lastName,age,height,weight);
    if(age>maxAge){
      maxAge = age;
    }
  }

  System.out.println("最高年齢は"+maxAge+"です");




  }


}
