import java.util.Scanner;

public class bai8 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	int arr[];
	do {
		System.out.println("Nhap so luong so nguyen n: ");
		n = sc.nextInt();
	} while (n <= 0);
	
	arr = new int[n];
	for (int i = 0; i < n; i++) {
		System.out.println("------------");
		System.out.println("Nhap so nguyen thu " + i + ": ");
		arr[i] = sc.nextInt();
	}
	System.out.println("----------------");
	System.out.println("Day so nguyen da nhap la: ");
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
		int avg=0;
	for(int i=0;i<n;i++) {
		avg+=arr[i];
	} 
	System.out.println("-----------------");
	System.out.println("Trung binh cong cua day so la: "+(float)avg/n);

		
	}
}