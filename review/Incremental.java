class Incremental{
  public static void main(String[] args){
    System.out.println(increment(5));
  }
  private static int increment(int num) {
    // return num++; // => 5
    return ++num; // => 6
  }
}