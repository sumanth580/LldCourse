package expection;

public class InvalidMoveExpection extends RuntimeException{
    public InvalidMoveExpection(String message){
        super(message);
    }
}
