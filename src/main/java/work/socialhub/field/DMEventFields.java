package work.socialhub.field;

/**
 * filed list of dm field entity.
 * DM フィールドエンティティにおけるフィールド一覧
 */
public class DMEventFields {

    public static DMEventField Id = new DMEventField("id");
    public static DMEventField Text = new DMEventField("text");
    public static DMEventField EventType = new DMEventField("event_type");
    public static DMEventField CreatedAt = new DMEventField("created_at");
    public static DMEventField DMConversationId = new DMEventField("dm_conversation_id");
    public static DMEventField SenderId = new DMEventField("sender_id");
    public static DMEventField ParticipantIds = new DMEventField("participant_ids");
    public static DMEventField ReferencedTweets = new DMEventField("referenced_tweets");
    public static DMEventField Attachments = new DMEventField("attachments");

    /**
     * get all.
     * すべて取得
     */
    public static DMEventField[] All = new DMEventField[]{
            Id,
            Text,
            EventType,
            CreatedAt,
            DMConversationId,
            SenderId,
            ParticipantIds,
            ReferencedTweets,
            Attachments
    };
}
