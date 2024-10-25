package org.example.strategy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateCardStrategy implements AbstractCustomerStrategy {
    @Override
    public void process() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kartin ID-sini daxil edin: ");
        String IDCard = scanner.next();

        System.out.println("Kartin nomresini daxil edin: ");
        String numberCard = scanner.next();

        System.out.println("Kartin CVV nomresini daxil edin: ");
        String cvvNumberCard = scanner.next();

        System.out.println("Kartin balansi: ");
        String balance = scanner.next();

        FileWriter fileWriter = new FileWriter("C:\\Users\\Mustafa\\JavaFile\\cards.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        System.out.println("Kartin statusunu secin: ");
        System.out.println("1-activated   2-blocked");
        int option = scanner.nextInt();
        if (option==1){
            bufferedWriter.write("activated >>>  ");
        } else if (option==2) {
            bufferedWriter.write("blocked >>>  ");
        }
        bufferedWriter.write(IDCard);
        bufferedWriter.write(" -- ");
        bufferedWriter.write(numberCard);
        bufferedWriter.write(" -- ");
        bufferedWriter.write(cvvNumberCard);
        bufferedWriter.write(" --balance--> ");
        bufferedWriter.write(balance);
        bufferedWriter.newLine();
        bufferedWriter.close();

        System.out.println("<<Yeni kart yaradildi>>");
    }
}