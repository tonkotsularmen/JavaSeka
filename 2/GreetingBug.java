/*
class GreetingBug{
  pubric static void main(String args){
    System,out.println("こんにちは");
    System.out.println("一緒に頑張りましょう"):
  }
{
  間違い => 訂正
  pubric => public
  System, => System.
  ("一緒に頑張りましょう"): => ("一緒に頑張りましょう");
  { => }
  (String args) => (String[] args)
*/

class GreetingBug{
  public static void main(String[] args){
    System.out.println("こんにちは");
    System.out.println("一緒に頑張りましょう");
  }
}