#include "Klub.cpp"

int main(){

    Klub persija("Persija", "Indonesia", 1928, "Jakarta Stadium", "Liga 1");
    Klub mancity("Manchester City", "Inggris", 1894, "City of Manchester Stadium", "Premier League");

    persija.pmn[0].setNamaPemain("Gilang");
    persija.pmn[0].setPosisi("Bek");
    persija.pmn[1].setNamaPemain("Galang");
    persija.pmn[1].setPosisi("Kiper");

    mancity.pmn[0].setNamaPemain("Vincent");
    mancity.pmn[0].setPosisi("Gelandang");
    mancity.pmn[1].setNamaPemain("Sergio");
    mancity.pmn[1].setPosisi("Penyerang");

    cout << "Nama Tim        : " << persija.getNamaKlub() << endl;
    cout << "Negara Asal Tim : " << persija.getNegara() << endl; // negara
    cout << "Tahun Berdiri   : " << persija.getTahun() << endl; // tahun
    cout << "Stadion         : " << persija.getStadion() << endl; // stadion
    cout << "Liga            : " << persija.getLiga() << endl; // liga
    cout << "==================================" << endl;
    cout << "Anggota" << endl;
    cout << "==================================" << endl;
    cout << "Nama Pemain     : " << persija.pmn[0].getNamaPemain() << endl; // liga
    cout << "Posisi Pemain   : " << persija.pmn[0].getPosisi() << endl; // liga
    cout << "-------------------------------" << endl;
    cout << "Nama Pemain     : " << persija.pmn[1].getNamaPemain() << endl; // liga
    cout << "Posisi Pemain   : " << persija.pmn[1].getPosisi() << endl; // liga
    cout << "-------------------------------" << endl;
    cout << endl;
    
    cout << "Nama Tim        : " << mancity.getNamaKlub() << endl;
    cout << "Negara Asal Tim : " << mancity.getNegara() << endl; // negara
    cout << "Tahun Berdiri   : " << mancity.getTahun() << endl; // tahun
    cout << "Stadion         : " << mancity.getStadion() << endl; // stadion
    cout << "Liga            : " << mancity.getLiga() << endl; // liga
    cout << "==================================" << endl;
    cout << "Anggota" << endl;
    cout << "==================================" << endl;
    cout << "Nama Pemain     : " << mancity.pmn[0].getNamaPemain() << endl; // liga
    cout << "Posisi Pemain   : " << mancity.pmn[0].getPosisi() << endl; // liga
    cout << "-------------------------------" << endl;
    cout << "Nama Pemain     : " << mancity.pmn[1].getNamaPemain() << endl; // liga
    cout << "Posisi Pemain   : " << mancity.pmn[1].getPosisi() << endl; // liga
    cout << "-------------------------------" << endl;


    return 0;
}