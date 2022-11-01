package work.socialhub.field;

/**
 * expansions
 * 拡張リスト
 * https://developer.twitter.com/en/docs/twitter-api/expansions
 */
public class Expansions {

    public static Expansion PinnedTweetId = new Expansion("pinned_tweet_id");
    public static Expansion AttachmentsPollIds = new Expansion("attachments.poll_ids");
    public static Expansion AttachmentsMediaKeys = new Expansion("attachments.media_keys");
    public static Expansion AuthorId = new Expansion("author_id");
    public static Expansion EntitiesMentionsUsername = new Expansion("entities.mentions.username");
    public static Expansion GeoPlaceId = new Expansion("geo.place_id");
    public static Expansion InReplyToUserId = new Expansion("in_reply_to_user_id");
    public static Expansion ReferencedTweetsId = new Expansion("referenced_tweets.id");
    public static Expansion ReferencedTweetsIdAuthorId = new Expansion("referenced_tweets.id.author_id");
    public static Expansion SenderId = new Expansion("sender_id");
    public static Expansion ParticipantIds = new Expansion("participant_ids");

    /**
     * get all.
     * すべて取得
     */
    public static Expansion[] All = new Expansion[]{
            PinnedTweetId,
            AttachmentsPollIds,
            AttachmentsMediaKeys,
            AuthorId,
            EntitiesMentionsUsername,
            GeoPlaceId,
            InReplyToUserId,
            ReferencedTweetsId,
            ReferencedTweetsIdAuthorId
    };

    /**
     * get tweet's expansion.
     * ツイート向けののもを取得
     */
    public static Expansion[] Tweet = new Expansion[]{
            AuthorId,
            ReferencedTweetsId,
            InReplyToUserId,
            AttachmentsMediaKeys,
            AttachmentsPollIds,
            GeoPlaceId,
            EntitiesMentionsUsername,
            ReferencedTweetsIdAuthorId,
    };

    /**
     * get user's expansion.
     * ユーザー向けののもを取得
     */
    public static Expansion[] User = new Expansion[]{
            PinnedTweetId
    };

    /**
     * get dm expansion.
     * DM 向けののもを取得
     */
    public static Expansion[] DM = new Expansion[]{
            AttachmentsMediaKeys,
            ReferencedTweetsId,
            SenderId,
            ParticipantIds,
    };

}
