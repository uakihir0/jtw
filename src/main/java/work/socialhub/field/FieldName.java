package work.socialhub.field;

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
}
