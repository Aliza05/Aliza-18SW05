class Task4
{
 public static void main(String args[])
 {
   
   int result[][] = new int[3][3];
   int A[][] = new int[][] {{1,2,3}, {2,3,4}, {4,5,6}} ; 
   int B[][] = new int[][] {{9,7,6}, {5,7,2}, {1,3,9}};
   for(int i=0; i<3; i++)
   { for(int j=0; j<3; j++)
     { result[i][j]=A[i][j]+B[i][j]; }
   }
   System.out.println("Sum=");
   
   for(int i=0; i<3; i++)
   { for(int j=0; j<3; j++)
     { System.out.print(result[i][j]);
       System.out.print(" ");
     }
     System.out.println();
   }
  }
}