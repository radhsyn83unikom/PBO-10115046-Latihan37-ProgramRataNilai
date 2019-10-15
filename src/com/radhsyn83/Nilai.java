package com.radhsyn83;

import java.util.Scanner;

public class Nilai {
    private int jumlahMahasiswa;
    private double total;

    public void setJumlahMahasiswa(int jumlahMahasiswa) {
        this.jumlahMahasiswa = jumlahMahasiswa;
    }

    public void hitung(Scanner s){
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-"+(i+1)+" : ");
            int t = s.nextInt();
            total = t+total;
        }

        System.out.println("Maka, Rata-rata nilai adalah : "+total/jumlahMahasiswa);
    }
}
