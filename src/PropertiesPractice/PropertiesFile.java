package PropertiesPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("./appliation.properties");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		Properties prop = new Properties();
		
		/*
		
		//creation of properties
		prop.setProperty("url","localhost");
		prop.setProperty("username","krish");
		prop.setProperty("password", "radha");
		prop.setProperty("dummy","trial");
		//updation of property
		prop.setProperty("url","127.0.0,1");
		//deletion of property
		prop.remove("dummy");
		
		FileOutputStream fos = new FileOutputStream(file);
		prop.store(fos," ");
		
		*/
		
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		System.out.println(prop);
		
		Set<Object> keys = prop.keySet();
		Collection<Object> values = prop.values();
		System.out.println(values);
		
		for(Object i:keys) {
			System.out.println(prop.getProperty((String)i));
		}
		
		for(Object i:keys) {
			System.out.println(i+">>>>>"+prop.getProperty((String)i));
		}
		
		Set<Entry<Object, Object>> entries = prop.entrySet();
		
		for(Entry<Object, Object> entry:entries) {
			System.out.println(entry.getKey()+">>>>>"+entry.getValue());
		}
		
		System.out.println(prop.size());
		

	}

}
