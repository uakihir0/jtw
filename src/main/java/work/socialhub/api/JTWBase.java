package work.socialhub.api;

import com.google.gson.Gson;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;
import twitter4j.HttpClient;
import twitter4j.HttpParameter;
import twitter4j.JSONObject;
import twitter4j.TwitterException;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;
import work.socialhub.api.request.Request;
import work.socialhub.api.response.Response;

import java.util.Map;
import java.util.stream.Collectors;

public abstract class JTWBase {

    protected static String REST_BASE = "https://api.twitter.com/2/";

    protected static Gson gson = new Gson();

    protected Authorization auth;
    protected Configuration conf;
    protected HttpClient client;

    protected JTWBase(
            Authorization authorization,
            Configuration configuration,
            HttpClient httpClient) {
        this.auth = authorization;
        this.conf = configuration;
        this.client = httpClient;
    }

    protected HttpParameter[] toParams(Map<String, Object> params) {
        return params.entrySet().stream().map(e -> {
                    if (e.getValue() instanceof String) {
                        return new HttpParameter(e.getKey(), (String) e.getValue());
                    }
                    if (e.getValue() instanceof Integer) {
                        return new HttpParameter(e.getKey(), (Integer) e.getValue());
                    }
                    throw new IllegalStateException("Unsupported Type: "
                            + e.getValue().getClass().getName());
                })
                .collect(Collectors.toList())
                .toArray(new HttpParameter[]{});
    }

    protected <T> Response<T> proceed(JTWProcedure<T> supplier) {
        try {
            return new Response<>(supplier.run());
        } catch (TwitterException e) {
            // FIXME
            throw new RuntimeException(e);
        }
    }

    public interface JTWProcedure<T> {
        T run() throws TwitterException;
    }

    /**
     * Send GET Request.
     */
    protected String get(String path, Request request) throws TwitterException {
        return client.get(
                        (REST_BASE + path),
                        toParams(request.getParams()),
                        auth,
                        null)
                .asString();
    }

    /**
     * Send POST Request.
     */
    protected String post(String path, Request request) throws TwitterException {
        return client.post(
                        (REST_BASE + path),
                        jsonParams(request),
                        auth,
                        null)
                .asString();
    }

    /**
     * Send DELETE Request.
     */
    protected String delete(String path, Request request) throws TwitterException {
        return client.delete(
                        (REST_BASE + path),
                        jsonParams(request),
                        auth,
                        null)
                .asString();
    }

    private HttpParameter[] jsonParams(Request request) {
        if (request == null) return null;
        JSONObject json = new JSONObject(gson.toJson(request.getParams()));
        return new HttpParameter[]{new HttpParameter(json)};
    }
}
