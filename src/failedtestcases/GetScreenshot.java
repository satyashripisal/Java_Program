package failedtestcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GetScreenshot extends MainTest {

	public static  String capture(String screenshotName) throws IOException {
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d = new File("C:/Users/dell/DNYANESHWAR/Desktop/failtc.bmp");
		FileUtils.copyFile(s, d);
		
		return screenshotName;
		
	}
}
