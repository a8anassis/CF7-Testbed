package gr.aueb.cf.ch16.marker;

public class Attachment implements IArchivable {
    private String filename;
    private String extension;

    public Attachment() {

    }

    public Attachment(String filename, String extension) {
        this.filename = filename;
        this.extension = extension;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
