package work.socialhub.field;

/**
 * filed list of poll entity.
 * 投票エンティティにおけるフィールド一覧
 */
public class PollFields {

    public static PollField Id = new PollField("id");
    public static PollField Options = new PollField("options");
    public static PollField DurationMinutes = new PollField("duration_minutes");
    public static PollField EndDatetime = new PollField("end_datetime");
    public static PollField VotingStatus = new PollField("voting_status");

    /**
     * get all.
     * すべて取得
     */
    public static PollField[] All = new PollField[]{
            Id,
            Options,
            DurationMinutes,
            EndDatetime,
            VotingStatus
    };
}
