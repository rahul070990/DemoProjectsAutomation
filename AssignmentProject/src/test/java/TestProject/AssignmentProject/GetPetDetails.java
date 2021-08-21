package TestProject.AssignmentProject;

import org.testng.Assert;
import org.testng.annotations.*;

import com.adidas.base.BaseClass;
import com.adidas.utility.Logging;
//import com.kat.util.TestResultListener;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetPetDetails extends BaseClass{
	
	
	static Logging lib = new Logging();
	Response response;
	String URL;
	String Image_URL;
	String Banner_ImageURL;

	@Test
	public void startTest() {
		RestAssured.baseURI = excelUtil.getCellData("PetDetails", 1, 1);
		//RequestSpecification httpRequest = RestAssured.given().log().all().pathParam(excelUtil.getCellData("PetDetails", 0, 2), excelUtil.getCellData("PetDetails", 1, 2));
		RequestSpecification httpRequest = RestAssured.given().log().all();
		response= httpRequest.get();
		System.out.println("Response is: " +response);
	}

	/*
	 @Test
	 
	public void TC001_VerifyStatusCode() {
		// Get the Status code
		int statusCode = response.getStatusCode();
		if (statusCode == 200) {
			lib.logPassed("statusCode- " + statusCode);
		} else {
			lib.logFailed("statusCode- " + statusCode);
		}
		// Assert.assertEquals(statusCode, 200, "Correct status code returned");
	}

	@Test
	public void TC002_VerifyStatusLine() {
		// Get the Status Line
		String statusLine = response.getStatusLine();
		if (statusLine.equals("HTTP/1.1 200 OK")) {
			lib.logPassed("status Line- " + statusLine);
		} else {
			lib.logFailed("status Line- " + statusLine);
		}

	}

	@Test
	public void TC003_VerifyHeadersDetail() {
		// Get the Headers detail
		Headers allHeaders = response.headers();
		// Show all the Headers in Key value
		for (Header header : allHeaders) {
			lib.logPassed("Key: " + header.getName() + " Value: " + header.getValue());
		}

	}

	@Test
	public void TC004_VerifyContenetType() {
		// Header named Content-Type
		String contentType = response.header("Content-Type");
		// Assert.assertEquals(contentType, "application/json; charset=utf-8");
		lib.logPassed("contentType- " + contentType);

	}

	@Test
	public void TC005_VerifyServerType() {
		// Header named Server
		String serverType = response.header("Server");
		// Assert.assertEquals(serverType, "nginx");
		lib.logPassed("serverType- " + serverType);

	}

	@Test
	public void TC006_VerifyContentEncoding() {
		// Header named Content-Encoding
		String contentEncoding = response.header("Content-Encoding");
		lib.logPassed("Content-Encoding: " + contentEncoding);
	}
	@Test
	public void TC007_VerifyResponseTime() {
		// Response Time
		long responseTime = response.getTime();
		lib.logPassed("responseTime- " + responseTime);
	}
	
	 @Test
	public void TC008_VerifyScoreCardDetails() {
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		int PlayersCount= jsonPathEvaluator.get("Players.size()");
		String LegacyFixtureID= jsonPathEvaluator.get("Fixture.LegacyFixtureId").toString();
		String LegacyCompetitionId= jsonPathEvaluator.get("Fixture.Competition.LegacyCompetitionId").toString();
		URL=jsonPathEvaluator.getString("Fixture.Competition.Url");
		Image_URL=jsonPathEvaluator.getString("Fixture.Competition.ImageUrl");;
		Banner_ImageURL=jsonPathEvaluator.getString("Fixture.Competition.BannerImageUrl");
		
		if(LegacyCompetitionId.equalsIgnoreCase(excelUtil.getCellData("Scorecard", 1, 7))) {
			lib.logPassed("LegacyCompetitionId is a valid ID:  " +LegacyCompetitionId);
		}
		else {
			lib.logFailed("LegacyCompetitionId ID is an invalid ID:   " +LegacyCompetitionId);
		}
		
		if(LegacyFixtureID.equalsIgnoreCase(excelUtil.getCellData("Scorecard", 1, 3))) {
			lib.logPassed("LegacyFixtureID is a valid ID:  " +LegacyFixtureID);
		}
		else {
			lib.logFailed("LegacyFixtureIDFixture ID is an invalid ID:   " +LegacyFixtureID);
		}
		
		for(int i=0;i<PlayersCount;i++) {
			int id= jsonPathEvaluator.get("Players["+i+"].Id");
			lib.logPassed("ID of Player["+i+"] "   +id);
		}
	
		
		if(URL.equalsIgnoreCase(excelUtil.getCellData("Scorecard", 1, 4))) {
			lib.logPassed("Correct URL is: " +URL);
		}
		else {
			lib.logFailed("Incorrect URL is: " +URL);
		}
		if(Image_URL.equalsIgnoreCase(excelUtil.getCellData("Scorecard", 1, 5))) {
			lib.logPassed("Correct ImageURL is: " +Image_URL);
		}
		else {
			lib.logFailed("Incorrect ImageURL is: " +Image_URL);
		}
		if(Banner_ImageURL.equalsIgnoreCase(excelUtil.getCellData("Scorecard", 1, 6))) {
			lib.logPassed("Correct BannerImageURL is: " +Banner_ImageURL);
		}
		else {
			lib.logFailed("Incorrect BannerImageURL is: " +Banner_ImageURL);
		}

	}

	@AfterTest
	public void endTest() {
		lib.logInfo("Current ScoreCardDetail end Test.");
	}
	*/
	
	

}
