package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;

    void tampilkanAtribut() {
        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        System.out.print("Nama \t\t\t : " + this.nama);
        System.out.print("NPM \t\t\t : " + this.npm);
        System.out.print("Tanggal Lahir \t : " + simpleDateFormat.format(this.tanggalLahir));
    }
    void menyapa() {
        System.out.println("Hai Nama Aku : + this.nama");
    }
}
