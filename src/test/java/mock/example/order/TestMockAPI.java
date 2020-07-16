package mock.example.order;

import org.mockserver.client.server.MockServerClient;
import org.mockserver.integration.ClientAndServer;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import static org.mockserver.model.StringBody.exact;
import static org.mockserver.matchers.Times.exactly;
import static  org.mockserver.integration.ClientAndServer.startClientAndServer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class TestMockAPI {

	private static ClientAndServer serverMock;
	
	@BeforeClass
	
	public static void startServer(){
		serverMock = startClientAndServer(1089);
	}
	
	@AfterClass
    public static void stopServer() {
		serverMock.stop();
	}
	
	@Test
	public void testExpectations() {
		
		invalidAuthExpectation();
		
	}
	
	
	private void invalidAuthExpectation(){
		
		
		new MockServerClient("127.0.0.1", 1089)
		    .when(request()
		    		.withMethod("POST")
		    		.withPath("/order")
		    		.withBody(exact("{username:'test',password:'test'}"))
		    		,exactly(1))
		    
		    .respond(
		    		response().withStatusCode(401)
		    		.withBody("Incorrect username and password")
		    		
		    		);
		    
		
		
	}
	
	
	
	
	
}
