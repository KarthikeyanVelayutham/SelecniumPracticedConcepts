package notepadData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenTestingBasics {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./datas/notepad.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String un = pro.getProperty("un");
		System.out.println(un);
		System.out.println(pro.getProperty("pwd"));

	}

}
