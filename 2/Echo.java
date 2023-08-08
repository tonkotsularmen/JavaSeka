class Echo{
  public static void main(String[] args){
    // int i;と宣言すればfor文の外でも使える
    //コマンドラインの入力文字を表示（for文）
    for(int i = 0; i < args.length; i++){
    //int i = 0をfor文の中で宣言しているのでこの構文の中でしか使えない
    //変数は宣言したブロック内でしか使えない
      System.out.println(args[i]);
    }
    //System.out.println(i); // => コンパイル時にエラーになる
  }
}
