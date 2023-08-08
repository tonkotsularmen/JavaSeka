class Cast{
  public static void main(String[] args){
    int price = Integer.parseInt(args[0]);
    double rate = 0.08;         // 消費税率：8%
    int amount;

    amount = (int)(price * (1 + rate));
    // amount = price * (1 + rate);
    // エラー: 不適合な型: 精度が失われる可能性があるdoubleからintへの変換
    System.out.println("税込金額：" + amount + "円");
  }
}
