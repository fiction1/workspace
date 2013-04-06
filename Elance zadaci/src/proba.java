import java.util.Scanner;
class proba{
public static void main(String args[]){
 int a,b,c;
 Scanner in = new Scanner(System.in);
 a = in.nextInt();
 b = in.nextInt();
 c = in.nextInt();
 int[] array={a,b,c};
    int k;
  for(int x=0; x<3; x++){
  int y = array[x];
  int z= y+1;
  
   for(int i=1;i<=y;i++){                    
   System.out.println();
   System.out.format("%"+z+"s", ""); 
    
    for(int j=1;j<=i;j++)
    {
    k=i;
    System.out.format("%"+1+"s", ""); 
    System.out.print(k);  
    }
    z--;
   }
  }
   }
}