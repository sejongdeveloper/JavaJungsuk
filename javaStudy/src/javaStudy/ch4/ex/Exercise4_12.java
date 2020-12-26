package javaStudy.ch4.ex;

public class Exercise4_12 {
	public static void main(String[] args) {
		int count = 2;
		int max = 9;
		while(count <= max) {
			for(int i=1; i<=3; i++) {
				int legnth = count+2 > 9 ? 9 : count+2;
				for(int j=count; j<=legnth; j++) {
					System.out.printf("%d*%d=%d\t", j, i, i*j);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			count += 3;
		}
	}
}
