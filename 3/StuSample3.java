class StuSample3{
  public static void main(String[] args){
    Student3 stu1 = new Student3("菅原");
    Student3 stu2 = new Student3("村山", 75, 100);
    // 自分でコンストラクタを使用した際は、デフォルトコンストラクタは生成されない
    // Student3 stu3 = new Student3(); // コンパイルエラーになる
    stu1.setScore(90, 80);
    stu1.display();
    stu2.display();
  }
}
