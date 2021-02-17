package persistence;

import entity.Role;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

public class RoleDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets all Roles.
     *
     * @return the all Roles
     */
    public List<Role> getAllRoles() {

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Role> query = builder.createQuery(Role.class);
        Root<Role> root = query.from(Role.class);
        List<Role> Roles = session.createQuery(query).getResultList();
        session.close();
        return Roles;
    }

    /**
     * Gets a Role by id
     * @param id Roles id to search by
     * @return a Role
     */
    public Role getById(int id) {
        Session session = sessionFactory.openSession();
        Role Role = session.get(Role.class, id);
        session.close();
        return Role;
    }

    /**
     * update Role
     * @param Role  Role to be inserted or updated
     */
    public void saveOrUpdate(Role Role) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(Role);
        transaction.commit();
        session.close();
    }

    /**
     * update Role
     * @param Role  Role to be inserted or updated
     * @return id of the inserted Role
     */
    public int insert(Role Role) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(Role);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete a Role
     * @param Role Role to be deleted
     */
    public void delete(Role Role) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(Role);
        transaction.commit();
        session.close();
    }


    /**
     * Get Role by property (exact match)
     * sample usage: getByPropertyEqual("lastName", "Curry")
     *
     * @param propertyName entity property to search by
     * @param value value of the property to search for
     * @return list of Roles meeting the criteria search
     */
    public List<Role> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for Role with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Role> query = builder.createQuery( Role.class );
        Root<Role> root = query.from( Role.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Role> Roles = session.createQuery( query ).getResultList();

        session.close();
        return Roles;
    }

    /**
     * Get Role by property (like)
     * sample usage: getByPropertyLike("lastName", "C")
     *
     * @param propertyName entity property to search by
     * @param value value of the property to search for
     * @return list of Roles meeting the criteria search
     */
    public List<Role> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for Role with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Role> query = builder.createQuery( Role.class );
        Root<Role> root = query.from( Role.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Role> Roles = session.createQuery( query ).getResultList();
        session.close();
        return Roles;
    }


}
