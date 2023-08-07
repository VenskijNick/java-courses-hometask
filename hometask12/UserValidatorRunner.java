package hometask12;

public class UserValidatorRunner {
    public static void main(String[] args) {
        String login = "mylogin";
        String password = "mypassword1";
        String confirmPassword = "mypassword1";

        try {
            boolean isValid = UserValidator.validate(login, password, confirmPassword);
            System.out.println("Validation result: " + isValid);
        } catch (WrongLoginException e) {
            System.out.println("Invalid login: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }
}
