class Main {

  public static void main(String[] args){
    
    printData();
    PrintPlice("消しゴム",300);
    
   
    hello(names("yukimi","takano"));

    hello(names("atsushi","iida"));

    

  }

 

  public static void printData(){
    System.out.println("my name is atsushi");
  }

  public static void hello(String name){
    System.out.println( name + "さんこんにちは");
  }

  public static void PrintPlice(String item, int yen){
    System.out.println(item +"の値段は"+ yen + "です");
  }

  public static int add(int a,int b){
    return a / b;

  }

  public static String names (String firstName,String lastName){
    return firstName + "" +lastName;
  }




}
