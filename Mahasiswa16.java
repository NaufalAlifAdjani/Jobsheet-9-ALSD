public class Mahasiswa16 {

    String nim, kelas, nama;
    int nilai;

    Mahasiswa16(){

    }
    
    Mahasiswa16(String nim, String kelas, String nama){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}                                                                   