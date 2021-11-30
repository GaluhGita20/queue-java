package sample;

import java.util.Scanner;

public class DataPenjualan {

    public int id;
    public String nama, keperluan;
    public DataPenjualan next;

    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input(){
        System.out.println();
        System.out.print("\t\t\t\t\tMasukkan id           : ");
        id= in.nextInt();
        System.out.print("\t\t\t\t\tMasukkan nama         : ");
        nama=str.nextLine();
        System.out.print("\t\t\t\t\tMasukkan keperluan    : ");
        keperluan=str.nextLine();
        next=null;
    }

    public void read(){

        System.out.println("\t\t\t\t|| "+id+"\t|| "+nama+" \t|| "+keperluan+"\t\t||");

    }
}
