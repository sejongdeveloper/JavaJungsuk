package javaStudy.ch8;

public class ChainedExceptionEx {
	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main�� ��
	
	static void install() throws InstallException {
		try {
			startInstall();	// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles(); // ���ϵ��� �����Ѵ�.
		} catch (SpaceException se) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		} // try�� ��
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {	// �߿��� ��ġ ������ ������...
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		
		if(!enoughMemory()) {	// ����� �޸𸮰� ������...
			throw new MemoryException("�޸𸮰� �����մϴ�.");
//			throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�."));
		}
	} // startInstall�޼����� ��
	
	static void copyFiles() { /* ���ϵ��� �����ϴ� �ڵ带 ���´�. */ }
	static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�. */ }
	
	static boolean enoughSpace() {
		// ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return false;
	}
	static boolean enoughMemory() {
		// ��ġ�ϴµ� �ʿ��� �޸� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return true;
	}
} // ExceptionTestŬ������ ��

class InstallException extends Exception {
	public InstallException(String msg) {
		super(msg);
	}
}

class SpaceException extends Exception {
	public SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	public MemoryException(String msg) {
		super(msg);
	}
}
