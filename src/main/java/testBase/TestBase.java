package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	static WebDriver driver;
	static Properties prop; 
	
	
	public TestBase(){
		
		try{
			FileInputStream fis = new FileInputStream("F:\\WorkSpaceForAutomationArchitect\\SharedFrameWork\\src\\test\\resources\\Global_Setting");
			prop.load(fis);
		}
		catch(Exception ex){
			
		}
		
	}
	
	
	public static void initialization(){
		
		
	}

}
