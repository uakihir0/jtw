package work.socialhub.api.request;

import work.socialhub.field.TweetField;

import java.util.Map;

public class DMEventsRequest implements Request {

    private TweetField[] tweetFields;


    @Override
    public Map<String, Object> getParams() {
        return null;
    }
}
