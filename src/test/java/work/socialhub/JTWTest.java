package work.socialhub;

import org.junit.Test;
import work.socialhub.api.JTWFactory;
import work.socialhub.api.request.UsersLookupIdRequest;
import work.socialhub.api.response.Response;
import work.socialhub.api.response.Root;
import work.socialhub.api.response.User;

public class JTWTest {

    @Test
    public void testUserShow() {

        JTWFactory factory = JTWFactory.fromConsumerKeyAndSecret(
                TestProperty.CONSUMER_KEY, TestProperty.CONSUMER_SECRET);

        JTW client = factory.verifyWithAccessToken(
                TestProperty.ACCESS_TOKEN, TestProperty.ACCESS_TOKEN_SECRET);

        Response<Root<User>> response = client.show(UsersLookupIdRequest
                .builder("11348282")
                .build());

        System.out.println(response.getValue().getData().getName());
    }
}
