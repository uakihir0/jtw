package work.socialhub.api.request;

import java.util.Map;

public interface Request {

    Map<String, Object> getParams();

    default void putParam(Map<String, Object> map, String key, Object value) {
        if (key != null && value != null) {
            map.put(key, value);
        }
    }
}
