package models.enums;

public enum Messages {
    WRONG_PASSWORD("The password doesn't match"),
    NO_USER("No user found with this username!");

    private String message;

    Messages(String message) {
        this.message = message;
    }
}
