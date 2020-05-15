class Person {

  public static int count = 0;

  public String name;
  public String firstName;
  public String lastName;
  public String middleName;
  
  public void hello(){
    System.out.println("こんにちは"+this.name);
  }

  Person(String name, String firstName, String lastName){
    System.out.println("インスタンスが生成されました");
    this.name = name;
    this.firstName = firstName;
    this.lastName = lastName;
    Person.count ++;
  }

  Person(String name, String firstName, String middleName, String lastName){
    System.out.println("インスタンスが生成されました");
    this(name,firstName,lastName);

    this.middleName = middleName;
  }

  public String fullName(){
    return firstName + " " + lastName;
  }
  
}