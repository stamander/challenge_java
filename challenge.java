class Main {

  public static void main(String[] args) {
    int number = 12;
    
    int number = 12;
    
    // switch文を用いて、numberを3で割った余りで条件分岐をしてください
    switch (number%3){
      case 0:
        System.out.println("3で割り切れます");
        break;
       case 1:
        System.out.println("3で割ると1余ります");
        break;
       case 2:
        System.out.println("3で割ると2余ります");
        break;
    }
    
    
  }

    
}
