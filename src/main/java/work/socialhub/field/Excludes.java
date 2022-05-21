package work.socialhub.field;

public class Excludes {

    public static Exclude Retweets = new Exclude("retweets");
    public static Exclude Replies = new Exclude("replies");

    /**
     * get all.
     * すべて取得
     */
    public static Exclude[] All = new Exclude[]{
            Retweets,
            Replies,
    };
}
