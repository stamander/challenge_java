class Vehicle {
  private String name;
  private String color;
  private int distance =0;

  public void printData(){
    
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("距離：" + this.distance  + "km");
  }
  
}