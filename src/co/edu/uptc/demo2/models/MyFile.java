package co.edu.uptc.demo2.models;

public class MyFile {
    private String path;
    private Long size;
    private boolean isDir;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public boolean isDir() {
        return isDir;
    }

    public void setDir(boolean isDir) {
        this.isDir = isDir;
    }

    @Override
    public String toString() {
        return "Mi Archivo:\nRuta de acceso = " + path + "\nTamaño = " + size + "\n¿Es carpeta? = " + isDir
                + "\n---------------------------------";
    }
}