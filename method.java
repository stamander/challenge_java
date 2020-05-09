class Main {

 

  public static void main(String[])) {

    printData("atsushi", 45, 1.6);
    PrintPlice("消しゴム", 300);

    hello(names("yukimi", "takano"));

    hello(names("atsushi", "iida"));
    System.out.println(average(30, 40));

    final int number = 3047061;

    if (isEven(number)) {
      System.out.println(number + "は偶数です");

    } else {
      System.out.println(number + "は奇数です");
    }



  }

  public static void printData(final String name, final double weight, final double height) {
    System.out.println("my name is " + name);
    final double bmi = bmi(weight, height);
    System.out.println("私のbmiは" + bmi);
  }

  public static void hello(final String name) {
    System.out.println(name + "さんこんにちは");
  }

  public static void PrintPlice(final String item, final int yen) {
    System.out.println(item + "の値段は" + yen + "です");
  }

  public static double average(final int a, final int b) {
    final int total = add(a, b);
    return (total / 2);
  }

  public static int add(final int a, final int b) {
    return (a + b);
  }

  public static String names(final String firstName, final String lastName) {
    return firstName + "" + lastName;
  }

  public static double bmi(final double weight, final double height) {
    return weight / height / height;
  }

  public static boolean isEven(final int a) {
    return a%2==0;
  }




}
