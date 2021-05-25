import java.util.*;
import java.io.*;

public class ProvaQ1 {
public static ArrayList<ArrayList<Integer>> cartela;
public static ArrayList<Integer> cnt;
public static ArrayList<Integer> g;

  public static int N,K,U;

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter writer = new PrintWriter(System.out);
  
    String line = in.readLine();
    StringTokenizer tokenizer = new StringTokenizer(line," ");
    N = Integer.parseInt(tokenizer.nextToken());
    K = Integer.parseInt(tokenizer.nextToken());
    U = Integer.parseInt(tokenizer.nextToken());

    cnt = new ArrayList<Integer>();
    for( int i= 0; i <= N; i++ ) cnt.add(0);

    cartela = new ArrayList<ArrayList<Integer>>();
    for( int i = 0; i <= U; i++ ) cartela.add(new ArrayList<Integer>());
    for ( int c = 1; c <= N; c++ ){
      line = in.readLine();
      tokenizer = new StringTokenizer(line," ");
      
    for ( int j= 1; j <= K; j++ ){
        int n = Integer.parseInt(tokenizer.nextToken());
        cartela.get(n).add(c);
}}
    g = new ArrayList<Integer>();
    line = in.readLine();
    tokenizer = new StringTokenizer(line," ");

    for ( int i= 1; i <= U && g.size() == 0; i++ ){
      int n = Integer.parseInt(tokenizer.nextToken());
    
    for ( int c: cartela.get(n) ){
    	  cnt.set(c, cnt.get(c)+1 );
        if ( cnt.get(c) == K ) g.add( c );
}}
    String s = "";
    for ( int c : g ){
      writer.print(s); writer.print(c);
      s = " ";}
    writer.println();
    writer.close();
}}