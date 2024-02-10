package co.edu.uptc.demo2.controllers;

import co.edu.uptc.demo2.models.MyFile;
import co.edu.uptc.demo2.services.FileUtil;

public class FileController {

    /*
     * public void showNameFiles(String path) {
     * FileUtil fileUtil;
     * fileUtil = new FileUtil();
     * String files[] = fileUtil.getNameFiles(path);
     * 
     * for (String file : files) {
     * System.out.println(file);
     * }
     * }
     */

    public void showInfoFiles(String path) {
        FileUtil fileUtil;
        fileUtil = new FileUtil();
        MyFile files[] = fileUtil.getInfoFiles(path);

        for (MyFile file : files) {
            System.out.println(file.toString());
        }
    }

}
