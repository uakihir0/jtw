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
<!-- - [ ] []() -->

- User Lookup
  - [x] [GET /2/users](https://developer.twitter.com/en/docs/twitter-api/users/lookup/api-reference/get-users)
  - [x] [GET /2/users/:id](https://developer.twitter.com/en/docs/twitter-api/users/lookup/api-reference/get-users-id)
  - [x] [GET /2/users/by](https://developer.twitter.com/en/docs/twitter-api/users/lookup/api-reference/get-users-by)
  - [ ] [GET /2/users/by/username/:username](https://developer.twitter.com/en/docs/twitter-api/users/lookup/api-reference/get-users-by-username-username)
- Follows
  - [ ] [GET /2/users/:id/following](https://developer.twitter.com/en/docs/twitter-api/users/follows/api-reference/get-users-id-following)
  - [ ] [GET /2/users/:id/followers](https://developer.twitter.com/en/docs/twitter-api/users/follows/api-reference/get-users-id-followers)
- Tweet Lookup
  - [ ] [GET /2/tweets](https://developer.twitter.com/en/docs/twitter-api/tweets/lookup/api-reference/get-tweets)
  - [x] [GET /2/tweets/:id](https://developer.twitter.com/en/docs/twitter-api/tweets/lookup/api-reference/get-tweets-id)
- Like
  - [ ] [DELETE /2/users/:id/likes/:tweet_id](https://developer.twitter.com/en/docs/twitter-api/tweets/likes/api-reference/delete-users-id-likes-tweet_id)
  - [x] [GET /2/tweets/:id/liking_users](https://developer.twitter.com/en/docs/twitter-api/tweets/likes/api-reference/get-tweets-id-liking_users)
  - [ ] [GET /2/users/:id/liked_tweets](https://developer.twitter.com/en/docs/twitter-api/tweets/likes/api-reference/get-users-id-liked_tweets)
  - [ ] [POST /2/users/:id/likes](https://developer.twitter.com/en/docs/twitter-api/tweets/likes/api-reference/post-users-id-likes)
- Retweet
  - [ ] [DELETE /2/users/:id/retweets/:source_tweet_id](https://developer.twitter.com/en/docs/twitter-api/tweets/retweets/api-reference/delete-users-id-retweets-tweet_id)
  - [x] [GET /2/tweets/:id/retweeted_by](https://developer.twitter.com/en/docs/twitter-api/tweets/retweets/api-reference/get-tweets-id-retweeted_by)
  - [ ] [POST /2/users/:id/retweets](https://developer.twitter.com/en/docs/twitter-api/tweets/retweets/api-reference/post-users-id-retweets)
- Search
  - [ ] [GET /2/tweets/search/all](https://developer.twitter.com/en/docs/twitter-api/tweets/search/api-reference/get-tweets-search-all)
  - [ ] [GET /2/tweets/search/recent](https://developer.twitter.com/en/docs/twitter-api/tweets/search/api-reference/get-tweets-search-recent)
- Timelines
  - [ ] [GET /2/users/:id/tweets](https://developer.twitter.com/en/docs/twitter-api/tweets/timelines/api-reference/get-users-id-tweets)
  - [ ] [GET /2/users/:id/mentions](https://developer.twitter.com/en/docs/twitter-api/tweets/timelines/api-reference/get-users-id-mentions)
  - [x] [GET /2/users/:id/timelines/reverse_chronological](https://developer.twitter.com/en/docs/twitter-api/tweets/timelines/api-reference/get-users-id-reverse-chronological)
- Tweet Count
  - [ ] [GET /2/tweets/counts/all](https://developer.twitter.com/en/docs/twitter-api/tweets/counts/api-reference/get-tweets-counts-all)
  - [ ] [GET /2/tweets/counts/recent](https://developer.twitter.com/en/docs/twitter-api/tweets/counts/api-reference/get-tweets-counts-recent)
- Filtered Stream
  - [ ] [GET /2/tweets/search/stream/rules](https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/api-reference/get-tweets-search-stream-rules)
  - [ ] [POST /2/tweets/search/stream/rules](https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/api-reference/post-tweets-search-stream-rules)
  - [ ] [GET /2/tweets/search/stream](https://developer.twitter.com/en/docs/twitter-api/tweets/filtered-stream/api-reference/get-tweets-search-stream)
- Sampled Stream
  - [ ] [GET /2/tweets/sample/stream](https://developer.twitter.com/en/docs/twitter-api/tweets/sampled-stream/api-reference/get-tweets-sample-stream)
- Hide Replies
  - [ ] [PUT /2/tweets/:id/hidden](https://developer.twitter.com/en/docs/twitter-api/tweets/hide-replies/api-reference/put-tweets-id-hidden)
- Direct Message
  - [x] [GET /2/dm_events](https://developer.twitter.com/en/docs/twitter-api/direct-messages/lookup/api-reference/get-dm_events)
  - [ ] [GET /2/dm_conversations/with/:participant_id/dm_events](https://developer.twitter.com/en/docs/twitter-api/direct-messages/lookup/api-reference/get-dm_conversations-with-participant_id-dm_events)
  - [ ] [GET /2/dm_conversations/:dm_conversation_id/dm_events](https://developer.twitter.com/en/docs/twitter-api/direct-messages/lookup/api-reference/get-dm_conversations-dm_conversation_id-dm_events)

## License

MIT

## Author

Twitter: [@uakihir0](https://twitter.com/uakihir0)
