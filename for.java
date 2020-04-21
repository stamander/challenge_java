class Main {
  public static void main(String[] args) {
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      // iが5の倍数のとき、繰り返し処理を終了してください
      if (i%5==0){
        break;
      }
      
      System.out.println(i);
      i++;
    }
    
    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      // jが3の倍数のとき、処理をスキップしてください
      if (j%3==0){
        continue;
      }
      
      System.out.println(j);
    }

    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    
    // 配列用のfor文を用いて、「私の名前は◯◯です」と出力してください
    for (String name:names){
      System.out.println("私の名前は"+name+"です");
    }
    int[] numbers = {1, 4, 6, 9, 13, 16};
    
    int oddSum = 0;
    int evenSum = 0;
    
    // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
    for(int number:numbers){
      if (number%2==0){
       evenSum+=number;
      }
      else{
         oddSum+=number;
      }
    }

    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  
  }
}