package org.example.strategy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ShowMoneyTransferStrategy implements AbstractCustomerStrategy {
    @Override
    public void process() throws IOException {

        String filePath = "C:\\Users\\Mustafa\\JavaFile\\transactions.txt";
        File inputFile = new File(filePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String line = bufferedReader.readLine();
        System.out.println("----------------");
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        System.out.println("----------------");
        bufferedReader.close();
    }
}
