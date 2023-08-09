public class Student5{
  private String name;
  private int score;
  // 代入前処理でscoreに正しい値が入っているかチェックできる。
  // 一般的にはメンバ変数にはprivate指定をして、メソッドにはpublic指定をする。
  // メソッドを経由してメンバ変数を利用したり設定したりする。
  public Student5(String n){
    name = n;
  }
  public void setScore(int s){
    if(0 <= s && s <= 100){
      score = s;
    } else {
      System.out.println(name + "さんの点数が範囲外です");
      score = 0;
    }
  }
  void display(){
    System.out.println(name + "さん" + score + "点");
  }
}
