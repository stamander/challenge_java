import jdk.internal.agent.resources.agent;

class first {
  public static void main(String[] args) {

    hello();

    ats(1);
  }

  public static void hello(){
    System.out.println("hello Stamander");
  }

  public static void ats(int a){
    System.out.println(a*2);
  }
  
}

