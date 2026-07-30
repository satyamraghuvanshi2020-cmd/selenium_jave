package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesfile {

	public static void main(String[] args) throws IOException {
		
		//location of property file
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/TestData/configuration.properties");
				
		//loading property file
		Properties proobj=new Properties();
		proobj.load(file);
		
		//Read Data from Properties file
		String url=proobj.getProperty("appurl");
		String email=proobj.getProperty("email");
		String password=proobj.getProperty("password");
		String orderid=proobj.getProperty("orderid");
		String customerid=proobj.getProperty("customer");
		
		System.out.println(url+" "+email+" "+password+" "+orderid+" "+customerid);
		
		//Reading all the key from proprty file
		Set<String> key=proobj.stringPropertyNames();
		System.out.println(key);  //[url email password orderid customerid]
		
	}

}
