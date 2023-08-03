import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class JDBCConnectionPool extends ObjectPool<Connection> {
    String dsn, usr, pwd;

    JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    Connection create() {
        try {
            return (DriverManager.getConnection(dsn, usr, pwd));
        } catch (SQLException e) {
            e.printStackTrace();
            return (null);
        }
    }

    void kill(Connection object) {
        try {
            ((Connection) object).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    boolean validate(Connection object) {
        try {
            return (!((Connection) object).isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}