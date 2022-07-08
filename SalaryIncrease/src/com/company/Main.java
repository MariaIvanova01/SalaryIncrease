package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countInput = Integer.parseInt(scan.nextLine());

        List<Worker> workers = new ArrayList<>();
        for (int i = 0; i < countInput; i++) {
            String[] personInfo = scan.nextLine().split(" ");
            String firstName = personInfo[0];
            String lastName = personInfo[1];
            int age = Integer.parseInt(personInfo[2]);
            double salary = Double.parseDouble(personInfo[3]);

            workers.add(new Worker(firstName,lastName,age,salary));
        }

        double bonus = Double.parseDouble(scan.nextLine());

        for (Worker worker : workers) {
            worker.increaseSalary(bonus);
            System.out.print(worker);
        }

    }
}
