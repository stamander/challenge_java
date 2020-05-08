class Main {

  public static void main(String[] args){
    
    printData();
    PrintPlice("消しゴム",300);
    
   
    hello(names("yukimi","takano"));

    hello(names("atsushi","iida"));
    System.out.println(average(30,40));





  }

 

  public static void printData(String name, double weight, double height){
    System.out.println("my name is " +name);
    double bmi = bmi(weight,height);
    System.out.println("私のbmiは"+bmi);
  }

  public static void hello(String name){
    System.out.println( name + "さんこんにちは");
  }

  public static void PrintPlice(String item, int yen){
    System.out.println(item +"の値段は"+ yen + "です");
  }

  public static double average(int a,int b){
    int total = add(a,b);
    return(total/2);
  }

  public static int add(int a,int b){
    return(a+b);
  }

  public static String names (String firstName,String lastName){
    return firstName + "" +lastName;
  }

  public static double bmi(double weight,double height){
    return weight/height/height;
  }




}
