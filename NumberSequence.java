import java.util.Scanner;
public class NumberSequence {
    public static void main (String [] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("How many numbers");
       int count=sc.nextInt();
       int [] FibArray=fib(count);
       for (int i=0; i<FibArray.length; i++) {
           System.out.println(FibArray[i] + " ");
        }  
       int [] CubicArray=cubic(count); 
       for (int i=0; i<CubicArray.length; i++) {
           System.out.println(CubicArray[i] + " ");
        } 
       int [] TriangularArray=triangular(count); 
       for (int i=0; i<TriangularArray.length; i++) {
           System.out.println(TriangularArray[i] + " ");
        }  
        int [] SquareArray=square(count); 
       for (int i=0; i<SquareArray.length; i++) {
           System.out.println(SquareArray[i] + " ");
        }  
       
    }
    public NumberSequence() {
    }
    public static int[] fib(int count) {
   int[] FibArray = new int[count];
    for (int i=0; i<count; i++) {
        if (i<=2) {
            FibArray[i]=i;
    }    
        else {
            FibArray[i]=FibArray[i-1]+FibArray[i-2];
        }
   } 
   return FibArray;
   } 
   
  public static int[] cubic(int count) {
   int[] CubicArray = new int[count];
    for (int i=0; i<count; i++) {
        CubicArray[i]=i*i*i;
   } 
   return CubicArray;
  } 
  
  public static int[] triangular(int count) {
   int[] TriangularArray = new int[count];
    for (int i=0; i<count; i++) {
        if (i==0) 
            TriangularArray[0]=1;
        else
            TriangularArray[i]=TriangularArray[i-1]+i+1;
   } 
   return TriangularArray;
  }
  
  public static int[] square(int count) {
   int[] SquareArray = new int[count];
    for (int i=0; i<count; i++) {
        SquareArray[i]=i*i;
   } 
   return SquareArray;
  }
} 