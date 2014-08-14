import java.util.Scanner;

public class ScannerRegex{
	public static void main(String args[]){
		Scanner sc = new Scanner("123 4 -2 x 123").useDelimiter(" ");
		while(sc.hasNext()){
			if(sc.hasNextInt())
				System.out.print(sc.nextInt()+" ");
			else sc.next();		
		}
	}
}