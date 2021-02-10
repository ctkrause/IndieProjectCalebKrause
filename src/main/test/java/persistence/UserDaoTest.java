package persistence;

import entity.User;
import util.Database;
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
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies gets all users successfully.
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAllUsers();
        assertEquals(6, users.size());
    }

    /**
     * Verifies a user is returned correctly based on id search
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(1);
        assertNotNull(retrievedUser);
        assertEquals("caleb", retrievedUser.getName());
    }

    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {

        User newUser = new User(7, "freddyFlinstone", "Fred Flinstone", "Caveman", "Running his little car thingy");
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertEquals("Fred Flinstone", insertedUser.getName());
    }

    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(6));
        assertNull(dao.getById(6));
    }

    /**
     * Verify successful update of user
     */
    @Test
    void updateSuccess() {
        String newName = "Hannah Banana";
        User userToUpdate = dao.getById(3);
        userToUpdate.setName(newName);
        dao.saveOrUpdate(userToUpdate);
        User retrievedUser = dao.getById(3);
        assertEquals(newName, retrievedUser.getName());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = dao.getByPropertyLike("name", "c");
        assertEquals(2, users.size());
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = dao.getByPropertyLike("name", "Levi");
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getId());
    }

}
