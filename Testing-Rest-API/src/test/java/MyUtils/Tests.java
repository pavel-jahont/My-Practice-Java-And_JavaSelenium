package MyUtils;

import models.User;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tests {

    private String name = "pavel-jahont";
    private String url_api_github = "https://api.github.com/";
    private String url_api_github_users = "https://api.github.com/users/";

    @Test            @TestCaseId(" ID_0001 ")          @Stories("")
    public void checkUserRealUser() throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url_api_github_users + name);
        HttpResponse response = client.execute(request);
        Header[] headers = response.getAllHeaders();
        for (Header header : headers) {
            System.out.println("Key : " + header.getName()
                    + " ,     Value : " + header.getValue());
        }
        Assert.assertFalse(response.equals(HttpStatus.SC_NOT_FOUND));
    }
    @Test            @TestCaseId(" ID_0002 ")          @Stories("")
    public void gettingStatusLine() throws IOException {
        HttpUriRequest request2 = new HttpGet(url_api_github);
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request2);
        System.out.println(httpResponse.getStatusLine());
        System.out.println(httpResponse.getStatusLine().getStatusCode());
        System.out.println(httpResponse.getStatusLine().getReasonPhrase());
    }
    @Test            @TestCaseId(" ID_0003 ")            @Stories("")
    public void createNewHeaderAndCheckCreatingNewHeader() throws IOException {
        HttpUriRequest request = new HttpGet(url_api_github);
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
        httpResponse.setHeader(new BasicHeader("PavJ","Hello everyone!"));   // добавляем новый Header
        Header[] headers = httpResponse.getAllHeaders();
        for (int i = 0; i < headers.length; i++) {
            int x = i+1;
            System.out.print(x + "  ");
            System.out.println(headers[i]);
        }
        Assert.assertFalse(httpResponse.getHeaders("PavJ")[0].getValue().isEmpty());
        System.out.println(httpResponse.getHeaders("PavJ")[0]);
    }

    @Test            @TestCaseId(" ID_0004 ")            @Stories("")
    public void listMapAndCheckElement() throws IOException{
        URL obj = new URL(url_api_github);
        URLConnection conn = obj.openConnection();

        Map<String, List<String>> map = conn.getHeaderFields();

            System.out.println("Printing Response Header...\n");

            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println("Key : " + entry.getKey()
                        + "        ,Value : " + entry.getValue());
            }

            System.out.println("\nGet Response Header By Key ...\n");
            String server = conn.getHeaderField("Server");

            if (server == null) {
                System.out.println("Key 'Server' is not found!");
            } else {
                System.out.println("Server - " + server);
            }
    }

    @Test             @TestCaseId(" ID_0005 ")            @Stories("")
    public void listOfHeadersAndFindByElementOfArray() throws IOException{
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url_api_github);
        HttpResponse response = client.execute(request);

        System.out.println("Printing Response Header...\n");

        Header[] headers = response.getAllHeaders();
        for (Header header : headers) {
            System.out.println("Key : " + header.getName()
                    + " ,     Value : " + header.getValue());
        }
        System.out.println(headers[7].getName());
        System.out.println(headers[10].getValue());
        System.out.println("\nGet Response Header By Key ...\n");
        String server = response.getFirstHeader("Server").getValue();
        if (server == null) {
            System.out.println("Key 'Server' is not found!");
        } else {
            System.out.println("Server - " + server);
        }
    }

    @Test    @TestCaseId(" ID_0006 ")            @Stories("")
    public void listApiGitHub() throws IOException{
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url_api_github_users);
        HttpResponse response = client.execute(request);

        Header[] headers = response.getAllHeaders();
        for (Header header : headers) {
            System.out.println("Key : " + header.getName()
                    + " ,     Value : " + header.getValue());
        }
    }

    @Test         @TestCaseId(" ID_0007 ")            @Stories("")
    public void testResponse() {
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(url_api_github_users + name, User.class);
        System.out.println(user);
        Assert.assertTrue(user.getLogin().contains("pavel-jahont"));
        Assert.assertTrue(user.getEmail().contains("pavel.jahont@gmail.com"));
    }

    @Test         @TestCaseId(" ID_0008 ")            @Stories("")
    public void testEqualsFieldsUsers(){

        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(url_api_github_users + name, User.class);

        User localUser = new User("pavel-jahont", 19505424, "https://avatars1.githubusercontent.com/u/19505424?v=3",
                "", "https://api.github.com/users/pavel-jahont", "https://github.com/pavel-jahont",
                "https://api.github.com/users/pavel-jahont/followers",
                "https://api.github.com/users/pavel-jahont/following{/other_user}",
                "https://api.github.com/users/pavel-jahont/gists{/gist_id}",
                "https://api.github.com/users/pavel-jahont/starred{/owner}{/repo}",
                "https://api.github.com/users/pavel-jahont/subscriptions",
                "https://api.github.com/users/pavel-jahont/orgs", "https://api.github.com/users/pavel-jahont/repos",
                "https://api.github.com/users/pavel-jahont/events{/privacy}",
                "https://api.github.com/users/pavel-jahont/received_events",
                "User", false, "Pavel Jahont", null, null, null, "pavel.jahont@gmail.com",
                null, null, 10, 0, 0, 0, "2016-05-21T13:39:41Z", "2017-03-26T18:19:30Z");

        Assert.assertTrue(user.getLogin().equals(localUser.getLogin()));
        Assert.assertTrue(user.getId().equals(localUser.getId()));
        Assert.assertTrue(user.getAvatar_url().equals(localUser.getAvatar_url()));
        Assert.assertTrue(user.getGravatar_id().equals(localUser.getGravatar_id()));
        Assert.assertTrue(user.getUrl().equals(localUser.getUrl()));
        Assert.assertTrue(user.getHtml_url().equals(localUser.getHtml_url()));
        Assert.assertTrue(user.getFollowers_url().equals(localUser.getFollowers_url()));
        Assert.assertTrue(user.getFollowing_url().equals(localUser.getFollowing_url()));
        Assert.assertTrue(user.getGists_url().equals(localUser.getGists_url()));
        Assert.assertTrue(user.getStarred_url().equals(localUser.getStarred_url()));
        Assert.assertTrue(user.getSubscriptions_url().equals(localUser.getSubscriptions_url()));
        Assert.assertTrue(user.getOrganizations_url().equals(localUser.getOrganizations_url()));
        Assert.assertTrue(user.getRepos_url().equals(localUser.getRepos_url()));
        Assert.assertTrue(user.getEvents_url().equals(localUser.getEvents_url()));
        Assert.assertTrue(user.getReceived_events_url().equals(localUser.getReceived_events_url()));
        Assert.assertTrue(user.getType().equals(localUser.getType()));
        Assert.assertTrue(user.getSite_admin().equals(localUser.getSite_admin()));
        Assert.assertTrue(user.getName().equals(localUser.getName()));
        Assert.assertTrue(user.getCompany() == localUser.getCompany());
        Assert.assertTrue(user.getBlog() == localUser.getBlog());
        Assert.assertTrue(user.getLocation() == localUser.getLocation());
        Assert.assertTrue(user.getEmail().equals(localUser.getEmail()));
        Assert.assertTrue(user.getHireable() == localUser.getHireable());
        Assert.assertTrue(user.getBio() == localUser.getBio());
        Assert.assertTrue(user.getPublic_repos().equals(localUser.getPublic_repos()));
        Assert.assertTrue(user.getPublic_gists().equals(localUser.getPublic_gists()));
        Assert.assertTrue(user.getFollowers().equals(localUser.getFollowers()));
        Assert.assertTrue(user.getFollowing().equals(localUser.getFollowing()));
        Assert.assertTrue(user.getCreated_at().equals(localUser.getCreated_at()));
        Assert.assertTrue(user.getUpdated_at().equals(localUser.getUpdated_at()));
        System.out.println();
        System.out.println("  ***  Тест прошёл успешно! ***  ");
    }

    @Test         @TestCaseId(" ID_0009 ")            @Stories("")
    public void testPostUser() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("login", "shitbird");
        params.put("id", "50");
        params.put("avatar_url", "https://avatars3.githubusercontent.com/u/50?v=3");
        params.put("gravatar_id", "");
        params.put("url", "https://api.github.com/users/shitbird");
        params.put("html_url", "https://github.com/shitbird");
        params.put("followers_url", "https://api.github.com/users/shitbird/followers");
        params.put("following_url", "https://api.github.com/users/shitbird/following{/other_user}");
        params.put("gists_url", "https://api.github.com/users/shitbird/gists{/gist_id}");
        params.put("starred_url", "https://api.github.com/users/shitbird/starred{/owner}{/repo}");
        params.put("subscriptions_url", "https://api.github.com/users/shitbird/subscriptions");
        params.put("organizations_url", "https://api.github.com/users/shitbird/orgs");
        params.put("repos_url", "https://api.github.com/users/shitbird/repos");
        params.put("events_url", "https://api.github.com/users/shitbird/events{/privacy}");
        params.put("received_events_url", "https://api.github.com/users/shitbird/received_events");
        params.put("type", "User");
        params.put("site_admin", "false");

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity("https://api.github.com/users", params, String.class );
    }

    @Test       @TestCaseId(" ID_0010 ")            @Stories("")
    public void testPostEmail(){
        String url = "https://app.example.com/hr/email";

        Map<String, String> params = new HashMap<String, String>();
        params.put("email", "pavel.jahont@example.com");

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity( url, params, String.class );
    }
}
