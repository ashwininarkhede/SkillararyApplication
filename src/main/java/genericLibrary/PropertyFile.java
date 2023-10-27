package genericLibrary;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertyFile {
	public String getPropertyData(String key) throws Throwable
	{
		Properties prop=new  Properties();
		FileInputStream fis = new FileInputStream(IPathConstant.propertyFilePath);
		prop.load(fis);
		return prop.getProperty(key);
	}

}
