import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
    // printNTimes("code", 3);
    // printNums();
    uprightNumberTriangle(5);
  }

  public static void printNTimes(String word, int N)
  {
    
    for (int i = 0; i<word.length(); i++)
    {
      String L = word.substring(i, i+1);
      for (int j = 0; j < N; j++)
      {
        System.out.println(L);
      }
    }
  }

  public static void printNums()
  {
    for (int i = 10; i>0; i--)
    {
      for (int j = 0 ; j<i; j++)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int i = 1; i<=N; i++)
    {
      for (int j = 1; j<=i; j++)
      {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
