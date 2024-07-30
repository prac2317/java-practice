package jungsuk.ch8;

public class Exercise8_9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFuctionException extends RuntimeException {

    private final int ERR_CODE;

    public UnsupportedFuctionException(String message, int errCode){
        super(message);
        this.ERR_CODE = errCode;
    }

    public int getERR_CODE(){
        return ERR_CODE;
    }

    @Override
    public String getMessage(){
        String message = super.getMessage();
        return "[" + getERR_CODE() + "]" + message;
    }
}


