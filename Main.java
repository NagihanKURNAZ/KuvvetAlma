import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	/*	Java döngüler ile girilen sayıya kadar olan 
		4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.  */
		
	
		        Scanner scan=new Scanner(System.in);
		        System.out.print("Sınır sayısı giriniz: ");
		        int sayı=scan.nextInt();
		        
		        for (int i=1;i<=sayı;i*=5){
		            System.out.print(i+ " ");
		        }
		        
		        System.out.println();
		        
		        for (int i=1;i<=sayı;i*=4){
		            System.out.print (i+" ");
		        }
		    }
		}