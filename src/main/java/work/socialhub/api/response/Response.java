package work.socialhub.api.response;

public class Response<T> {

    private final T value;

    public Response(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
