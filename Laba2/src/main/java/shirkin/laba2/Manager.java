package shirkin.laba2;

import java.io.IOException;

public class Manager {

    private Storage storage = new Storage();

    public void Export(String fileName) throws IOException {
        storage.loadResults(fileName);
    }

    public void Import(String fileName, String sheetNameOrIndex, boolean isIndex) throws IOException {
        storage.loadData(fileName, sheetNameOrIndex, isIndex);
    }

    public Storage getStorage() {
        return storage;
    }
    
}
