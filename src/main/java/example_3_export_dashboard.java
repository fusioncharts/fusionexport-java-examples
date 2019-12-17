import com.fusioncharts.fusionexport.client.*; // import sdk

public class example_3_export_dashboard {
    public static void main(String[] args) throws Exception {

        String configPath = System.getProperty("user.dir") + "/resources/multiple.json";
        String templatePath = System.getProperty("user.dir") + "/resources/template.html";

        // Instantiate the ExportManager class
		ExportManager em = new ExportManager();
		
        // Instantiate the ExportConfig class and add the required configurations
        ExportConfig config = new ExportConfig();
        config.set("chartConfig", configPath);
        config.set("templateFilePath", templatePath);
        config.set("type", "pdf");
        config.set("templateFormat", "A4");
		
        String[] files = em.export(config,"exports/",true);
        
        for(String f : files) {
        	System.out.println(f);
        }
    }
}

