class Student{
  //メンバ変数（属性）//クラスが持つ属性としての変数のこと。mainメソッドの中の変数と区別するため。
  String name;
  int engScore;
  int mathScore;

  //メソッド（操作）
  void display(){ // 引数なし戻り値なしでも()を忘れないように
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  }
  void setScore(int eng, int math){ // データ型 変数名のペアで受け取る。engmとmathの有効範囲はこのブロック内
    engScore = eng;
    mathScore = math;
  }  
  double getAvg(){ 
    double avg = (engScore + mathScore) / 2.0; // avgという変数はgetAvg の中が有効範囲
    return avg; // ここの戻り値と戻り値の型を一致するようにしないとコンパイルの時点でエラーになる
  }
} // この設計図クラスだけでは実行することができないので、実行クラスを別に用意する必要がある。