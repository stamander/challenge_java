public class Car extends Vehicle{

  private int fuel =50;

  public int getFuel(){
    return this.fuel;
  }

  public void printData(){

    super.printData();

    System.out.println("ガソリン量："+this.fuel);
  }

  public void charge(int fuel){
    if(fuel<0){
      System.out.println("給油できません");
      System.out.println("ガソリン量"+fuel);
    }else if(fuel>=100){
      System.out.println("満タンまで給油します");
      fuel  += 100;
      System.out.println("ガソリン量"+fuel+"L");
    }else{
      System.out.println(fuel+"L給油します");
      this.fuel+=fuel;

      System.out.println("ガソリン量:"+this.fuel+"L");

    }
  }





  
}