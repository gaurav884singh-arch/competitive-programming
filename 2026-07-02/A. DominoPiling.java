import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int area = 0;
		area = M*N;
		int Domino =0;
		Domino = area/2;
		System.out.println(Domino);
	}
}