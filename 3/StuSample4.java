class StuSample4 {
  public static void main(String[] args) {

    // ---staticつける前---
    // Student4 stu1 = new Student4("菅原");
    // stu1.display();

    // Student4 stu2 = new Student4("村山");
    // stu2.display();

    // ---staticをつける---
    Student4.display();

    Student4 stu1 = new Student4("菅原");
    Student4.display();

    Student4 stu2 = new Student4("村山");
    Student4.display();
  }
}
