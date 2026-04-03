package encapsulationIntro;

public class InsufficientFundException extends RuntimeException{
    InsufficientFundException(String message){
        super(message);
    }
}
