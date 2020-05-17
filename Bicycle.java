class Bicycle{
  private String name;
  private String color;
  
  Bicycle(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public String getCorlor(){
    return this.color;
  }

  public void printData(){
    System.out.println("走る距離を入力してください");
  }
}