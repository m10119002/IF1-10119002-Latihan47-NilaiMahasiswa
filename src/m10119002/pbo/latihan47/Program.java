/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan47;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program nilai mahasiswa
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    private static void tampil(NilaiMahasiswa nMhs) {
        System.out.println("QUIZ            = ".
                concat(Double.toString(nMhs.getNilaiQuiz())));
        System.out.println("UTS             = ".
                concat(Double.toString(nMhs.getNilaiUTS())));
        System.out.println("UAS             = ".
                concat(Double.toString(nMhs.getNilaiUAS())));
        System.out.println("");
        System.out.println("Nilai Akhir     = ".
                concat(Double.toString(nMhs.hitungNilaiAkhir())));
        System.out.println("");
        System.out.println("Index = ".
                concat(String.valueOf(nMhs.getIndexNilai(nMhs.hitungNilaiAkhir()))));
        System.out.println("Keterangan = ".
                concat(nMhs.getKeteranganNilai(
                        nMhs.getIndexNilai(nMhs.hitungNilaiAkhir()))));
        System.out.println("===");
    }
    
    public static void main(String[] args) {
        NilaiMahasiswa nMhs_1 = new NilaiMahasiswa(75.0, 45.0, 34.0);
        tampil(nMhs_1);
        NilaiMahasiswa nMhs_2 = new NilaiMahasiswa(60.0, 80.0, 75.0);
        tampil(nMhs_2);
        NilaiMahasiswa nMhs_3 = new NilaiMahasiswa(30.0, 80.0, 40.0);
        tampil(nMhs_3);
    }
}
