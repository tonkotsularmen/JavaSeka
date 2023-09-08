public class Student3 extends Person3 {
  private int stuNo;

  public Student3(String name) {
    this(name, 999);
    // Student3(name, 999);になるイメージ
    // 下の引数二つのコンストラクタをここで呼び出しているイメージ
  }

  public Student3(String name, int stuNo) {
    super(name);
    // superクラスのコンストラクタに処理を任せている
    this.stuNo = stuNo;
    // 学籍番号999はメンバ変数に代入されている
  }

  public void display() {
    // Personクラスのdisplayメソッドをオーバーライド
    super.display();
    System.out.println("学籍番号：" + stuNo);
  }
}
