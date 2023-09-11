
//インポート
import mypack.*;

public class UseVehicle {
  public static void main(String[] args) {
    Vehicle[] v = new Vehicle[3];
    v[0] = new Taxi3(4); // スーパー ＝ サブ の型変換
    v[1] = new Train(160); // スーパー ＝ サブ の型変換
    v[2] = new Bus(80); // スーパー ＝ サブ の型変換

    for (int i = 0; i < v.length; i++) {
      v[i].showCrewNum();
      if (v[i] instanceof Stopable) {
        Stopable s = (Stopable) v[i];
        s.stop();
      }
    }
  }
}
