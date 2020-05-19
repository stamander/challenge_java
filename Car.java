public class Car {

  private String name;
  private String color;
  private int distance =0;
  private int fuel =100;

  Car(String name ,String color){
    this.name = name;
    this.color = color;
  }

  public void printData(){
    
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("距離：" + this.distance  + "km");
    System.out.println("ガソリン量：" + this.fuel  + "L");
  }

  public void run(int distance){
    
    System.out.println(distance + "km走ります");
    this.distance += distance;
    System.out.println("走行距離："+this.distance+"km");

    if(this.distance<=fuel){
      fuel -= this.distance; 
      System.out.println("ガソリンの残り:"+fuel+"L");
      
    }else if(this.distance>this.fuel){
      System.out.println("ガソリンがたりません");
      this.distance = 0;
      System.out.println("走行距離："+this.distance+"km");
      System.out.println("ガソリンの残り:"+fuel+"L");
    }

  }

  public void chage(int fuel){

    if(fuel<=0){
      System.out.println("給油できません");
      System.out.println("ガソリンの残り:"+this.fuel+"L");
    }else if(fuel>=100){
      System.out.println("満タンまで給油します");

      this.fuel=100;
      System.out.println("ガソリンの残り:"+this.fuel+"L");

      

    }else{
      this.fuel+=fuel;
      System.out.println("ガソリンの残り:"+this.fuel+"L");
    }

  }


  
}