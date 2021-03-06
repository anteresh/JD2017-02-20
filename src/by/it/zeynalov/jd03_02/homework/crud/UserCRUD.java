package by.it.zeynalov.jd03_02.homework.crud;


import by.it.zeynalov.jd03_02.homework.beans.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserCRUD {
    public boolean create(User user) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format(
                    "INSERT INTO `users`(`Login`, `Password`, `Email`, `Fc_rolles`) " +
                            "VALUES ('%s','%s','%s',%d);",
                    user.getLogin(), user.getPassword(), user.getEmail(), user.getFc_rolles()
            );
            if (1 == statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)) {
                ResultSet keys = statement.getGeneratedKeys();
                if (keys.next()) {
                    int id = keys.getInt(1);
                    user.setId(id);
                    return true;
                }
            }
            return false;
        }
    }

    public User read(User user) throws SQLException {
        User result = null;
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format(
                    "SELECT `ID`, `Login`, `Password`, `Email`, `Fc_rolles` FROM `users` WHERE ID=%d",
                    user.getId()
            );
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                result = new User(
                        rs.getInt("ID"),
                        rs.getString("Login"),
                        rs.getString("Password"),
                        rs.getString("Email"),
                        rs.getInt("Fc_rolles")
                );
            }
        }
        return result;
    }

    public List<User> readAll() throws SQLException {
        List<User> result = new ArrayList<>();
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = "SELECT ID, Login, Password, Email, Fc_rolles FROM users";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                result.add(new User(
                        rs.getInt("ID"),
                        rs.getString("Login"),
                        rs.getString("Password"),
                        rs.getString("Email"),
                        rs.getInt("Fc_rolles")
                ));
            }
        }
        return result;
    }

    public boolean update(User user) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format(
                    "UPDATE `users` SET " +
                            "`Login`='%s'," +
                            "`Password`='%s'," +
                            "`Email`='%s'," +
                            "Fc_rolles`=%d " +
                            "WHERE ID=%d",
                    user.getLogin(),
                    user.getPassword(),
                    user.getEmail(),
                    user.getFc_rolles(),
                    user.getId()
            );
            System.out.println(sql);
            return (1 == statement.executeUpdate(sql));
        }
    }

    public boolean delete(User user) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format(
                    "DELETE FROM `users` WHERE ID=%d",
                    user.getId()
            );
            return (1 == statement.executeUpdate(sql));
        }
    }
}
