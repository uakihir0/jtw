package work.socialhub.field;

/**
 * filed list of media entity.
 * メディアエンティティにおけるフィールド一覧
 * https://developer.twitter.com/en/docs/twitter-api/data-dictionary/object-model/media
 */
public class MediaFields {

    public static MediaField MediaKey = new MediaField("media_key");
    public static MediaField Type = new MediaField("type");
    public static MediaField DurationMs = new MediaField("duration_ms");
    public static MediaField Height = new MediaField("height");
    public static MediaField NonPublicMetrics = new MediaField("non_public_metrics");
    public static MediaField OrganicMetrics = new MediaField("organic_metrics");
    public static MediaField PreviewImageUrl = new MediaField("preview_image_url");
    public static MediaField PromotedMetrics = new MediaField("promoted_metrics");
    public static MediaField PublicMetrics = new MediaField("public_metrics");
    public static MediaField Width = new MediaField("width");
    public static MediaField Url = new MediaField("url");

    /**
     * get all.
     * すべて取得
     */
    public static MediaField[] All = new MediaField[]{
            MediaKey,
            Type,
            DurationMs,
            Height,
            NonPublicMetrics,
            OrganicMetrics,
            PreviewImageUrl,
            PromotedMetrics,
            PublicMetrics,
            Width,
            // UnDocumented
            Url
    };
}
