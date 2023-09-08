public class Taxi1 extends Car1 {
  private int price;

  public void start() {
    price = 420;
  }

  public void run() {
    price = price + 100;
  }

  public void display() {
    // メソッドのオーバーライド
    // 戻り値の型、メソッド名、引数の型・数をスーパークラスと合わせる
    System.out.println("料金は" + price + "です。");
  }
}
