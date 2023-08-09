public class StuSample4{
  public static void main(String[] args){
    final int BASE_NO = 1000;
    // BASE_NOは1000という値で初期化して以降、新しい値を代入できません。
    Student4 stu1 = new Student4("菅原",BASE_NO+1);
    stu1.display();
    Student4 stu2 = new Student4("村山",BASE_NO+2);
    stu2.display();
    // BASE_NO = 2000; // コンパイルエラーになる
  }
}
