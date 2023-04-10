package cs2.generics;

import cs2.shapes.Circle;
import cs2.shapes.Rectangle;
import cs2.shapes.Shape;
import cs2.univ.Person;

public class Sorting {
  
  public static void bubbleSort(int[] a) {
    for(int i=0; i<a.length; i++) {
      for(int j=0; j<a.length-1; j++) {
        if(a[j] > a[j+1]) {
          int tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
        }
      }
    }
  }

  public static <T extends Comparable<T>> void bubbleSortGeneric(T[] a) {
    for(int i=0; i<a.length; i++) {
      for(int j=0; j<a.length-1; j++) {
        if(a[j].compareTo(a[j+1]) > 0) {
          T tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Integer[] arr = { 8, 4, 1, 7, 5, 3, 6, 2 };
    for(int i : arr) { System.out.print(i);}
    System.out.println();
    bubbleSortGeneric(arr);
    for(int i : arr) { System.out.print(i);}
    System.out.println();

    Shape[] shapes = { new Circle(0,0,1),
                       new Circle(0,0,2), 
                       new Circle(0,0,3),
                       new Rectangle(0, 0, 1, 1),
                       new Rectangle(0, 0, 2, 2),
                       new Rectangle(0,0,3,3) };
    for(Shape s : shapes) { System.out.println(s); }
    System.out.println();
    bubbleSortGeneric(shapes);
    for(Shape s : shapes) { System.out.println(s); }

    
  }
}
