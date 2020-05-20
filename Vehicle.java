import java.util.Vector;

abstract class Vehicle{
  // 以下のコードをVehicleクラスに移動してください
private String name;
private String color;
protected int distance = 0;
private Person owner;

public String getName() {
  return this.name;
}

public Person getOwner(){
  return this.owner;
}
public String getColor() {
  return this.color;
}
public int getDistance() {
  return this.distance;
}
public void setName(String name) {
  this.name = name;
}
public void setColor(String color) {
  this.color = color;
}

public void setOwner(Person owner){
   this.owner = owner;
}
public void printData() {
  System.out.println("名前：" + this.name);
  System.out.println("色：" + this.color);
  System.out.println("走行距離：" + this.distance + "km");
}



Vehicle(String name,String color){
  this.name = name;
  this.color=color;
  
}

  abstract public void run(int distance);


}