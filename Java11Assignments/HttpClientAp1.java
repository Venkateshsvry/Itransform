package Java11Assignments;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientAp1 {

	public static void main(String[] args) {
		String Path = "https://httpbin.org/get?username=venkatesh&password=venaktesh154@";
		HttpRequest req = (HttpRequest) HttpRequest.
				newBuilder().uri(URI.create(Path)).GET().version(Version.HTTP_2)
				.build();

		HttpClient client = HttpClient.newBuilder().build();
		try {
			HttpResponse<String> res = client.send(req, BodyHandlers.ofString());
			System.out.println(res.statusCode());
			System.out.println(res.body());
		} catch (IOException e) {

			e.printStackTrace();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
