package cs2.generics;
import java.util.ArrayList;
public class Bucket<TYPE> {
  private ArrayList<TYPE> contents;
  public Bucket() { contents = new ArrayList<TYPE>(); }
  public void add(TYPE item) {
    if(!contents.contains(item)) {
      contents.add(item);
    }
  }
  public String toString() { return contents.toString(); }

  public static void main(String[] args) {
    Bucket<String> b = new Bucket<String>();
    b.add("Apple");
    b.add("Apple");
    System.out.println(b);
  }
}
