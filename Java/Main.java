class Main{
    
    public static void main(String[] args){

        Klub[] arrKlub = new Klub[2];

        arrKlub[0] = new Klub("Persija", "Indonesia", 1928, "Jakarta Stadium", "Liga 1");
        arrKlub[1] = new Klub("Manchester City", "Inggris", 1894, "City of Manchester Stadium", "Premier League");

        Klub.Pemain[] pemainPersija = new Klub.Pemain[2];

        pemainPersija[0] = arrKlub[0].new Pemain("Gilang", "Bek");
        pemainPersija[1] = arrKlub[0].new Pemain("Galang", "Kiper");

        Klub.Pemain[] pemainManCity = new Klub.Pemain[2];

        pemainManCity[0] = arrKlub[1].new Pemain("Vincent", "Gelandang");
        pemainManCity[1] = arrKlub[1].new Pemain("Sergio", "Penyerang");


        Tampil tpl = new Tampil();
        int j = 0;
        
        tpl.tampilTim(arrKlub[0].getNamaKlub(), arrKlub[0].getNegara(), arrKlub[0].getTahun(), arrKlub[0].getStadion(), arrKlub[0].getLiga());
        for(j = 0; j < pemainPersija.length; j++){
            tpl.tampilPemain(pemainPersija[j].getNamaPemain(), pemainPersija[j].getPosisi());
        }
        System.out.println();
        tpl.tampilTim(arrKlub[1].getNamaKlub(), arrKlub[1].getNegara(), arrKlub[1].getTahun(), arrKlub[1].getStadion(), arrKlub[1].getLiga());
        for(j = 0; j < pemainManCity.length; j++){
            tpl.tampilPemain(pemainManCity[j].getNamaPemain(), pemainManCity[j].getPosisi());
        }
    }
}