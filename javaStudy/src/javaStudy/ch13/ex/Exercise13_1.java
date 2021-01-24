package javaStudy.ch13.ex;

class Exercise13_1 {
	public static void main(String args[]) {
//		Thread th1 = new Thread(new Thread1());
		Thread th1 = new Thread(() -> {
			for(int i=0; i < 300; i++) {
				System.out.print('-');
			}
		});
		
		th1.start();
	}
}

class Thread1 implements Runnable {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print('-');
		}
	}
}

