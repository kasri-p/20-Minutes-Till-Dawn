package models;

public class User {
    private String username;
    private String password;
    private String email;
    private int SecurityQuestionIndex;
    private String SecurityAnswer;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSecurityAnswer() {
        return SecurityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        SecurityAnswer = securityAnswer;
    }

    public int getSecurityQuestionIndex() {
        return SecurityQuestionIndex;
    }

    public void setSecurityQuestionIndex(int securityQuestionIndex) {
        SecurityQuestionIndex = securityQuestionIndex;
    }
}
