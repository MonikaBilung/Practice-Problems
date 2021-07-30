 class FibonacciSeries
{
  static void Fibonacci(int n)
  {
  //creat array for fibonacci
   int[] f= new int[n+1];
 //calculate the values for bases
   f[0]=0;
   f[1]=1;
 //creat a for loop from 2 to nth number
  for(int i=2; i<=n; i++)
    {
      f[i]=f[i-1]+f[i-2];
    }
 //print the fibonacci value of nth number
  System.out.println("the Fibonacci value is"+" "+f[n]);
  }
public static void main(String[] args)
{
int N=10;
//calling fibonacci method
Fibonacci(N);
}
}