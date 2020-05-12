class Person{


  public String firstName;
  public String lastName;
  public int age;


  Person(String firstName, String lastName, int age) {
    System.out.println("インスタンスが生成されました");
    this.firstName = firstName;
  }

  public String fullName(){
    return this.firstName
    
    + lastName;
  }

  public void printData(){
    double bmi = this.bmi();

  }

  public double bmi(){
    return this.weight/this.height/this.height
  }
  
}

