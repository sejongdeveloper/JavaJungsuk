package javaStudy.ch13.ex;

class Exercise13_7 {
	static boolean stopped = false;

	public static void main(String[] args) {
		Thread5 th1 = new Thread5();
		th1.start();
		try {
			Thread.sleep(6 * 1000);
		} catch (Exception e) {
		}
		stopped = true; // 쓰레드를 정지시킨다.
		th1.interrupt();
		System.out.println("stopped");
		// 01을 출력하고 1초일 때 stopped를 호출했지만 2초간 정지상태이기 때문에 2초후에 정지 
	}
}

class Thread5 extends Thread {
	public void run() {
//   Exercise13_7.stopped의 값이 false인 동안 반복한다. 
		for (int i = 0; !Exercise13_7.stopped; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3 * 1000);
			} catch (Exception e) {
				break;
			}
		}
	} // run()
}
