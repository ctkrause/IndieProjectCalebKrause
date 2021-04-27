package caleb.indie.persistence;

import caleb.indie.entity.Response;
import caleb.indie.entity.ResultsItem;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class JobService {
    private static WebTarget resource = ClientBuilder.newBuilder()
            .build().target("https://api.adzuna.com/v1/api/jobs/us/search/20?app_id=d6cdb27d&app_key=f8b0b42a904a8e12bdcc932d69ca4304&results_per_page=20");

    public static List<ResultsItem> fetchJobs(int offset, int num) {
        Response res = resource.queryParam("seed", 1)
                .queryParam("results", num).queryParam("page", 1)
                .request(MediaType.APPLICATION_JSON).get(Response.class);
        return res.getResults();
    }
}
