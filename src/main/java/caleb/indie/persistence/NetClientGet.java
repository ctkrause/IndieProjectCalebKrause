package caleb.indie.persistence;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class NetClientGet {

    public static String retrieveRemote() throws IOException {
        HttpGet request = new HttpGet("GET https://remotive.io/api/remote-jobs");
        CloseableHttpClient client = HttpClients.createDefault();
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        System.out.println(result);
        return result;
    }
}