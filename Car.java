public class Car extends Vehicle{

  private int fuel =50;

  public int getFuel(){
    return this.fuel;
  }

  public void charge(int fuel){
    if(fuel<0){
      System.out.println("給油できません");
    }
  }





  
}