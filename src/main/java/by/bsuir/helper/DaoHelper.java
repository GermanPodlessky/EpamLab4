package by.bsuir.helper;

/**
 * The type Dao helper.
 */
public class DaoHelper {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/restaurant?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String username ="root";
    private static final String password ="root";

    /**
     * Gets url.
     *
     * @return the url
     */
    public static String getUrl() {
        return url;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public static String getUsername() {
        return username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public static String getPassword() {
        return password;
    }
}
