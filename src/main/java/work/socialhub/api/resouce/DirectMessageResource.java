package work.socialhub.api.resouce;

import work.socialhub.api.response.Response;

/**
 * ダイレクトメッセージに関連する操作の一覧。
 */
interface DirectMessageResource {

    /**
     * GET /2/dm_events
     * Returns a list of Direct Messages for the authenticated user, both sent and received.
     * Direct Message events are returned in reverse chronological order.
     * Supports retrieving events from the previous 30 days.
     */
    Response<String> dmEvents();
}
