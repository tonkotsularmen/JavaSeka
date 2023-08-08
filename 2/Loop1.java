class Loop1{
  public static void main(String[] args){
    int i = 0; // 処理の回数を数えるための変数を0で初期化する作業を最初にします。
    while( i < 3 ){ 
      System.out.println("i = " + i);
      i++; // 処理の回数を数えるための変数をカウントアップする必要があります。
    }
  }
}

/*
処理の回数を数えるための変数を0で初期化する作業、処理の回数そ数えるための変数をカウントアップする作業を、
( i < 3 )のカッコの中に入れる方法がfor文 => Loop2.java 
*/  
