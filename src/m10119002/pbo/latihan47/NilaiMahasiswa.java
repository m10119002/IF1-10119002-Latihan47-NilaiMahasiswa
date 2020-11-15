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
 * Deskripsi Program : Class untuk objek Nilai Mahasiswa
 * 
 * 
 */
public class NilaiMahasiswa {
    private double quiz, uts, uas;
    
    public NilaiMahasiswa(double quiz, double uts, double uas) {
        this.quiz = quiz; this.uts = uts; this.uas = uas;
    }
    
    public double getNilaiQuiz() {return this.quiz;}
    public void setNilaiQuiz(double quiz) {this.quiz = quiz;}
    public double getNilaiUTS() {return this.uts;}
    public void setNilaiUTS(double uts) {this.uts = uts;}
    public double getNilaiUAS() {return this.uas;}
    public void setNilaiUAS(double uas) {this.uas = uas;}
    public double hitungNilaiAkhir() {
        return 0.2*this.quiz + 0.3*this.uts + 0.5*this.uas;
    }
    public char getIndexNilai(double nilaiAkhir) {
        if((80.0 < nilaiAkhir) && (nilaiAkhir <= 100.0)) {
            return 'A';
        } else if((68.0 < nilaiAkhir) && (nilaiAkhir <= 80.0)) {
            return 'B';
        } else if((56.0 < nilaiAkhir) && (nilaiAkhir <= 68.0)) {
            return 'C';
        } else if((45.0 < nilaiAkhir) && (nilaiAkhir <= 56.0)) {
            return 'D';
        } else if((nilaiAkhir >= 0.0) && (nilaiAkhir <= 45.0)) {
            return 'E';
        } else {
            return 'F';
        }
    }
    public String getKeteranganNilai(char indexNilai) {
        switch (indexNilai) {
            case 'A':
                return "Sangat Baik";
            case 'B':
                return "Baik";
            case 'C':
                return "Cukup";
            case 'D':
                return "Kurang";
            case 'E':
                return "Sangat Kurang";
            default:
                return "???";
        }
    }
}
