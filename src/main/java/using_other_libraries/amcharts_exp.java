package using_other_libraries;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Dictionary;
import java.util.HashMap;

import com.fusioncharts.fusionexport.client.*; // import sdk

public class amcharts_exp {
    public static void main(String[] args) throws Exception {
	
        // Instantiate the ExportManager class
		ExportManager em = new ExportManager();
        // Instantiate the ExportConfig class and add the required configurations
        ExportConfig config = new ExportConfig();
        config.set("templateFilePath",System.getProperty("user.dir") + "/resources/template_amcharts.html");
        config.set("type", "pdf");
        config.set("asyncCapture", true);
		
        String[] files = em.export(config, "exports/", true);
        
        System.out.println("Done");
    }
}

