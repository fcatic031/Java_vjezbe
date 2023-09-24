package monastery.util;

public class MonasteryException extends Exception{

    private static String message;

    public MonasteryException(String message){
        super(message);
        this.message=message;
    }

    public String getMessage(){
        return message;
    }

}
