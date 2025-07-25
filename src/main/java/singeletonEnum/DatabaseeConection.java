package singeletonEnum;

public enum DatabaseeConection {

    INSTANCE();




    private String url;
    private String username;
    private String password;

    public void set_values(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String get_username() {
        return username;

    }



}
