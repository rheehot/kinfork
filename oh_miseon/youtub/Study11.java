import java.util.Scanner;


public class Study11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++){
			
			if(i%2==0){
				for(int j=0; j>(-1*n); j--){
					System.out.printf("%4d", i*n+j);
				}
			}else{
				for(int j=(-1*n)+1; j <1; j++){
					System.out.printf("%4d", i*n+j);
				}
			}
			System.out.println();
		}
	}
}
