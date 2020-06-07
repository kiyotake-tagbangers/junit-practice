package junit.examples;

public interface UserDao {

    User findById(String userId) throws UserNotFoundException;
}
