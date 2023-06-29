package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertFileFetching {
public String readDataFromPrpertyFile(String key) throws Throwable {
	FileInputStream fisp=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	Properties p=new Properties();
	p.load(fisp);
	return p.getProperty(key);
	 
}
}
