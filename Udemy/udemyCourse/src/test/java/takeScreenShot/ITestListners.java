package takeScreenShot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListners extends setUp implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		captureScreenShot(result.getMethod().getMethodName()+".png");
	}
	

}
