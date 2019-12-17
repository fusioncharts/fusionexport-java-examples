import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Dictionary;
import java.util.HashMap;

import com.fusioncharts.fusionexport.client.*; // import sdk

public class example_2_export_multiple_charts {
    public static void main(String[] args) throws Exception {
	
        String configPath = System.getProperty("user.dir") + "/resources/multiple.json";

        // Instantiate the ExportManager class
		ExportManager em = new ExportManager();
		
        // Instantiate the ExportConfig class and add the required configurations
        ExportConfig config = new ExportConfig();
        config.set("chartConfig", configPath);
        config.set("type", "pdf");
        config.set("templateFormat", "A4");
		
        String[] files = em.export(config,"exports/",true);
        
        for(String f : files) {
        	System.out.println(f);
        }
    }
}

