import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter length of array: ");
    int i = in.nextInt();
    
    int[] numList = new int[i];
    for (int x = 0; x < i; x++){
      System.out.println("Enter an integer: ");
      int a = in.nextInt();
      numList[x] = a;
    }
    
    int max = 0;
    int mode = 0;
    
    for (int x = 0; x < i; x++){
      int count = 0;
       for (int y = 0; y < i; y++){
        if (numList[y]==numList[x]){
          count++;
        }
      }
      if (count > max){
          max = count;
          mode = numList[x];
        }
    }
    
    System.out.println(mode);
    
  }
}
