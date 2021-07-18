package work.socialhub.field;

/**
 * filed list of place entity.
 * 場所エンティティにおけるフィールド一覧
 */
public class PlaceFields {

    public static PlaceField FullName = new PlaceField("full_name");
    public static PlaceField Id = new PlaceField("id");
    public static PlaceField ContainedWithin = new PlaceField("contained_within");
    public static PlaceField Country = new PlaceField("country");
    public static PlaceField CountryCode = new PlaceField("country_code");
    public static PlaceField Geo = new PlaceField("geo");
    public static PlaceField Name = new PlaceField("name");
    public static PlaceField PlaceType = new PlaceField("place_type");

    /**
     * get all.
     * すべて取得
     */
    public static PlaceField[] All = new PlaceField[]{
            FullName,
            Id,
            ContainedWithin,
            Country,
            CountryCode,
            Geo,
            Name,
            PlaceType
    };
}
