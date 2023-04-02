package work.socialhub.api.resouce;

import work.socialhub.api.request.DMEventsRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.tweet.Tweet;

import java.util.List;

/**
 * ダイレクトメッセージに関連する操作の一覧
 * About Direct Message Lookup.
 * <a href="https://developer.twitter.com/en/docs/twitter-api/direct-messages/lookup/api-reference">API Reference</a>
 */
public interface DirectMessageResource {

    /**
     * GET /2/dm_events
     * Returns a list of Direct Messages for the authenticated user, both sent and received.
     * Direct Message events are returned in reverse chronological order.
     * Supports retrieving events from the previous 30 days.
     */
    Response<Root<List<Tweet>>> dmEvents(DMEventsRequest request);
}
