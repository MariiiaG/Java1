package Java1.Sem2;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;

/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 * который запишет эту строку в простой текстовый файл. Обработайте исключения   
 */

public class Sem2_4 {

    static Logger logger;// a new variable on class level
    public static void main(String[] args) {
        int n = 100;
        String s = "BoOm! ";
        String s1 = duplicate(s, n);
        String filePath = "Java1/Sem2/test.txt";
        createLogger();
        writeToFile(s1, filePath);
        System.out.println(readInFile(filePath));

        closeLogger();
    }

    private static void closeLogger() {
        for (Handler handler: logger.getHandlers()) {
            handler.close(); 
        }
    }

    private static void createLogger() {
        logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("Java1/Sem2/log.txt", true);
            logger.addHandler(fileHandler); // to save the log into a file, apart from being shown in the console
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter(); // adds a simple format of the log to the log
        if (fileHandler != null) {
            fileHandler.setFormatter(formatter);
        }   
    }

    static String readInFile(String filePath) {
        File file = new File(filePath);  // do  not forget to import java.io.File;
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) { // while scanner has something to read
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static String duplicate(String s, int n) {
        return s.repeat(n);
    }

    static void writeToFile(String s1, String filePath) { // throws IOException { // do not use 'throws exeption' in main !
        // Logger logger = Logger.getAnonymousLogger();  // moved this block above, created a logger method instead
        // FileHandler fileHandler = null;
        // try {
        //     fileHandler = new FileHandler("Java1/Sem2/log.txt", true);
        //     logger.addHandler(fileHandler); // to save the log into a file, apart from being shown in the console
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        
        try (FileWriter writer = new FileWriter(filePath, true)){ // try is the ctitical block that can potentially throw an exception
             // true will enable append and following cahnges will be appended instead of overwritten
             // if Filewriter is placed inside try then do not need to close writer, will auto close once try runs
            writer.write(s1); // writes the data into the buffer
            writer.write("\n"); // next 'write' command will be placed in a new line
            writer.flush(); // writes to file. If multiple writer.write, still use flush only once at the end
            //writer.close(); // need to rememnber to close after. Do not need here as writer is within try
            logger.info("Data saved successfully");;
        } catch (Exception e) { // will be executed if an exception occurs
            e.printStackTrace(); // will show the exception info in the console
            logger.warning("Failed to write into the file");
        } //finally {} // this block will be executed either way, exeption or not. Usually used to close the open methods like writer.close()
    }
}
