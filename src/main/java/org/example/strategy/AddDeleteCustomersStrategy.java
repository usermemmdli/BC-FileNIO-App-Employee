package org.example.strategy;

import java.io.*;
import java.util.Scanner;

public class AddDeleteCustomersStrategy implements AbstractCustomerStrategy {
    @Override
    public void process() throws IOException {
        System.out.println("Emeliyyat secin-->");
        System.out.println("1 - Musteri elave etmek");
        System.out.println("2 - Musteri silmek");
        Scanner scanner1 = new Scanner(System.in);
        int option = scanner1.nextInt();

        if (option == 1) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Musterinin ID-sini daxil edin: ");
            String IDcustomer = scanner.next();

            System.out.println("Musterinin adini daxil edin: ");
            String name = scanner.next();

            System.out.println("Musterinin soyadini daxil edin: ");
            String surname = scanner.next();

            FileWriter fileWriter = new FileWriter("C:\\Users\\Mustafa\\JavaFile\\customer.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(IDcustomer);
            bufferedWriter.write(" ");
            bufferedWriter.write(name);
            bufferedWriter.write(" ");
            bufferedWriter.write(surname);
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("<<Yeni musteri elave olundu>>");
        } else if (option == 2) {
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Silmek istediyiniz musterinin ID, adi ve soyadi: ");
            String deletedCustomer = scanner4.next();
            String filePath = "C:\\Users\\Mustafa\\JavaFile\\customer.txt";
            File inputFile = new File(filePath);
            File tempFile = new File("C:\\Users\\Mustafa\\JavaFile\\tempCustomer.txt");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile));
            String setir;

            while ((setir = bufferedReader.readLine()) != null) {
                if (!setir.contains(deletedCustomer)) {
                    bufferedWriter.write(setir);
                    bufferedWriter.newLine();
                }
            }
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Silmek istediyiniz musterinin ID ve kart nomresi: ");
            String deletedCard = scanner5.next();
            String filePath2 = "C:\\Users\\Mustafa\\JavaFile\\cards.txt";
            File inputFile2 = new File(filePath2);
            File tempFile2 = new File("C:\\Users\\Mustafa\\JavaFile\\tempCard.txt");

            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(inputFile2));
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(tempFile2));
            String setir2;
            while ((setir2 = bufferedReader2.readLine()) != null) {
                if (!setir2.contains(deletedCard)) {
                    bufferedWriter2.write(setir2);
                    bufferedWriter2.newLine();
                }
            }
            System.out.println("<<Musteri ve karti siyahidan silindi>>");
            bufferedReader.close();
            bufferedReader2.close();
            bufferedWriter.close();
            bufferedWriter2.close();
        } else {
            System.out.println("Yanlis secim!");
            process();
        }
    }
}
