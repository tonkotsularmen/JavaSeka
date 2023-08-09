public class Person3{
  private String name;

  public Person3(String name){
    this.name = name;
    // メンバ変数のnameに引数のnameを代入している
    // this.nameのnameは2行目のnameを指している。
  }
  public void display(){
    System.out.println("名前：" + name);
  }
}
