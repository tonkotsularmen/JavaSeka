package mypack;

public class Taxi3 extends Vehicle implements Stopable {

  public Taxi3(int crewNum) {
    this.crewNum = crewNum;
  }

  public void showCrewNum() {
    System.out.println("タクシーの乗客" + crewNum + "名");
  }

  public void stop() {
    System.out.println("ここでおります");
  }
}
