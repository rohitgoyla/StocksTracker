package com.rohit.stockTracker.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Readers {

    public static List<String> readTextFile(final String fileName) {
        List<String> shareList = new ArrayList<String>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = in.readLine()) != null) {
                shareList.add(line);
            }
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return shareList;
    }

    public static List<String> readFromCSV(String fileName) {
        List<String> stringList = new ArrayList<String>();
        try {
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return stringList;
    }
}
