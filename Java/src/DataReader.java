import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.Gson;

public class DataReader {
	public static final String csvDirPath = "/Users/tanyaanisimova/git/5540-Big-Data/input/";
	
	public static String readDataQ1() {
		return readData(csvDirPath + "query1.csv");
	}
	
	public static String readDataQ2() {
		return readData(csvDirPath + "query2.csv");
	}
	
	public static String readDataQ3() {
		return readData(csvDirPath + "query3.csv");
	}
	
	public static String readDataQ4() {
		return readData(csvDirPath + "query4.csv");
	}
	
	public static String readDataQ5() {
		return readData(csvDirPath + "query5.csv");
	}
	
	public static String readDataQ6() {
		return readData(csvDirPath + "query6.csv");
	}
	
	public static String readDataQ7() {
		return readData(csvDirPath + "query7.csv");
	}
	
	public static String readDataQ8() {
		return readData(csvDirPath + "query8.csv");
	}
	
	public static String readDataQ9() {
		return readData(csvDirPath + "query9.csv");
	}
	
	public static String readDataQ10() {
		return readData(csvDirPath + "query10.csv");
	}
	
	private static String readData(String path) {
		try(BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
			Map<String, String> map = new LinkedHashMap<String, String>();
			String line = null;
			while((line = br.readLine()) != null) {
				try {
					String[] w = line.split(",");
					map.put(w[0], w[1]);
				} catch(Exception e ) {
					
				}
			}
			Gson gson = new Gson(); 
		    String json = gson.toJson(map);
		    return json;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
