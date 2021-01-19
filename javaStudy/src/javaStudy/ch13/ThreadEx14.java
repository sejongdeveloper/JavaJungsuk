package javaStudy.ch13;

import javax.swing.JOptionPane;

public class ThreadEx14 {
	public static void main(String[] args) {
		ThreadEx14_1 th1 = new ThreadEx14_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		th1.interrupt(); // interrupt()�� ȣ���ϸ�, interrupted���°� true�� �ȴ�.
		System.out.println("isInterrupted() : " + th1.isInterrupted());
	}
}

class ThreadEx14_1 extends Thread {
	@Override
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {} // 1�� ����
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}
