import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Main{
  public static void main(String[] args){
    ArrayList a = new ArrayList<String>();
    
    a.add("four");
    a.add("score");
    a.add("and");
    a.add("seven");
    a.add("years");
    a.add("ago");
    a.add("a");
    
    removeShorterStrings(a);
    System.out.println(a);
  } 
  
  public static double findLargest(ArrayList<Double> a){
    double largest = a.get(0);
    for(int i = 1; i < a.size(); i++){
      if(largest < a.get(i)){
        largest = a.get(i);
      }
    }    
    return largest;
  }
  
  public static int indexOfLargest(ArrayList<Double> a){
    return a.indexOf(findLargest(a));
  }
  
  public static int indexOfInt(ArrayList<Integer> a, int target){
    return a.indexOf(target);
  }
  
  public static boolean hasSameElements(ArrayList<Integer> a, ArrayList<Integer> b){
    Collections.sort(a);
    Collections.sort(b);
    if(a.equals(b)){
      return true;
    }
    else{
      return false;
    }
  }

  public static void removeEvenLength(ArrayList<String> a){
    Iterator<String> iter = a.iterator();

    while(iter.hasNext()){
      String str = iter.next();
      if(str.length() % 2 == 0){
        iter.remove();
      }
    }
  }

  public static void removeDuplicates(ArrayList<Integer> a){
    for(int i = 0; i < a.size() - 1; i++){
      if(a.get(i) == a.get(i + 1)){
        a.remove(i);
        i--;
      }
    }
  }


  public static void swapPairs(ArrayList<String> a){
    if(a.size() % 2 == 0){
      for(int i = 0; i < a.size(); i++){
        String part1 = a.get(i);
        String part2 = a.get(i + 1);

        a.set(i, part2);
        a.set(i + 1, part1);

      }
    }
    else{
      for(int i = 0; i < a.size() - 1; i=i+2){
        String part1 = a.get(i);
        String part2 = a.get(i + 1);
        
        a.set(i, part2);
        a.set(i + 1, part1);
      }
    }
  }

  public static void doubleList(ArrayList<String> a){
    //Dont know why i have to do this but i get a OutOfMemoryError if i dont
    int size = a.size();
    int sizeDoubled = a.size() * 2;

    for(int i = size; i < sizeDoubled; i++){
      a.add("");
    }
    for(int i = sizeDoubled - 1; i > 0; i = i - 2){
      String doubled = a.get(i / 2);
      a.set(i, doubled);
      a.set(i - 1, doubled);
    }
  }

  public static void removeShorterStrings(ArrayList<String> a){
    if(a.size() % 2 == 0){
      for(int i = 0; i < a.size(); i++){
        String part1 = a.get(i);
        String part2 = a.get(i + 1);


        System.out.println(i);
        System.out.println(part1.length());
        System.out.println(part2.length());
        System.out.println(" ");

        if(part1.length() < part2.length()){
          
          a.remove(part1);
        }
        else if(part1.length() == part2.length()){
          a.remove(part1);
        }
        else{
          a.remove(part2);
        }

      }
    }
    else{
      for(int i = 0; i < a.size() - 1; i++){
        String part1 = a.get(i);
        String part2 = a.get(i + 1);
        
        if(part1.length() < part2.length()){
          a.remove(part1);
        }
        else if(part1.length() == part2.length()){
          a.remove(part1);
        }
        else{
          a.remove(part2);
        }
      }
    }
  }


  

}