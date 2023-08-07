package hometask12;

public class UserValidator {
    public static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        // Validate login
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login must be less than 20 characters and not contain spaces");
        }

        // Validate password
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password must be less than 20 characters, not contain spaces, and contain at least one digit");
        }

        // Confirm password
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match");
        }

        return true;
    }
}

