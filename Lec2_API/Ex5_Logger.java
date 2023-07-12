package Java1.Lec2_API;


//  * Логирование
//  Логи содержат системную информацию работы программного или аппаратного комплекса.
//  В них записываются действия разного приоритета от пользователя, или программного продукта.
//  Процесс ведения логов называют “логированием” (журналированием).
 

import java.io.IOException;
import java.util.logging.*;

public class Ex5_Logger {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Ex5_Logger.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}

/*
 * Использование
Logger logger = Logger.getLogger() 

Уровни важности
INFO, DEBUG, ERROR, WARNING и др.

Вывод
ConsoleHandler info = new ConsoleHandler();
log.addHandler(info);

Формат вывода: структурированный, абы как*
XMLFormatter, SimpleFormatter
 */