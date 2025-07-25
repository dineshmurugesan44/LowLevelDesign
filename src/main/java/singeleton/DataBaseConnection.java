package singeleton;

public class DataBaseConnection {

    private static  DataBaseConnection instance = null;


    private String url;
    private String username;
    private String password;

    private DataBaseConnection() {}

    public static DataBaseConnection getInstance() {
        if(instance == null) {
            instance = new DataBaseConnection();
        }
        return instance;
    }

   public void setUrl(String url) {
        this.url = url;
   }

   public String geturl(){
        return url;
   }

   public void setUsername(String username) {
        this.username = username;
   }
   public String getUsername() {
        return username;
   }
   public void setPassword(String password) {
        this.password = password;
   }
   public String getPassword() {
        return password;
   }

    @Override
    public String toString() {
        return "URL: " + url + ", Username: " + username + ", Password: " + password;
    }


}
