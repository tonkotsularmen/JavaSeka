public class Taxi2 extends Car2 {
  private int price;

  public Taxi2(int no) {
    this(no, 0);
    // super(no);
    // price = 0;
  }

  public Taxi2(int no, int price) {
    super(no); // Car2(no);っていうイメージ
    this.price = price;
  }

  public void start() {
    price = 420;
  }

  public void run() {
    price = price + 100;
  }

  public void display() {
    super.display();
    System.out.println("料金は" + price + "です。");
  }
}
