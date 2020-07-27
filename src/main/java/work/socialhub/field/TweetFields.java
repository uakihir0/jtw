package work.socialhub.field;

/**
 * filed list of tweet entity.
 * ツイートエンティティにおけるフィールド一覧
 */
public class TweetFields {

    public static TweetField Id = new TweetField("id");
    public static TweetField Text = new TweetField("text");
    public static TweetField AuthorId = new TweetField("author_id");
    public static TweetField Attachments = new TweetField("attachments");
    public static TweetField Geo = new TweetField("geo");
    public static TweetField Lang = new TweetField("lang");
    public static TweetField Source = new TweetField("source");
    public static TweetField Entities = new TweetField("entities");
    public static TweetField CreatedAt = new TweetField("created_at");
    public static TweetField InReplyToUserId = new TweetField("in_reply_to_user_id");
    public static TweetField ContextAnnotations = new TweetField("context_annotations");
    public static TweetField PossiblySensitive = new TweetField("possibly_sensitive");
    public static TweetField ReferencedTweets = new TweetField("referenced_tweets");
    public static TweetField PublicMetrics = new TweetField("public_metrics");
    public static TweetField Withheld = new TweetField("withheld");

    /**
     * get all.
     * すべて取得
     */
    public static TweetField[] All = new TweetField[]{
            Id,
            Text,
            AuthorId,
            Attachments,
            Geo,
            Lang,
            Source,
            Entities,
            CreatedAt,
            InReplyToUserId,
            ContextAnnotations,
            PossiblySensitive,
            ReferencedTweets,
            PublicMetrics,
            Withheld
    };
}
