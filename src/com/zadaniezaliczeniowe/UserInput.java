package com.zadaniezaliczeniowe;

import java.util.Scanner;

/**
 * Created by RENT on 2017-03-18.
 */
public class UserInput {
    public Worker populateWorker() {
        Worker worker = new Worker();

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie pracownika: ");
        worker.imie = in.nextLine();
        System.out.println("Podaj nazwisko pracownika: ");
        worker.nazwisko = in.nextLine();
        System.out.println("Podaj plec pracownika");
        worker.plec = in.nextLine();
        System.out.println("Podaj numer dzialu pracownika");
        worker.nrDzialu = in.nextLine();
        System.out.println("Podaj place pracownika");
        worker.placa = in.nextInt();
        System.out.println("Podaj wiek pracownika");
        worker.wiek = in.nextInt();
        System.out.println("Podaj ilosc dzieci pracownika");
        worker.dzieci = in.nextInt();
        System.out.println("podaj zarobki pracownika");
        worker.stan_cywilny = in.nextInt();


        return worker;

    }
}
