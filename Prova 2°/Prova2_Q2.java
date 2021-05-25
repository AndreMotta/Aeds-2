import java.util.Scanner;
@SuppressWarnings("resource")
public class ProvaQ2 {
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int[]q = new int[N];
	
	for (int i=0; i<N; i++) 
	    q[i] = sc.nextInt();
	int P= sc.nextInt();
	int M= sc.nextInt();
	
	
	for (int i=0; i<N; i++) {
	    if (q[i] == 1)
		--P;
	    else
		--M;
	}
	
	if (P >= 0 && M >= 0) {
	    System.out.println("S");}
	else
	    System.out.println("N");
    }}