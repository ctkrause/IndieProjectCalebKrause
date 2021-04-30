package caleb.indie.persistence;

import caleb.indie.entity.JobsItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utilities.PropertiesLoaderInterface;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Properties;

public class ApiDao implements PropertiesLoaderInterface {

    private final Logger logger = LogManager.getLogger();
    public static final String PROPERTIES = "/application.properties";
    public static final String URL = "url";
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    private Properties properties;

    public ApiDao() {
        properties = loadProperties(PROPERTIES);
    }

    public List<JobsItem> getAllJobs() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<JobsItem> query = builder.createQuery(JobsItem.class);
        Root<JobsItem> root = query.from(JobsItem.class);
        List<JobsItem> recipes = session.createQuery(query).getResultList();
        session.close();
        return recipes;
    }


}
