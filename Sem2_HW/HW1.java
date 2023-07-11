package Java1.Sem2_HW;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.nio.file.Files;

public class HW1 {
    public static void main(String[] args) throws Exception {
        final String [] gradesData = Files.readAllLines("grades.txt");
        for (int i = 0; i < gradesData.length; i ++) {
            System.out.println(PrintLine(gradesData[i]));
        }        
    }
    public static StringBuilder PrintLine(String line) {
        line = line.replaceAll("[\\[\\]\"{} ]", "");
        StringBuilder res = new StringBuilder("");
        String [] gradesData = line.split(", ");
        String [] combineData = {"Студент ", "получил ", "по предмету "};
        for (int i = 0; i < gradesData.length; i ++) {
            String[] listData = gradesData[i].split(":");
            res.append(combineData[i]);
            res.append(gradesData[1]);
            }
            return res;
    }   
}
