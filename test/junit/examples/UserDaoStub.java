package junit.examples;

import static org.junit.Assert.*;

public class UserDaoStub implements UserDao {

    @Override
    public User findById(String userId) throws UserNotFoundException {
        throw new UserNotFoundException("connection error");
    }
}