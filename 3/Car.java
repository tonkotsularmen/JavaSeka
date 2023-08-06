class Car {
  // 属性をメンバ変数として記述
  int no;
  int speed;
  // 操作をメソッドとして記述
  void setNo(int n){
    no = n;
  }

  void run(int s){
    speed = s;
  }

  void stop(){
    speed = 0;
  }

  void display(){
    System.out.println("車両ナンバー" + no + "の速度は" + speed + "km/hです");
  }
}
