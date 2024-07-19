import java.util.Scanner;
class NumberIncreaseReversePyramidPattern
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter any Number");
	int n = sc.nextInt();
	int i,j;
	for(i=n;i>=1;i--)
	{
	  for(j=1;j<=i;j++)
	  {
	    System.out.print(j+" ");
	  }
	  System.out.println();
	}
  }
}	