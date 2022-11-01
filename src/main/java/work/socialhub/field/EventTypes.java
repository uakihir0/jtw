package work.socialhub.field;

/**
 * filed list of dm event entity.
 * DM のイベントタイプ一覧
 */
public class EventTypes {

    public static EventType MessageCreate = new EventType("MessageCreate");
    public static EventType ParticipantsJoin = new EventType("ParticipantsJoin");
    public static EventType ParticipantsLeave = new EventType("ParticipantsLeave");

    /**
     * get all.
     * すべて取得
     */
    public static EventType[] All = new EventType[]{
            MessageCreate,
            ParticipantsJoin,
            ParticipantsLeave,
    };
}
