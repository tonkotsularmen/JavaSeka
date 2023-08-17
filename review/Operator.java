class Operator{
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int x ;
    int y ;
    System.out.println("a = " + a);
    System.out.println("a++ = " + a++);
    System.out.println("a = " + a);
    System.out.println("++a = " + ++a);
    System.out.println("a = " + a);

    System.out.println("b = " + b);
    x = b++;
    System.out.println("x = b++ => " + x);
    y = ++b;
    System.out.println("y = ++b => " + y);

  }
}