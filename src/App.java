import co.edu.uptc.demo2.controllers.FileController;

public class App {

    public static void main(String[] args) throws Exception {

        FileController fileController = new FileController();
        System.out.println("Informacion de los archivos");

        fileController
                .showInfoFiles("C:\\Users\\oscar\\OneDrive\\Documentos\\stuff\\Juegos\\Return of the Obra Dinn 1.0.96");

    }
}
