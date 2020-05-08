class Main {

  public static void main(String[] args){
    hello("atsushi");
    printData();
    PrintPlice("消しゴム",300);
    
    int total = add(7,5);
    PrintPlice("コーラ",total);
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




}
