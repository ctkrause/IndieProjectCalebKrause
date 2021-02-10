import entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.UserDao;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    UserDao dao;

    @BeforeEach
    void setUp() {
        dao = new UserDao();
    }

    /**
     * Verifies gets all users successfully.
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAllUsers();
        assertEquals(6, users.size());
    }

}
