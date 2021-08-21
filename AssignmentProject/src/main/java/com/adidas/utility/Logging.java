package com.adidas.utility;
import com.adidas.base.BaseClass;
import com.relevantcodes.extentreports.*;

public class Logging extends BaseClass{

	public void logMessage(String strMessage) {
		if (strMessage.startsWith("Not OK") || strMessage.startsWith("Error") || strMessage.startsWith("Fail")
				|| strMessage.startsWith("Exception")) {
			test.log(LogStatus.FAIL, strMessage);
		} else if (strMessage.startsWith("OK") || strMessage.startsWith("Pass")) {
			test.log(LogStatus.PASS, strMessage);
		} else if (strMessage.startsWith("Warning")) {
			test.log(LogStatus.WARNING, strMessage);
		} else {
			test.log(LogStatus.INFO, strMessage);
		}
		
		// Save the logs and show in cmd.exe
		// logger.info(strMessage);
	}

	public void logMessage(LogStatus logStatus, String strMessage) {
		test.log(logStatus, strMessage);		
	}
	public void logPassed(String strMessage) {
		test.log(LogStatus.PASS, strMessage);
		//logger.info(strMessage);
	}
	public void logFailed(String strMessage) {
		test.log(LogStatus.FAIL, strMessage);		
	}
	public void logSkipped(String strMessage) {
		test.log(LogStatus.SKIP, strMessage);		
	}
	public void logInfo(String strMessage) {
		test.log(LogStatus.INFO, strMessage);		
	}
	public void logWarning(String strMessage) {
		test.log(LogStatus.WARNING, strMessage);		
	}

}
