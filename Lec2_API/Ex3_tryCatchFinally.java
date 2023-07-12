package Java1.Lec2_API;

// Работа с файловой системой. Файлы. Ошибки

/*
 * try {
    Код, в котором может появиться ошибка
 } catch (Exception e) {
    Обработка, если ошибка случилась
 }
 finally {
    Код, который выполнится в любом случае
 }
 */

import java.io.File;
import java.io.FileWriter;

public class Ex3_tryCatchFinally {
    public static void main(String[] args) {
         String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);

            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("new line");

                //#region lineSeparator
                // A string containing "\r\n" for non-Unix 
                // platforms, or a string containing 
                // "\n" for Unix platforms.
                fileWriter.append(System.lineSeparator());
                //#endregion

                fileWriter.write("new line");
                fileWriter.append("new line");
                fileWriter.flush();
                fileWriter.close();
                // BufferedReader bufReader = new BufferedReader(new FileReader(file));
                // line = bufReader.readLine();
                // bufReader.close();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);
        }
    }
}
