package work.socialhub.field;

/**
 * filed list of user entity.
 * ユーザーエンティティにおけるフィールド一覧
 */
public class UserFields {

    public static UserField Id = new UserField("id");
    public static UserField Name = new UserField("name");
    public static UserField Username = new UserField("username");
    public static UserField CreatedAt = new UserField("created_at");
    public static UserField Description = new UserField("description");
    public static UserField Entities = new UserField("entities");
    public static UserField Location = new UserField("location");
    public static UserField PinnedTweetId = new UserField("pinned_tweet_id");
    public static UserField ProfileImageUrl = new UserField("profile_image_url");
    public static UserField Protected = new UserField("protected");
    public static UserField PublicMetrics = new UserField("public_metrics");
    public static UserField Url = new UserField("url");
    public static UserField Verified = new UserField("verified");
    public static UserField Withheld = new UserField("withheld");

    /**
     * get all.
     * すべて取得
     */
    public static UserField[] All = new UserField[]{
            Id,
            Name,
            Username,
            CreatedAt,
            Description,
            Entities,
            Location,
            PinnedTweetId,
            ProfileImageUrl,
            Protected,
            PublicMetrics,
            Url,
            Verified,
            Withheld
    };
}
