package caleb.indie.persistence;

import caleb.indie.entity.JobsItem;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.PropertiesLoaderInterface;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Properties;

/**
 * The type Api dao.
 */
public class ApiDao implements PropertiesLoaderInterface {
    private final Logger logger = LogManager.getLogger();
    /**
     * The constant PROPERTIES_PATH.
     */
    public static final String PROPERTIES_PATH = "/application.properties";
    /**
     * The constant PROPERTY_URL.
     */
    public static final String PROPERTY_URL = "URL";

    private Properties properties;

    /**
     * Instantiates a new Api dao.
     */
    public ApiDao() {
        properties = loadProperties(PROPERTIES_PATH);
    }

    /**
     * Gets all jobs.
     *
     * @return the all jobs
     * @throws Exception the exception
     */
    public JobsItem getAllJobs() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://remotive.io/api/remote-jobs");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        JobsItem jobbies = mapper.readValue(response, JobsItem.class);
        return jobbies;
    }

    /**
     * Gets jobs by company.
     *
     * @param searchTerm the search term
     * @return the jobs by company
     * @throws Exception the exception
     */
    public JobsItem getJobsByCompany(String searchTerm) throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://remotive.io/api/remote-jobs?company_name=" + searchTerm);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        JobsItem jobbies = mapper.readValue(response, JobsItem.class);
        return jobbies;
    }

    /**
     * Gets jobs by category.
     *
     * @param searchTerm the search term
     * @return the jobs by category
     * @throws Exception the exception
     */
    public JobsItem getJobsByCategory(String searchTerm) throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://remotive.io/api/remote-jobs?category=" + searchTerm);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        JobsItem jobbies = mapper.readValue(response, JobsItem.class);
        return jobbies;
    }

    /**
     * Gets jobs by description.
     *
     * @param searchTerm the search term
     * @return the jobs by description
     * @throws Exception the exception
     */
    public JobsItem getJobsByDescription(String searchTerm) throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://remotive.io/api/remote-jobs?search=" + searchTerm);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        JobsItem jobbies = mapper.readValue(response, JobsItem.class);
        return jobbies;
    }

}
