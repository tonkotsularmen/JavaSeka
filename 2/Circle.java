class Circle{
  public static void main(String[] args){
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;
    
    area = radius * radius * pi;
    // area = 10 * 10 * 3.141592
    // area = 314.1592
    //小数点第３位を切り捨て
    area = (int)(area * 100);
    // area = (int)(31415.92);
    // area = 31415; // (int)はキャストでint型を無理矢理適用することで小数点以下を切り捨てる処理になる
    area = area / 100;
    // area = 31415 / 100;
    // area = 314.15

    System.out.println("半径" + radius);
    System.out.println("面積" + area);
  }
}
