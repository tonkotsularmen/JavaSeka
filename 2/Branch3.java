class Branch3{
  public static void main(String[] args){
    int num = Integer.parseInt(args[0]);
    switch( num ){
      case 1: // numが1だった場合プログラムの開始位置はここ
        System.out.println("入園料金8,400円");
        break; // ここでswitch{}を抜ける
      case 2: // numが2だった場合プログラムの開始位置はここ
        System.out.println("入園料金7,000円");
        break; // ここでswitch{}を抜ける
      case 3: // numが3だった場合プログラムの開始位置はここ
        System.out.println("入園料金5,000円");
        break; // ここでswitch{}を抜ける
      default: // numがそれ以外の場合だった場合プログラムの開始位置はここ
        System.out.println("1:一般, 2:中・高校生, 3:小学生・幼児");
    }
  }
}

// case1とcase2のbreak:がないと動きが変わるよ！
// class Branch3{
//   public static void main(String[] args){
//     int num = Integer.parseInt(args[0]);
//     switch( num ){
//       case 1: // numが1だった場合プログラムの開始位置はここ
//         System.out.println("入園料金8,400円");
//         
//       case 2: // numが2だった場合プログラムの開始位置はここ
//         System.out.println("入園料金7,000円");
//         
//       case 3: // numが3だった場合プログラムの開始位置はここ
//         System.out.println("入園料金5,000円");
//         break; // ここでswitch{}を抜ける
//       default: // numがそれ以外の場合だった場合プログラムの開始位置はここ
//         System.out.println("1:一般, 2:中・高校生, 3:小学生・幼児");
//     }
//   }
// }
