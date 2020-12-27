# JTW [![](https://jitpack.io/v/uakihir0/jtw.svg)](https://jitpack.io/#uakihir0/jtw)

JTW is Twitter v2 API Client for Java. This library can be complied to Objective-C by [J2ObjC](https://developers.google.com/j2objc/).
To make pojo object, use [jsonschema2pojo](http://www.jsonschema2pojo.org/).

## HowToUse

```java
// OAuth 1.1a
JTWFactory factory = JTWFactory.fromConsumerKeyAndSecret(CONSUMER_KEY, CONSUMER_SECRET);
JTW client = factory.verifyWithAccessToken(ACCESS_TOKEN, ACCESS_TOKEN_SECRET);

// Send Request. (/2/users/:id)
Response<Root<User>> response = client.show(UsersLookupIdRequest.builder("11348282").build());

// Show Response.
System.out.println(response.getValue().getData().getName()); // NASA
```

## Status

- Users APIs
  - User Lookup
    - [ ] [GET /2/users](https://developer.twitter.com/en/docs/twitter-api/users/lookup/api-reference/get-users)
    - [x] [GET /2/users/:id](https://developer.twitter.com/en/docs/twitter-api/users/lookup/api-reference/get-users-id)
    - [ ] [GET /2/users/by](https://developer.twitter.com/en/docs/twitter-api/users/lookup/api-reference/get-users-by)
    - [ ] [GET /2/users/by/username/:username](https://developer.twitter.com/en/docs/twitter-api/users/lookup/api-reference/get-users-by-username-username)
  - Follows
    - [ ] [GET /2/users/:id/following](https://developer.twitter.com/en/docs/twitter-api/users/follows/api-reference/get-users-id-following)
    - [ ] [GET /2/users/:id/followers](https://developer.twitter.com/en/docs/twitter-api/users/follows/api-reference/get-users-id-followers)


- Tweet APIs
  - Tweet Lookup
    - [ ] [GET /2/tweets](https://developer.twitter.com/en/docs/twitter-api/tweets/lookup/api-reference/get-tweets)
    - [ ] [GET /2/tweets/:id](https://developer.twitter.com/en/docs/twitter-api/tweets/lookup/api-reference/get-tweets-id)
  - Recent Search
    - [ ] [GET /2/tweets/search/recent](https://developer.twitter.com/en/docs/twitter-api/tweets/search/api-reference/get-tweets-search-recent)
  - Timelines
    - [ ] [GET /2/users/:id/tweets](https://developer.twitter.com/en/docs/twitter-api/tweets/timelines/api-reference/get-users-id-tweets)
    - [ ] [GET /2/users/:id/mentions](https://developer.twitter.com/en/docs/twitter-api/tweets/timelines/api-reference/get-users-id-mentions)
  - Filtered Stream
    - [ ] [GET /2/tweets/search/stream/rules](https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/api-reference/get-tweets-search-stream-rules)
    - [ ] [POST /2/tweets/search/stream/rules](https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/api-reference/post-tweets-search-stream-rules)
    - [ ] [GET /2/tweets/search/stream](https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/api-reference/get-tweets-search-stream)
  - Sampled Stream
    - [ ] [GET /2/tweets/sample/stream](https://developer.twitter.com/en/docs/twitter-api/tweets/sampled-stream/api-reference/get-tweets-sample-stream)
  - Hide Replies
    - [ ] [PUT /2/tweets/:id/hidden](https://developer.twitter.com/en/docs/twitter-api/tweets/hide-replies/api-reference/put-tweets-id-hidden)
    
## License

MIT

## Author

Twitter: [@uakihir0](https://twitter.com/uakihir0)
