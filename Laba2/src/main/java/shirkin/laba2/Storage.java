package shirkin.laba2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Storage {

    private Map<String, double[]> data = new HashMap<>();
    private Map<String, double[]> processedData = new HashMap<>();

    public void loadData(String filename) throws IOException {
        Reader reader = new Reader();
        data = reader.read(filename, 2);
    }

    public void loadResults(String fileName) throws IOException {
        Writer writer = new Writer();
        processedData = MathFormuls.getCalculations(data);
        writer.write(processedData, MathFormuls.CovMatrix(data), fileName);
    }

    public Map<String, double[]> getData() {
        return data;
    }

    //public Map<String, double[]> getProcessedData() {
    //    return processedData;
    //}
    
}
