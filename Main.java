import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
    // printNTimes("code", 3);
    // printNums();
    // uprightNumberTriangle(5);
    Scanner sc = new Scanner(System.in);
    System.out.println("Print the height of the tree");
    int x = sc.nextInt();
    starTree(x);
    // multTable();
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

  public static void starTree(int height)
  {
    
    for (int i = 0; i<height; i++)
    {
      for (int j = 0; j<i; j++)
      {
        System.out.print(" ");
      }
      for (int star = i; star<height; star++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void multTable()
  {
    int size = 10;
    for (int i = 1; i<=size; i++ )
    {
      for (int j = 1; j <= size; j++)
      {
        System.out.print(i*j + "\t");
      }
      System.out.println();
    }
  }
}
