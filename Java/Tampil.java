class Tampil{
    // kelas untuk mengimplementasikan tampilan dari daftar tim sepak bola

    Tampil(){
        // konstruktor
    }

    public void tampilTim(String nama, String negara, int tahun, String stadion, String liga){
        // method untuk menampilkan data tim sepak bola
        // nama, negara, tahun berdiri, stadion, liga
        System.out.println("Nama Tim        : " + nama);
        System.out.println("Negara Asal Tim : " + negara);
        System.out.println("Tahun Berdiri   : " + tahun);
        System.out.println("Stadion         : " + stadion);
        System.out.println("Liga            : " + liga);
        
        System.out.println("==================================");
        System.out.println("Anggota");
        System.out.println("==================================");
    }
    public void tampilPemain(String nama, String pss){
        // method untuk menampilkan data pemain di suatu tim
        System.out.println("Nama Pemain     : " + nama);
        System.out.println("Posisi          : " + pss);
        System.out.println("-------------------------------");
    }
}