import java.util.Scanner;

public class bai5 {
public static void main(String[] args) {
	int n;
	int tong=0;
	Scanner sc= new Scanner(System.in);
	
	do {
		System.out.println("Nhap so nguyen n :");
		n = sc.nextInt();
		tong+=n;
	}while(tong<=100);
		System.out.println("Tong cac so nguyen la "+tong);
	}
}

