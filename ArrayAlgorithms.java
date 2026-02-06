public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new int[arraySize];
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for(int i = 0; i < intArray.length; i++)
      {
         intArray[i] = (int)(Math.random()*100);
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for (int i=0, j=startNum; i < intArray.length; i++, j++)
      {
         intArray[i] = j;
      }

   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int largest = Integer.MIN_VALUE;
      for(int i = 0; i < intArray.length; i++)
      {
         if (intArray[i] > largest)
         {
            largest = intArray[i];
         }
      }
      return largest;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for(int i = 0; i < intArray.length; i++)
      {
         for(int j = 0; j < intArray.length; j++)
         {
            if(intArray[j] == intArray[i])
            {
               return true;
            }
         }
      }
      return false;
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      for(int num : intArray)
      {
         if(intToFind == num)
         {
            return true;
         }
      }
      return false;
   }

   // ===== UWHS ALGORITHMS =====

   public int longestContiguousSubarray() {
      // UWHS ONLY:
      // Return the length of the longest strictly increasing contiguous segment
      int counter = 0;
      for(int i = 1; i < intArray.length; i++)
      {
         if(intArray[i] > intArray[i-1])
         {
            counter += 1;
         }
         else
         {
            counter = 0;
         }
      }
      return counter;
   }

   public int[] moveZeroesToEnd() {
      // UWHS ONLY:
      // Move all zeros to the end of while preserving order of non-zero elements. 
      // HINT: use a new array instead of changing intArray
      // Return the changed array
      int[] intArray2 = new int[intArray.length];
      int numOfElementsPut = 0;
      for(int i = 0; i < intArray.length; i++)
      {
         if(intArray[i] != 0)
         {
            intArray2[numOfElementsPut] = intArray[i];
            numOfElementsPut +=1;
         }
      }
      for(int i = numOfElementsPut; i < intArray.length; i++)
      {
         intArray2[numOfElementsPut] = 0;
      } 
      return intArray2;
   }
   
   public String toString()
   {
      String resault = (intArray[0] + "");
      for(int i = 1; i < intArray.length; i++)
      {
         resault += (", " + intArray[i]);
      }
      return resault;
   }

   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      ArrayAlgorithms arrayAlgorithms = new ArrayAlgorithms(10);
      // 2) Populate the array with random numbers
      arrayAlgorithms.populateArrayWithRandom();
      System.out.println(arrayAlgorithms);
      // 3) Call and print the result of EACH REQUIRED method
      System.out.println("findMax method: " + arrayAlgorithms.findMax());
      System.out.println("hasDuplicates method: " + arrayAlgorithms.hasDuplicates());
      System.out.println("isInArray(10) method: " + arrayAlgorithms.isInArray(10));
      // 4) If you are UWHS, also test the UWHS methods
      System.out.println("longestContiguousSubarray method: " + arrayAlgorithms.longestContiguousSubarray());
      System.out.println("moveZeroesToEnd method: " + arrayAlgorithms.moveZeroesToEnd());
      System.out.println(arrayAlgorithms);
   }
}
