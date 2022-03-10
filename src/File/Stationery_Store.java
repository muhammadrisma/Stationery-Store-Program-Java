/*
Name: Muhammad Risma
Student ID : 001202100048
Class: IT 3
*/

package MIDEXAM;
import java.util.Scanner;

public class stationery_store {
    double harga, total, bayar, kembalian, quantity;
    int pil , jumlah;
    
    double jumlahTotal(int jmlh){
        jumlah = jmlh;
        switch(pil) {
            case 0:
                System.exit(0);
                break;
            case 1:
                harga = 5000;
                total = total +(harga*jmlh);
                quantity = 100 - jmlh;
                break;
            case 2:
                harga = 2000;
                total = total +(harga*jmlh);
                quantity = 100 - jmlh;
                break;
            case 3:
                harga = 1000;
                total = total +(harga*jmlh);
                quantity = 100 - jmlh;
                break;  
            case 9:
                break;
            default:
                System.out.println("Error: Wrong type of answer");
                break;
        }
        return total;
    }
    
    //class untuk menampilkan Total biaya dan jumlah stock awal tiap alat tulis
    void viewTotal() {
        System.out.println("==========PAYMENT==========");
        System.out.println("Stock of every stationery: 100");
        System.out.println("Total: Rp " + total);
    }
    
    //class menghitung jumlah kembalian
    double countKembalian(double byr) {
        bayar = byr;
        kembalian = byr - total;
        return kembalian;            
    }
    
    //class untuk menampilkan jumlah kembalian
    void viewKembalian(){
        System.out.println("Return: Rp " + kembalian);
        System.out.println("Stock After :" + quantity);
        System.out.println("===========Thanks For Your Order==========");
    }
    
    //main menu
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        stationery_store in = new stationery_store();
        do {
            System.out.println("==============================");
            System.out.println("POOH Store");
            System.out.println("==============================");
            System.out.println("Item");
            System.out.println("1. Books [Rp 5000]");
            System.out.println("2. Pencils [Rp 2000]");
            System.out.println("3. Eraser [Rp 1000]");
            System.out.println("\n9. Done, calculate the payment");
            System.out.println("Exit Program");
            System.out.println("==============================");
            System.out.println("Enter your choice of stationery");
            in.pil = input.nextInt();
            if(in.pil >= 1 && in.pil <= 4) {
                System.out.println("Enter Number of Stationery");
                in.jumlah = input.nextInt();
            } else {

            }
            in.jumlahTotal(in.jumlah);
         //selama user tidak memasukan angka 9 dan jumlah pembelian tidak lebih dari 1
        }while(in.pil !=9 && in.pil < 1 );
        
        //menampilkan hasil dari berbagai class
        in.viewTotal();
        System.out.println("Pay: Rp");
        in.bayar = input.nextDouble();
        in.countKembalian(in.bayar);
        in.viewKembalian();
    }
}
