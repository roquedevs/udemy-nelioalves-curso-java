package jdbc.config;

import jdbc.exceptions.DatabaseException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public final class DatabaseConfig {

    private static final String PROPERTIES_FILE = "src/jdbc/db.properties";
    private static Connection connection;

    private DatabaseConfig() {
        throw new InstantiationError("Must not instantiate this class");
    }

    private static Properties loadProperties() {
        try (FileInputStream fis = new FileInputStream(PROPERTIES_FILE)) {
            Properties prop = new Properties();
            prop.load(fis);
            return prop;
        }
        catch (IOException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties prop = loadProperties();
                String url = prop.getProperty("url");
                connection = DriverManager.getConnection(url, prop);
                return connection;
            }
            catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            }
            catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            }
            catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            }
            catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    }

    public static <T extends AutoCloseable> void close(T resource) {
        if (resource != null) {
            try {
                resource.close();
            }
            catch (Exception e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    }
}
