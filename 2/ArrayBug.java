// class ArrayBug{
//   public static void main(String[] args){
//     String[] name = new String[4];
    
//     name[0] = "櫻井";
//     name[1] = "田原";
//     name[2] = "中川";
//     name[3] = "鈴木";
//     name[4] = "小林";
    
//     System.out.println(name[0]);
//     System.out.println(name[1]);
//     System.out.println(name[2]);
//     System.out.println(name[3]);
//     System.out.println(name[4]);
//   }
// }

class ArrayBug{
  public static void main(String[] args){
    String[] name = new String[5];
    
    name[0] = "櫻井";
    name[1] = "田原";
    name[2] = "中川";
    name[3] = "鈴木";
    name[4] = "小林";
    
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
  }
}

// 別解
// class ArrayBug{
//   public static void main(String[] args){
//     String[] name = new String[4];
    
//     name[0] = "櫻井";
//     name[1] = "田原";
//     name[2] = "中川";
//     name[3] = "鈴木";
//   //name[4] = "小林";
    
//     System.out.println(name[0]);
//     System.out.println(name[1]);
//     System.out.println(name[2]);
//     System.out.println(name[3]);
//   //System.out.println(name[4]);
//   }
// }