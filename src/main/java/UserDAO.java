import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static final String CREATE_USER_QUERY = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    private static final String FIND_USER_BY_ID="SELECT * FROM users WHERE id=";
    private static final String ALL_USERS="SELECT * FROM users";
    private static final String DELETE_USER_BY_ID="DELETE FROM users WHERE id=";
    public void create(User user) {
        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
            statement.setString(3, hashPassword(user.getPassword()));
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                user.setId(resultSet.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    public User read(int userId) {
        try (Connection conn = DbUtil.getConnection()) {
            Statement statement = conn.createStatement();
            String sql=FIND_USER_BY_ID+userId+";";
            ResultSet resultSet= statement.executeQuery(sql);
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String userName = resultSet.getString("userName");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                User user = new User(id, userName, email, password);
                return user;
            }else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void update(int id,String newuserName,String newemail,String newpassword) {
        try (Connection conn = DbUtil.getConnection()) {
            Statement statement=conn.createStatement();
                    String sql="UPDATE users set userName='"+newuserName+"', email='"+newemail+"',password='"+hashPassword(newpassword)+"' where id="+id+";";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<User> findall(){
        try (Connection conn = DbUtil.getConnection()) {
            Statement statement = conn.createStatement();
            String sql1=ALL_USERS;
            ResultSet rs = statement.executeQuery(sql1);
            List<User> users=new ArrayList<>();
            while (rs.next()){
            int id=rs.getInt("id");
            String userName=rs.getString("userName");
            String email=rs.getString("email");
            String password=rs.getString("password");
            User user=new User(id,userName,email,password);
            users.add(user);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void delete(int userId) {
        try (Connection conn = DbUtil.getConnection()) {
            Statement statement = conn.createStatement();
            String sql1=DELETE_USER_BY_ID+userId+";";
            statement.execute(sql1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
