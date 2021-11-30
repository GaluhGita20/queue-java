package sample;

public class LinkedList {

    public DataPenjualan head, tail;

    public LinkedList(){
        head=null;
        tail=null;
    }

    public void enqueue(){
        DataPenjualan dt= new DataPenjualan();
        dt.input();
        if(head==null)
            head=dt;
        else
            tail.next=dt;
        tail=dt;
    }

    public void dequeue(){
        if(head==null){
            System.out.println("\n\t\t\t\t\tData Kosong!!!");
        }else{
            System.out.println("\n\t\t\t\t\tNomor antri dengan id : "+head.id+ "atas nama " +head.nama);
            head=head.next;
        }
    }

    public void view(){
        if(head==null){
            System.out.println("\n\t\t\t\t\tData Kosong!!!");
        }else{
            System.out.println("\n\t\t\t\t==========================================================");
            System.out.println("\t\t\t\t|| Id \t\t|| Nama \t\t|| Keperluan \t||");
            for (DataPenjualan a=head; a!=null; a=a.next) a.read();
            System.out.println("\t\t\t\t==========================================================");

        }
    }
}
