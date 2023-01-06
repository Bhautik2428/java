

import java.util.Scanner;
public class Bhautikcafe {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       

        int harga =0;
        int harga_item[] = {20000, 35000, 59000, 63000, 180000, 120000, 5000, 2000};
        String menu = null;
        int total;
        double diskon;
        double bayar;
        int pembayaran;
       

        for (String a = "Y"; a.equals("Y")||a.equals("y"); )
        {
        System.out.println("");
        System.out.println("|_______________________________________________|");
        System.out.println("|                     MENU                      |");
        System.out.println("|                 Bhautik.S Cafe                |");
        System.out.println("|_______________________________________________|");
        System.out.println("|          Nama               |     Harga       |");
        System.out.println("|_____________________________|_________________|");
        System.out.println("| 1. Domenico crolla's        |   Rp 20000      |");
        System.out.println("| 2. pizza Royal 007          |   Rp 35000      |");
        System.out.println("| 3. Densuka Watermelon       |   Rp 59000      |");
        System.out.println("| 4. Yubari melons            |   Rp 63000      |");
        System.out.println("| 5. almas cavira             |   Rp 120000     |");
        System.out.println("| 6. italianwhite alba truffle|   Rp 180000     |");
        System.out.println("| 7. golden banana sake       |   Rp 5000       |");
        System.out.println("| 8. gold ice-crem            |   Rp 2000       |");
        System.out.println("|_____________________________|_________________|");
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.print (" choose product number you wont to wont :- ");
        int input_item = input.nextInt();
        
        System.out.print (" how meny quantity you wont to wont: ");
        int jumlah = input.nextInt();
        System.out.println("________________________________________________");

        if (input_item == 1)
        {
            menu = " Domenico crolla's ";
            harga = harga + harga_item[0] * jumlah;
            total= harga_item[0] * jumlah;
            System.out.println("your product name is  :- " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
            
        }
        else if (input_item == 2)
        {
            menu = "pizza Royal 007 ";
            harga = harga + harga_item[1] * jumlah;
            total= harga_item[1] * jumlah;
         System.out.println("your product name is :- " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 3)
        {
            menu = " Densuka Watermelon ";
            harga = harga + harga_item[2] * jumlah;
            total= harga_item[2] * jumlah;
         System.out.println("your product name is :- " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 4)
        {
            menu = " Yubari melons ";
            harga = harga + harga_item[3] * jumlah;
            total= harga_item[3] * jumlah;
            System.out.println("your product name is :- " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 5)
        {
            menu = " almas cavira ";
            harga = harga + harga_item[4] * jumlah;
            total= harga_item[4] * jumlah;
            System.out.println("your product name is :- " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
        else if (input_item == 6)
        {
            menu = " italian white alba truffle ";
            harga = harga + harga_item[5] * jumlah;
            total= harga_item[5] * jumlah;
            System.out.println("your product name is :- " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
  else if (input_item == 7)
        {
            menu = " golden banana sake ";
            harga = harga + harga_item[6] * jumlah;
            total= harga_item[6] * jumlah;
            System.out.println("your product name is :- " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }

        else if (input_item == 8)
        {
            menu = " gold ice-crem ";
            harga = harga + harga_item[7] * jumlah;
            total= harga_item[7] * jumlah;
            System.out.println("your product name is :- " + menu +"    x"+ jumlah+"   |  Rp. "+ total);
        }
  else
        {
            System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia.");
        }
        
            System.out.println("Bake you menu (Y),get total bell (T)? Y/T");
            a = input.next();
            

        }
        
       
        
       
        
        if(harga >=500000){diskon = harga * 0.5;}
        else if(harga >= 200000){diskon = harga * 0.35;}
        else if (harga >= 50000){diskon = harga * 0.1;}
        else {diskon = 0;}
        
        bayar = harga-diskon;
       
        
        System.out.println("________________________________________________");
        System.out.println("your total Bill is           :  Rp." +harga);
        System.out.println("Bhautik.s cafe give discount :  Rp." +diskon);
        System.out.println("your final total Bill is     :  Rp." +bayar);
        System.out.println("________________________________________________");
        System.out.print  ("Plese pay your Bell amount   :  RP.");

        pembayaran = input.nextInt();
        double kembalian = pembayaran-bayar;

        System.out.println("our loss is a                :  Rp." +kembalian);
        System.out.println("________________________________________________");
        System.out.println("tank's you have come. i tink you have very happy");
        System.out.println("________________________________________________");
    }
}

