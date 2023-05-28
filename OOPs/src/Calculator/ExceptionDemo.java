package Calculator;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int i = 9/0;

        }catch (Exception e){
            System.out.println("Error");
        }
        finally {
            System.out.println("Bye");
        }

    }
}
