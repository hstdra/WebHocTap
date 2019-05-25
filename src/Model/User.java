package Model;

import java.sql.*;

public class User {
    private String userID, fullName, password, email, status, userRight;

    private User(String userID, String fullName, String password, String email, String status, String userRight) {
        this.userID = userID;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.status = status;
        this.userRight = userRight;
    }

    public static User login(String id, String pw) {
        ResultSet resultSet = ConnectDatabase.executeQuery(String.format("Select * from Users where UserID='%s' and Password='%s'", id, pw));
        try {
            assert resultSet != null;
            if (resultSet.next()) {
                String userID = resultSet.getString(1);
                String fullName = resultSet.getString(2);
                String password = resultSet.getString(3);
                String email = resultSet.getString(4);
                String status = resultSet.getString(5);
                String userRight = resultSet.getString(6);

                return new User(userID, fullName, password, email, status, userRight);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getUserID() {
        return userID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public String getUserRight() {
        return userRight;
    }
}
