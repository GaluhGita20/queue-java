//Membuat program antrian bank sederhana

package sample;

import java.util.Scanner;
public class Main  {

    public static void main(String[] args) {

        int menu;
        Scanner input=new Scanner(System.in);
        LinkedList LL=new LinkedList();

        System.out.println("\n\t\t=======================================================================================");
        System.out.println("\t\t\t\t\t Selamat datang di Bank Danamon");
        System.out.println("\t\t\t\t\tMemberikan pelayanan yang terbaik");
        System.out.println("\t\t=======================================================================================");

        do{
            System.out.println("\n\n");
            System.out.println("\t\t\t\t\tPilih menu : ");
            System.out.println("\t\t\t\t1. Pengambilan nomor antri");
            System.out.println("\t\t\t\t2. Pemanggilan nomor antri");
            System.out.println("\t\t\t\t3. Lihat data antrian");
            System.out.println("\t\t\t\t4. Keluar");
            System.out.print("\t\t\t\t     Pilihan Anda : ");
            menu=input.nextInt();
            if(menu==1){
                LL.enqueue();
            }else if(menu==2){
                LL.dequeue();
            }else if(menu==3){
                LL.view();
            }else if(menu==4){
                System.out.println("\n\t\t\t\tTerimakasih!!!!");
            }else{
                System.out.println("\n\t\t\t\tPerhatikan data yang Anda inputkan!!!!");
            }
        }while(menu!=4);
    }
}
