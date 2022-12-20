public class User {
  private String username;
  private String password;

  User(String username, String password) {

    this.username = username;
    this.password = password;

  }

  public String getName() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
