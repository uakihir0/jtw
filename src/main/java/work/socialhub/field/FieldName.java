package work.socialhub.field;

import java.util.stream.Stream;

public class FieldName {

    /**
     * field name.
     * フィールドの名
     */
    private String fieldName;

    /**
     * constructor can be accessed.
     * コンストラクタは外部からアクセス可能
     *
     * @param fieldName filed name.
     */
    public FieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * get filed name.
     * フィールド名を取得
     *
     * @return filed name.
     */
    public String getName() {
        return fieldName;
    }


    /**
     * get joining value.
     * フィールド名を結合して取得
     *
     * @param fields field list.
     * @return joining value.
     */
    static public String joining(FieldName[] fields) {
        return Stream.of(fields).map(FieldName::getName)
                .collect(java.util.stream.Collectors.joining(","));
    }
}
