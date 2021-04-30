package caleb.indie.persistence;

import caleb.indie.entity.JobsItem;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestServiceClient {

    @Test
    public void testswapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://remotive.io/api/remote-jobs?company_name=Commit");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JobsItem jobs = mapper.readValue(response, JobsItem.class);
        assertNotNull(jobs);
        String expectedCompany = "Commit";
        assertEquals(expectedCompany, jobs.getJobs().get(0).getCompanyName());
    }
}
