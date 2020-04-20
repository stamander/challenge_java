

class Main {
  public static void main(String[] args) {
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      // iが5の倍数のとき、繰り返し処理を終了してください
      if (i%5 ==0){
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

  String[]names = {"にんじゃわんこ","ひつじ仙人","ベイビーわんこ"};
    
  // インデックス番号が0の要素を出力してください
  System.out.println(names[0]);
  
  // インデックス番号が2の要素を出力してください
  System.out.println(names[2])
}

}

