package caleb.indie.persistence;

import caleb.indie.entity.JobsItem;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utilities.PropertiesLoaderInterface;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Properties;

public class ApiDao implements PropertiesLoaderInterface {

    private final Logger logger = LogManager.getLogger();
    public static final String PROPERTIES = "/application.properties";
    public static final String URL = "URL";
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    private Properties properties;

    public ApiDao() {
        properties = loadProperties(PROPERTIES);
    }

    public JobsItem getAllJobs() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(URL);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        JobsItem jobsItem = mapper.readValue(response, JobsItem.class);
        System.out.println(jobsItem);
        return jobsItem;
    }


}
