package org.example.strategy;

import java.io.*;
import java.io.IOException;

public class ShowCustomersAndCardsStrategy implements AbstractCustomerStrategy {

    @Override
    public void process(){
        try {
            String filePath = "C:\\Users\\Mustafa\\JavaFile\\tempCustomer.txt";
            File inputFile = new File(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            String line = bufferedReader.readLine();
            System.out.println("----------------");
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File oxuma xetasi" + e.getMessage());
        }

        System.out.println("----------------");

        try {
            String filePath = "C:\\Users\\Mustafa\\JavaFile\\tempCard.txt";
            File inputFile = new File(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File oxuma xetasi" + e.getMessage());
        }
        System.out.println("----------------");
    }
}

