package callApp;

import java.util.HashMap;
import java.util.Map;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.TwilioRestResponse;

public class makeCall {
	public static final String ACCOUNT_SID = "AC54fb9b880ad558a2203202e1753403b8";
	public static final String AUTH_TOKEN = ".3d7e4a2269649287612ed9b07a27ec09";

	public static void main(String[] args) {
		TwilioRestClient restClient = new TwilioRestClient(ACCOUNT_SID,
				AUTH_TOKEN);
		Map params = new HashMap();
		params.put("From", CallerID);
		params.put("To", ToCall);
		params.put("Url", Url);
		TwilioRestResponse response;
		try {
			response = client.request(
					"/" + APIVERSION + "/Accounts/" + client.getAccountSid()
							+ "/Calls", "POST", params);
			if (response.isError())
				System.out.println("Error making outgoing call: "
						+ response.getHttpStatus() + "n"
						+ response.getResponseText());
			else {
				System.out.println(response.getResponseText());
			}
		} catch (TwilioRestException e) {
			e.printStackTrace();
		}
	}

}
