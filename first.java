class first {
  public static void main(String[] args) {

   

    ats("atsuhsi",5);
    ats("yukimi",23);

    for(int i = 0;i<5;i++){
      System.out.println(i);
      hello();
    }
  }

  public static void hello(){
    System.out.println("hello Stamander");
  }

  public static void ats(String name,int age){
    System.out.println(name);
    System.out.println(age+"歳");

    if(age>=20){
      System.out.println("成人です");
    }
    


  }

  


  
}

