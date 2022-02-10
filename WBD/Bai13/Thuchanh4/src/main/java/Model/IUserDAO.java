package Model;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers() throws SQLException;
    public List<User> selectAllUsersAsc();
    public List<User> selectAllUsersDesc();

    public List<User> searchUserByCountry(String countrySearch);

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    void addUserTransaction(User user, int[] permision);

    public void insertUpdateWithoutTransaction();
    public void insertUpdateUseTransaction();
}
