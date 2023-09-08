public class StuSample2 {
  public static void main(String[] args) {
    Student2 stu = new Student2();
    Person2 ps = new Person2();
    stu.setName("菅原");
    stu.setStuNo(1);
    stu.display();
    System.out.println("-----------------");
    ps.setName("山田");
    ps.display();
  }
}
