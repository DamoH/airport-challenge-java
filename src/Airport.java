import java.util.ArrayList;


public class Airport {

  public ArrayList<String> hangar = new ArrayList<String>();
  public int capacity = 10;

  public static void main(String[] args) {
    System.out.println();
  }

  public void land(String plane) {
    this.hangar.add(plane);
  }

  public void takeOff(String plane) {
    this.hangar.remove(plane);
  }
}
