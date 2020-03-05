

import Defense.*;
import Fly.*;
import Offense.*;
import Sound.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilih, i=0;
        char kembali;
        String nama;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Masukkan nama Duck "+ (i+1)+": ");
            nama = input.next();
            
            System.out.println("Menjadi Super");
            System.out.println("1. Fly : Rocket");
            System.out.println("2. Sound : Toa");
            System.out.println("3. Offense tool : Arrow ");
            System.out.println("4. Deffense tool : Shield");
            System.out.println("");
            System.out.println("Menjadi Noob");
            System.out.println("1. Fly : Wings");
            System.out.println("2. Sound : Normal");
            System.out.println("3. Offense tool : Sword ");
            System.out.println("4. Deffense tool : Armor");
            System.out.println("");
            System.out.println("Menjadi Super Duck Change Fly");
            System.out.println("1. Fly : Plane");
            System.out.println("2. Sound : Toa");
            System.out.println("3. Offense tool : Arrow ");
            System.out.println("4. Deffense tool : Shield");
            System.out.println("");
            
            System.out.print("Pilih yang kamu mau  : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    Duck superDuck = new Duck(new RocketFly(), new ToaSound(), new ArrowOffense(), new ShieldDefense());// Mainnya bikin objek
                    System.out.println("Super Duck Behavior : ");
                    System.out.println("Nama Duck " + (i+1)+" adalah " + nama + ", dia memiliki :");
                    superDuck.fly();  //parameternya new rocket fly(bikin objeknya si rocketnya) dan juga toa sound
                    superDuck.sound();
                    superDuck.offense();
                    superDuck.defense();
                    break;
                case 2:

                    System.out.println("");
                    System.out.println("Noob Duck Behavior : ");
                    System.out.println("Nama Duck " + (i+1)+" adalah "+  nama + ", dia memiliki :");
                    Duck noobDuck = new Duck(new WingsFly(), new NormalSound(), new SwordOffense(), new ArmorDefense());
                    noobDuck.fly();
                    noobDuck.sound();
                    noobDuck.offense();
                    noobDuck.defense();
                    break;
                    
                      case 3:

                    System.out.println("");
                    System.out.println("Super Duck Change Fly : ");
                    System.out.println("Nama Duck " + (i+1)+" adalah "+  nama + ", dia memiliki :");
                    Duck superDuckChangeFly = new Duck(new PlaneFly(), new ToaSound(), new ArrowOffense(), new ShieldDefense());
                    superDuckChangeFly.fly();
                    superDuckChangeFly.sound();
                    superDuckChangeFly.offense();
                    superDuckChangeFly.defense();
                    break;
                    
                
            }

                System.out.println("-----------------------------------------------------------");
                System.out.println("Ingin kembali ke menu awal? (y/n)");
                kembali = input.next().charAt(0);
                i++;
            } while ( kembali == 'Y' || kembali == 'y');






        }
    }