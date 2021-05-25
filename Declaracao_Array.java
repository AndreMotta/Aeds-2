import java.util.Scanner;
public class Declaracao_Array{

 private static int[] arrays;

public static void main(String[] args) {
 Scanner sc= new Scanner (System.in);
 int k=sc.nextInt();

 
for( int n=sc.nextInt(); n<= k;n++) {
	arrays = null;
	int tmp= arrays[n];
	int k1=n-1;
	while ((k1>=0)&& (arrays[k1]>tmp)) {
		arrays[k1+1]= arrays[k1];
		k1--;
	}
  arrays[k+1]= tmp;}

char[] tmp = null;
System.out.println(tmp);

sc.close();}}
