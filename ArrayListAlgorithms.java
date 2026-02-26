import java.util.ArrayList;

public class ArrayListAlgorithms {
   // DO NOT CHANGE THE VARIABLE NAME
   private ArrayList<Integer> intArrayList;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */
   public ArrayListAlgorithms() {
      // make arrayList
      this.intArrayList = new ArrayList<Integer>();
      for(int i = 0; i < 100; i++)
      {
         intArrayList.add(null);
      }

   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for(int i = 0; i < intArrayList.size(); i++)
      {
         intArrayList.set(i, (int)(Math.random()*100));
      }
      intArrayList.set(0, 23);
      System.out.println(intArrayList.get(0));
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for (int i=0, j=startNum; i < intArrayList.size(); i++, j++)
      {
         intArrayList.set(i, j);
      }

   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int largest = Integer.MIN_VALUE;
      for(int i = 0; i < intArrayList.size(); i++)
      {
         if (intArrayList.get(i) > largest)
         {
            largest = intArrayList.get(i);
         }
      }
      return largest;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for(int i = 0; i < intArrayList.size() - 1; i++)
      {
         for(int j = i+1; j < intArrayList.size(); j++)
         {
            if(intArrayList.get(j) == intArrayList.get(i))
            {
               //System.out.println(i + " " + j);
               return true;
            }
         }
      }
      return false;
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      if (intArrayList.indexOf(intToFind) > 0) {
         return true;
      }else {
         return false;
      }
      /*
      for(int num : intArrayList)
      {
         if(intToFind == num)
         {
            return true;
         }
      }
      return false;*/
   }
   
   // Methods to make testing easier
   public String toString()
   {
      String resault = (intArrayList.get(0) + "");
      for(int i = 1; i < intArrayList.size(); i++)
      {
         resault += (", " + intArrayList.get(i));
      }
      return resault;
   }
   
   public String printArray(ArrayList<Integer> array)
   {
      String resault = (array.get(0) + "");
      for(int i = 1; i < array.size(); i++)
      {
         resault += (", " + array.get(i));
      }
      return resault;

   }

   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      ArrayListAlgorithms arrayListAlgorithms = new ArrayListAlgorithms();
      // 2) Populate the array with random numbers
      arrayListAlgorithms.populateArrayWithRandom();
      System.out.println(arrayListAlgorithms);
      // 3) Call and print the result of EACH REQUIRED method
      System.out.println("findMax method: " + arrayListAlgorithms.findMax());
      System.out.println("hasDuplicates method: " + arrayListAlgorithms.hasDuplicates());
      System.out.println("isInArray(10) method: " + arrayListAlgorithms.isInArray(10));
   }
}