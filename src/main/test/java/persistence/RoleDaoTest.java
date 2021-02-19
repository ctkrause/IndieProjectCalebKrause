package persistence;

import entity.Role;
import entity.User;
import util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoleDaoTest {
    GenericDao genericDao;

    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(Role.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies gets all Roles successfully.
     */
    @Test
    void getAllRolesSuccess() {
        List<Role> Roles = genericDao.getAll();
        assertEquals(8, Roles.size());
    }

    /**
     * Verifies a Role is returned correctly based on id search
     */
    @Test
    void getByIdSuccess() {
        Role retrievedRole = (Role)genericDao.getById(11);
        assertNotNull(retrievedRole);
        assertEquals("BasicUser", retrievedRole.getTitle());
        assertEquals("caleb", retrievedRole.getUser().getName());
    }

    /**
     * Verify successful insert of a Role
     */
    @Test
    void insertSuccess() {
        UserDao userDao = new UserDao();
        User user = userDao.getById(6);
        String newTitle = "SuperAdmin";
        Role newRole = new Role(newTitle, user);
        int id = genericDao.insert(newRole);
        Role insertedRole = (Role)genericDao.getById(id);
        assertNotEquals(0, id);
        assertEquals(newTitle, insertedRole.getTitle());
        assertNotNull(insertedRole.getUser());
        assertEquals("Sheryl Krause" ,insertedRole.getUser().getName());
    }

    /**
     * Verify successful delete of Role
     */
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(9));
        assertNull(genericDao.getById(9));
    }

    /**
     * Verify successful update of Role
     */
    @Test
    void updateSuccess() {
        String newTitle = "SuperUser";
        Role RoleToUpdate = (Role)genericDao.getById(9);
        RoleToUpdate.setTitle(newTitle);
        genericDao.saveOrUpdate(RoleToUpdate);
        Role retrievedRole = (Role)genericDao.getById(9);
        assertEquals(newTitle, retrievedRole.getTitle());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Role> Roles = genericDao.getByPropertyLike("title", "m");
        assertEquals(1, Roles.size());
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Role> Roles = genericDao.getByPropertyEqual("title", "admin");
        assertEquals(1, Roles.size());
        assertEquals(9, Roles.get(0).getId());
    }

}

