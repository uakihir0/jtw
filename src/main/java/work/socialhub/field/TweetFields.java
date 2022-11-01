package work.socialhub.field;

/**
 * filed list of tweet entity.
 * ツイートエンティティにおけるフィールド一覧
 */
public class TweetFields {

    public static TweetField Id = new TweetField("id");
    public static TweetField Text = new TweetField("text");
    public static TweetField Attachments = new TweetField("attachments");
    public static TweetField AuthorId = new TweetField("author_id");
    public static TweetField ContextAnnotations = new TweetField("context_annotations");
    public static TweetField ConversationId = new TweetField("conversation_id");
    public static TweetField CreatedAt = new TweetField("created_at");
    public static TweetField Entities = new TweetField("entities");
    public static TweetField EditControls = new TweetField("edit_controls");
    public static TweetField Geo = new TweetField("geo");
    public static TweetField InReplyToUserId = new TweetField("in_reply_to_user_id");
    public static TweetField Lang = new TweetField("lang");
    public static TweetField NonPublicMetrics = new TweetField("non_public_metrics");
    public static TweetField OrganicMetrics = new TweetField("organic_metrics");
    public static TweetField PossiblySensitive = new TweetField("possibly_sensitive");
    public static TweetField PromotedMetrics = new TweetField("promoted_metrics");
    public static TweetField PublicMetrics = new TweetField("public_metrics");
    public static TweetField ReferencedTweets = new TweetField("referenced_tweets");
    public static TweetField ReplySettings = new TweetField("reply_settings");
    public static TweetField Source = new TweetField("source");
    public static TweetField Withheld = new TweetField("withheld");

    /**
     * get all.
     * すべて取得
     */
    public static TweetField[] All = new TweetField[]{
            Id,
            Text,
            Attachments,
            AuthorId,
            ContextAnnotations,
            ConversationId,
            CreatedAt,
            Entities,
            EditControls,
            Geo,
            InReplyToUserId,
            Lang,
            NonPublicMetrics,
            OrganicMetrics,
            PossiblySensitive,
            PromotedMetrics,
            PublicMetrics,
            ReferencedTweets,
            ReplySettings,
            Source,
            Withheld
    };

    /**
     * List of fields that can be retrieved in the case of your own tweets.
     * 自分のツイートの場合に取得可能なフィールド一覧
     * (プロモーションツイートは、プロモツイートのみ取得可能)
     */
    public static TweetField[] Owned = new TweetField[]{
            Id,
            Text,
            Attachments,
            AuthorId,
            ContextAnnotations,
            ConversationId,
            CreatedAt,
            Entities,
            EditControls,
            Geo,
            InReplyToUserId,
            Lang,
            NonPublicMetrics,
            OrganicMetrics,
            PossiblySensitive,
            PublicMetrics,
            ReferencedTweets,
            ReplySettings,
            Source,
            Withheld
    };

    /**
     * List of fields that can be retrieved for tweets that don't belong to you.
     * 自分のものではないツイートの場合に取得可能なフィールド一覧
     */
    public static TweetField[] NotOwned = new TweetField[]{
            Id,
            Text,
            Attachments,
            AuthorId,
            ContextAnnotations,
            ConversationId,
            CreatedAt,
            Entities,
            EditControls,
            Geo,
            InReplyToUserId,
            Lang,
            PossiblySensitive,
            PublicMetrics,
            ReferencedTweets,
            ReplySettings,
            Source,
            Withheld
    };
}
