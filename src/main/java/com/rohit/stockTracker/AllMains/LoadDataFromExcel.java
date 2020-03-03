package com.rohit.stockTracker.AllMains;

import com.rohit.stockTracker.Constants.Constant;
import com.rohit.stockTracker.DTOs.StockDetails;
import com.rohit.stockTracker.Utils.Readers;

import java.util.List;

public class LoadDataFromExcel {
    public static void main(String[] args) {
        final List <String> stocksList = Readers.readTextFile(Constant.SHARELIST.getValue());

        stocksList.forEach(stocks->{
            String fileName = "/home/rohit.goyla/Downloads/Quote-Equity-"+stocks+"-EQ-03-03-2019-to-03-03-2020.csv";
//            String fileName = "/home/rohit.goyla/Downloads/Quote-Equity-IOC-EQ-03-03-2019-to-03-03-2020.csv";
            //Quote-Equity-BPCL-EQ-03-03-2019-to-03-03-2020
            final List <String> stockData = Readers.readFromCSV(fileName);
            stockData.remove(0);

        });
    }
}
