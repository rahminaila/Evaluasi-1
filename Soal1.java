package bcgen9.day12;

import java.util.Scanner;

public class Soal1 {
	int a = 1;
	Scanner s=new Scanner(System.in);
	int n;
	public int getN() {
		System.out.print("Masukkan n: ");
		this.n = s.nextInt();
		return n;
		
	}
	public void deretGanjil() {
		for(int i=0; i<n*2; i++) {
			if(i%2 == 0) {
				continue;
			
		}
				System.out.print(a+"  ");
				a = a + 3;
		}
	}
	public void deretGanjil2() {
		for(int i=n*2; i>=0; i--) {
			if(i%2 == 0) {
				continue;
			}
			System.out.print(a+"  ");
			a = a + 3;
		}
		
	}
	public void print() {
		getN();
		deretGanjil();
		System.out.println();
		deretGanjil2();
	}
	public static void main(String[] args) {
		Soal1 run = new Soal1();
		run.print();
	}

}
