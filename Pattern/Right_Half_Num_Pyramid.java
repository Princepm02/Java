// Java Program to print Right Half Pyramid of a Number
public class Right_Half_Num_Pyramid 
{
  public static void main(String[] args) 
  {
    int rows = 5;
    for (int i = 1; i <= rows; i++) 
    {
      for (int j = 1; j <= i; j++) 
      {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
