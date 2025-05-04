public class Admin {
    private String username = "Admin175";
    private String password = "Password175";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}
