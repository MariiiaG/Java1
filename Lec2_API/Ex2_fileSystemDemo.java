package Java1.Lec2_API;

import java.io.File;

public class Ex2_fileSystemDemo {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        System.out.println(pathFile);
        File f1 = new File("file.txt");
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
    
    /*
     * isHidden(): возвращает истину, если каталог или файл является скрытым 
     * length(): возвращает размер файла в байтах 
     * lastModified(): возвращает время последнего изменения файла или каталога 
     * list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге 
     * listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
     * mkdir(): создает новый каталог
     * renameTo(File dest): переименовывает файл или каталог
     * length(): возвращает размер файла в байтах 
     * lastModified(): возвращает время последнего изменения файла или каталога
     * list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге 
     * listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
     * renameTo(File dest): переименовывает файл или каталог
     */
}
