package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        Nilai n = new Nilai();

        System.out.print("Masukkan banyak mahasiswa : ");
        n.setJumlahMahasiswa(s.nextInt());
        n.hitung(s);
    }
}
