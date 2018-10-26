public class JackOLantern {

    private String[][] faceFeatures

    public JackOLantern(String[][] Features) {
        this.faceFeatures = Features;
    }

    public void edit(String replace, int row, int column) {
        faceFeatures[row][column] = replace;
    }
    public void fill(String str)
    {
        
    }
    public void setFaceFeatures(String[][] faceFeatures) {
        this.faceFeatures = faceFeatures;
    }
    public String toString()
    {

    }

}
