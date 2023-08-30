import java.util.Scanner;

class ValidationError extends Exception{
    ValidationError(String errorString){
        System.out.println(errorString);
    }
}
public class validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "ash";
        String password = "qwerty";
        System.out.println("Enter Username: ");
        String user = sc.nextLine();
        System.out.println("Enter Password: ");
        String pasw = sc.nextLine();

        try {
            if(!username.equals(user)){
                throw new ValidationError("Invalid Username");
            }
            if(!password.equals(pasw)){
                throw new ValidationError("Invalid Password");
            }else {
                System.out.println("Validation Successfull");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }    
}
