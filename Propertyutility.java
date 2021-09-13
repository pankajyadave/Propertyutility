package Propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyutility
{
	static String path="C:\\Users\\Pankaj\\eclipse-workspace\\Automation_Framework\\testdata\\toolsqa.properties";
	
	public static String getproperty(String key)
	{
		String value="";
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		} catch (Exception e)
		{
			System.out.println("Issue in Getproperty "+e);
		}
		return value;
	}
}
