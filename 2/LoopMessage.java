class LoopMessage{
  public static void main(String[] args){
    //メッセージを10回表示（While文）
    int i = 1; 
    while(i < 11){ // while(i <= 10){}
      System.out.println(i + "回目：フリーラーニングを広めたい!");
      i ++; //こいつ忘れると無限ループになる
    }
  }
}
