import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] M = new int[5][5];
		for (int i=0; i<5; i++){
		    for (int j=0; j<5; j++){
		        M[i][j] = sc.nextInt();
		    }
		}
		int a=0,b=0;
		for (int i=0; i<5; i++){
		    for (int j=0; j<5; j++){
		        if (M[i][j] == 1){
		            a=i;
		            b=j;
		            break;
		        }
		    }
		}
		int moves = Math.abs(a - 2) + Math.abs(b - 2);
        
        System.out.println(moves);
	}
}