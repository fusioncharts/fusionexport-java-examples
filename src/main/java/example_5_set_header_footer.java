import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Dictionary;
import java.util.HashMap;

import com.fusioncharts.fusionexport.client.*; // import sdk

public class example_5_set_header_footer {
    public static void main(String[] args) throws Exception {
	
        String chartConf  = System.getProperty("user.dir") + "/resources/multiple.json";
        String templateFilePath = System.getProperty("user.dir") + "/resources/template.html";
		
        // Instantiate the ExportManager class
		ExportManager em = new ExportManager();
        // Instantiate the ExportConfig class and add the required configurations
        ExportConfig config = new ExportConfig();

        config.set("chartConfig",chartConf);
        config.set("templateFilePath", templateFilePath );
        config.set("templateFormat", "A4");
        config.set("headerEnabled", "true");
        config.set("footerEnabled", "true");
        config.set("headerComponents", "{ \"title\": { \"style\": \"color:blue;\" } }");
        config.set("footerComponents", "{ \"pageNumber\": { \"style\": \"color:green;\" } }");
        
        config.set("type", "pdf");
		
        String[] files = em.export(config, "exports/", true);
        		
        System.out.println("Done");
    }
}

