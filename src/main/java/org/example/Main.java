package org.example;

import com.sun.source.tree.IfTree;
//import models.Actor;
import models.Movie;
import models.Person;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person tomHanks = new Person( "Tom", "Hanks");
        Person angelinaJole = new Person( "Angelina", "Jole");

        int wynagrodzenieToma = tomHanks.calculateSalary(3000, 10);
        System.out.println("Wynagrodzenie Toma Hanksa " + wynagrodzenieToma);

        int wynagrodzenieAngelina = angelinaJole.calculateSalary(6000000, 20);
        System.out.println("Wynagrodzenie Toma Hanksa " + wynagrodzenieToma);


//        Movie topGun = new Movie("Top Gun", 30, 'A', 60.5,true);
//        Movie avatar = new Movie("Avatar", 1, 'A', 860.5,true);
//        Movie klan = new Movie("Klan", 89, 'A', 10.5,false);

        // System.out.println(topGun.getBudget());
        // System.out.println(topGun.getRating());


//        Actor tomCruse = new Actor("Tom","Cruse",15, false);
//        Actor tomHanks = new Actor("Tom","Hanks", 13, true);
//        Actor sandraBooloc = new Actor("Sandra","Booloc", 8, true);
//        Actor piotrAdamczyk = new Actor("Piotr","Adamczyk", 99, false);

//        int rankingTopgun;
//        int rankingAvatara;
//        int rankingKlan;

//        rankingAvatara = avatar.getRating();
//        rankingTopgun =  topGun.getRating();
//        rankingKlan = klan.getRating();
//
//        if (rankingKlan<11) {
//            System.out.println("To jest popularny film");
//        } else if (rankingKlan<51) {
//            System.out.println("To jest średni film");
//        } else{
//            System.out.println("To jest słaby i nieoglądany przez widzów film");
//        }

//    if (topGun.getRating()< avatar.getRating()) {
//        System.out.println("Popularniejszy film to: "+ topGun.getTitle());
//    }else if(topGun.getRating() == avatar.getRating());
//        else System.out.println(" Niepopularny film to: " + topGun.getTitle());


//        String jakisTekst = " Salma Hayek to najlepsza aktorka";
//        String jakisInnyTekst = " Sandra Bullock ujdzie";
//
//        String wiek = "45";
//        int liczta = 5;
//        var nazwa = true;
//
//        System.out.println(nazwa);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj swoje imie ...");
//        String imie = scanner.nextLine();
//        System.out.println("Ile masz lat");
//        int wiek = scanner.nextInt();
//
//        System.out.println("Witaj " + imie + " . Bardzo dziękuje za zakup tej aplikacji." + "Wiem że masz " + wiek + " lat");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Podaj swoje imie:  ");
//        String imie = scanner.nextLine();
//
//        if (imie.equals("Donald")) {
//            System.out.println("Przykro mi ale cie nie znam ");
//            System.exit(1);
//
//        } else if (imie.equals("Brad")) {
//            System.out.println("Witaj" + imie + " miło cie widziec ");
//        } else {
//            System.out.println("Czesc " + imie);
        }
    }
