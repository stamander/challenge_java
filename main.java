class Main {
  public static void main(String[] args) {
    Person person1 = new Person("ats");
    // person1に対して、helloメソッドを呼び出してください
    
    System.out.println(person1.name);
    person1.hello();
    
    Person person2 = new Person();
    // person2に対して、helloメソッドを呼び出してください
    person2.name = "yuki";
    person2.hello();
    
  }
}
