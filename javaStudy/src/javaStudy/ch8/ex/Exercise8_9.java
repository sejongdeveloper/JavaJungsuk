package javaStudy.ch8.ex;

class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE; // 에러코드
	
	UnsupportedFuctionException() {
		this("지원하지 않는 기능입니다.", 100);
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
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100); 
	}

}
