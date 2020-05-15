class Person {

  public String name;
  public String firstName;
  public String lastName;
  
  public void hello(){
    System.out.println("こんにちは"+this.name);
  }

  Person(String name, String firstName, String lastName){
    System.out.println("インスタンスが生成されました");
    this.name = name;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
}