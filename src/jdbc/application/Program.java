package jdbc.application;

import jdbc.config.DatabaseConfig;
import jdbc.exceptions.DatabaseException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {

        //getData();
        insertData();
    }

    public static void getData() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseConfig.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from department");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Id") + " - " + resultSet.getString("name"));
            }
        }
        catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        }
        finally {
            DatabaseConfig.close(resultSet);
            DatabaseConfig.close(statement);
            DatabaseConfig.close(connection);
        }
    }

    public static void insertData() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            connection = DatabaseConfig.getConnection();
            preparedStatement = connection.prepareStatement("insert into seller(Name, Email, BirthDate, BaseSalary, DepartmentId) values(?,?,?,?,?)");

            preparedStatement.setString(1, "Carl Purple");
            preparedStatement.setString(2, "carl@gmail.com");
            preparedStatement.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            preparedStatement.setDouble(4, 3000.0);
            preparedStatement.setInt(5, 4);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        finally {
            DatabaseConfig.closeStatement(preparedStatement);
            DatabaseConfig.closeConnection();
        }
    }

    /**
     * Inserção com recuperação de ID
     */
    public static void insertedData2() {
        String sql = "insert into seller(Name, Email, BirthDate, BaseSalary, DepartmentId) values(?,?,?,?,?)";

        try (
                Connection conn = DatabaseConfig.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {

            ps.setString(1, "Juan Sant'Anna");
            ps.setString(2, "juan@gmail.com");
            ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            ps.setDouble(4, 3000.0);
            ps.setInt(5, 4);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            }
            else {
                System.out.println("No rows affected!");
            }
        }
        catch (SQLException | ParseException e) {
            throw new DatabaseException(e.getMessage());
        }
    }
}
