package work.socialhub.field;

/**
 * filed list of media entity.
 * メディアエンティティにおけるフィールド一覧
 */
public class MediaFields {

    public static MediaField Type = new MediaField("type");
    public static MediaField Url = new MediaField("url");
    public static MediaField Width = new MediaField("width");
    public static MediaField Height = new MediaField("height");
    public static MediaField MediaKey = new MediaField("media_key");
    public static MediaField DurationMs = new MediaField("duration_ms");
    public static MediaField PreviewImageUrl = new MediaField("preview_image_url");
    public static MediaField PublicMetrics = new MediaField("public_metrics");

    /**
     * get all.
     * すべて取得
     */
    public static MediaField[] All = new MediaField[]{
            Type,
            Url,
            Width,
            Height,
            MediaKey,
            DurationMs,
            PreviewImageUrl,
            PublicMetrics
    };
}
