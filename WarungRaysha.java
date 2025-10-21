package ARRAY;

import java.util.Scanner;

public class WarungRaysha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String[] kode = new String[10];
        String[] namaBarang = new String[10];
        int[] harga = new int[10];
        int[] jumlahBeli = new int[10];
        int[] jumlahBayar = new int[10];

        System.out.println("=================");
        System.out.println(" TOKO NYA RAYSHA ");
        System.out.println("=================");
        System.out.print("Masukkan Item Barang : ");
        int n = input.nextInt();
        input.nextLine(); 


        for (int i = 0; i < n; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode : ");
            kode[i] = input.nextLine();

            System.out.print("Masukkan Jumlah Beli : ");
            jumlahBeli[i] = input.nextInt();
            input.nextLine(); 

            
            if (kode[i].equalsIgnoreCase("a1")) {
                namaBarang[i] = "Buku";
                harga[i] = 3000;
            } else if (kode[i].equalsIgnoreCase("a2")) {
                namaBarang[i] = "Pensil";
                harga[i] = 4000;
            } else if (kode[i].equalsIgnoreCase("a3")) {
                namaBarang[i] = "Pulpen";
                harga[i] = 5000;
            } else {
                namaBarang[i] = "Tidak Diketahui";
                harga[i] = 0;
            }

            jumlahBayar[i] = harga[i] * jumlahBeli[i];
            System.out.println();
        }

        
        System.out.println();
        System.out.println("===============================================================================");
        System.out.println("------------------------------TOKO NYA RAYSHA----------------------------------");
        System.out.println("===============================================================================");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("===============================================================================");

        int totalBayar = 0;
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + kode[i] + "\t\t" + namaBarang[i] + "\t\t" + harga[i] + "\t\t" + jumlahBeli[i] + "\t\t" + jumlahBayar[i]);
            totalBayar += jumlahBayar[i];
        }

        System.out.println("_______________________________________________________________________________");
        System.out.println("Total Bayar\t\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("-------------------------------------------------------------------------------");
    }
}

