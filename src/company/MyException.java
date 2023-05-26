package company;

public class MyException extends RuntimeException{

    public MyException(String message) {
        System.out.println(message);

    }
}
