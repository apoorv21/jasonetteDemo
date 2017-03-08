// Set your secret key: remember to change this to your live secret key in production
// See your keys here: https://dashboard.stripe.com/account/apikeys
Stripe.apiKey = "sk_test_1lWBfNNuBsAJIpTmBx63kyyD";

// Using Spark framework (http://sparkjava.com)
public Object handle(Request request, Response response) {
  // Retrieve the request's body and parse it as JSON
  Event eventJson = APIResource.GSON.fromJson(request.body(), Event.class);

  // Do something with eventJson

  response.status(200);
  return "";
}
