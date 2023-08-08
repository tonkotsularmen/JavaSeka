class Loop3{
  public static void main(String[] args){
    int[] score = new int[3];
    score[0] = 80;
    score[1] = 100;
    score[2] = 75;
    String[] name = {"菅原", "村山", "寺島"};
    
    for(int i = 0; i < score.length; i++) {
      // for文の繰り返し条件で相性がいいのが、「配列名.length」
      // => score配列の要素数は3なので、「配列.length」が「3」に置き換わります。
      System.out.println(name[i] + "さん" + score[i] + "点");
    }
    System.out.println("受験者数" + score.length + "名");
  }
}
