package org.example.strategy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CardBlockStrategy implements AbstractCustomerStrategy {
    @Override
    public void process() throws IOException {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Emeliyyat secin-->");
        System.out.println("1-Kart bloklamaq");
        System.out.println("2-Karti blokdan cixarmaq");
        int option = scanner1.nextInt();

        if (option == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bloklamaq istediyiniz kartin ID-si: ");
            int hedefCardID = scanner.nextInt();
            String filePath = "C:\\Users\\Mustafa\\JavaFile\\tempCard.txt";
            File inputFile = new File(filePath);
            String filePath2 = "C:\\Users\\Mustafa\\JavaFile\\blockedCard.txt";

            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2));

            String setir;
            int setirSayisi = 0;

            while ((setir = bufferedReader.readLine()) != null) {
                setirSayisi++;

                if (setirSayisi == hedefCardID) {
                    bufferedWriter.write("blocked >>>  ");
                }
                bufferedWriter.write(setir);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
            Files.move(Paths.get("C:\\Users\\Mustafa\\JavaFile\\blockedCard.txt"), Paths.get("C:\\Users\\Mustafa\\JavaFile\\tempCard.txt"), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("<Kart bloklandi>");

        } else if (option == 2) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Blokdan cixarmaq istediyiniz kartin ID-si: ");
            int hedefCardID = scanner3.nextInt();
            String filePath = "C:\\Users\\Mustafa\\JavaFile\\tempCard.txt";
            File inputFile = new File(filePath);
            String filePath2 = "C:\\Users\\Mustafa\\JavaFile\\activedCard.txt";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2));

            String blocked = "blocked >>>  ";
            String actived = "activated >>>  ";
            int setirSayisi = 0;
            String setir;
            while ((setir = bufferedReader.readLine()) != null) {
                setirSayisi++;

                if (setirSayisi == hedefCardID) {
                    setir = setir.replace(blocked, actived);
                }
                bufferedWriter.write(setir);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
            Files.move(Paths.get("C:\\Users\\Mustafa\\JavaFile\\activatedCard.txt"), Paths.get("C:\\Users\\Mustafa\\JavaFile\\tempCard.txt"), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("<Kart aktivlesdirildi>");

        } else {
            System.err.println("Yanlis secim!");
            process();
        }
    }
}
