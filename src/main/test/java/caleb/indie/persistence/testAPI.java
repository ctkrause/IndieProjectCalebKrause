package caleb.indie.persistence;

import caleb.indie.entity.Company;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAPI {

    @Test
    public void testapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.adzuna.com/v1/api/jobs/us/search/1?app_id=d6cdb27d&app_key=f8b0b42a904a8e12bdcc932d69ca4304&results_per_page=1&what=web&where=53226");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Company company = mapper.readValue(response, Company.class);
        assertEquals("Adzuna::API::Response::JobSearchResults", company.getCLASS());
    }
}
