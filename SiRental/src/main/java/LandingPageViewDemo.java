
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ben
 */
public class LandingPageViewDemo {
  private static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    landingPageViewDemo();
  }

  public static void landingPageViewDemo() {
    int menu = 0;
    boolean keluar = false;
    char pilihan;
    
    do{
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("|SI RENTAL - AplikaSi Rental Mobil Si paling Java, seJava Barat |");
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("Selamat datang, silakan login terlebih dahulu !");
      System.out.println("[1] Login Member (Si yang Rentalin Mobilnya)");
      System.out.println("[2] Login Costumer (Si yang ngeRental Mobil)");
      System.out.println("[3] Login Admin (Si yang ngatur Rental Mobil)");
      System.out.println("[0] Keluar");
      System.out.println("+---------------------------------------------------------------+");
      System.out.println("");
      System.out.print("Masukkan pilihan menu : ");
      
      try{
        menu = scanner.nextInt();
      }catch(InputMismatchException e){
        System.out.println("Pilihan harus dalam Angka : " + e);
      }
      
      switch(menu){
        case 1 :
          //TODO : LoginMemberViewDemo.login();
          break;
        case 2 :
          //TODO : LoginCustomerViewDemo.login();
          break;
        case 3 :
          //TODO : AdminViewDemo.login();
          break;
        case 0 :
          System.out.println("Keluar...");
          exitMode();
          break;
        default :
          break;
      }
      
      System.out.println("");
      System.out.print("Apakah ingin melanjutkan? [Y/N] : ");
      pilihan = scanner.next().charAt(0);
      
      if(pilihan == 'n' || pilihan == 'N'){
        keluar = true;
      }
      
    }while(!keluar);
    exitMode();
  }

  private static void exitMode(){
    System.out.println("Terima kasih sudah pakai Si Rental!");
    System.exit(0);
  }
  
  private static void defaultMode(){
    System.out.println("Pilihan yang Anda masukkan Salah! Coba Lagi!");
  }
}
