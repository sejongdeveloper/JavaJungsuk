package javaStudy.ch8.ex;

class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE; // �����ڵ�
	
	UnsupportedFuctionException() {
		this("�������� �ʴ� ����Դϴ�.", 100);
	}
	
	public UnsupportedFuctionException(String msg, int ERR_CODE) {
		super(msg);
		this.ERR_CODE = ERR_CODE;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "["+ERR_CODE+"]"+super.getMessage();
	}
}

public class Exercise8_9 {
	public static void main(String[] args) throws Exception
	{
		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.",100); 
	}

}
