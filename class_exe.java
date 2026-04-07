class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class class_exe {
    public static void main(String[] args) {
        try {
            int age = 17;

            if (age < 18) {
                throw new CustomException("You are not eligible to vote");
            } else {
                System.out.println("Congratulations! You are eligible to vote");
            }

        } catch (CustomException e) {
            System.out.println("Custom exception occurred: " + e.getMessage());
        }
    }
}