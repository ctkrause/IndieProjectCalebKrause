package caleb.indie.persistence;

import caleb.indie.entity.Pet;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAPI {

    @Test
    public void testapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://petstore.swagger.io/v2/pet/5");
        Invocation.Builder builder = target.request();
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Pet pet = mapper.readValue(response, Pet.class);
        String expectedName = "jimmy";
        assertEquals(expectedName, pet.getName());
    }
}
