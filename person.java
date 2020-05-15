class Person {

  public String name;
  
  public void hello(){
    System.out.println("こんにちは"+this.name);
  }

  Person(){
    System.out.println("インスタンスが生成されました");
  }
  
}