import com.fusioncharts.fusionexport.client.*;

public class example_1_export_chart {
    public static void main(String[] args) throws Exception {
        ExportManager em = new ExportManager();
        ExportConfig config = new ExportConfig();
        
        String configPath = System.getProperty("user.dir") + "/resources/single.json";
        String outPath = System.getProperty("user.dir") + "/exports/"; 
        
        config.set("chartConfig", configPath);
        config.set("type", "pdf");
        
        em.export(config, outPath , true);
    }
}

