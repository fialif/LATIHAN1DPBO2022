class Klub{
/* / kelas untuk mengimplementasikan tim sepak bola */

    private static int count = 0; /* variabel statis untuk increment id tim sepak bola */
    private int idTim; /* id tim sepak bola */
    private String nama; /* nama tim sepak bola */
    private String negara; /* negara asal tim sepak bola */
    private int tahun; /* tahun berdirinya tim sepak bola */
    private String stadion; /* stadion tim sepak bola */
    private String liga; /* liga tim sepak bola */

    Klub(){
        // konstruktor
        setIDKlub(++count); /* id bertambah*/
    }

    Klub(String nama){
        // konstruktor dengan parameter nama tim sepak bola
        setIDKlub(++count); /* id tim */
        this.nama = nama; /* nama tim */
    }

    Klub(String namaP, String negaraP, int tp, String stadionP, String ligaP){
        /* konstruktor dengan parameter atribut yang lengkap dari tim sepak bola*/
        setIDKlub(++count);
        this.nama = namaP;
        this.negara = negaraP;
        this.tahun = tp;
        this.stadion = stadionP;
        this.liga = ligaP;
    }
    /* mehotd get set */
    public void setIDKlub(int id){
        // mengeset id klub
        this.idTim = id;
    }

    public int getIDKlub(){
        // mengembalikan id klub
        return this.idTim;
    }

    // method get set
    public void setNamaKlub(String namaP){
        // mengeset nama klub
        this.nama = namaP;
    }

    public String getNamaKlub(){
        // mengembalikan nama klub
        return this.nama;
    }

    public void setNegara(String negaraP){
        // mengeset negara asal klub
        this.negara = negaraP;
    }

    public String getNegara(){
        // mengembalikan nilai negara asal klub
        return this.negara;
    }

    public void setTahun(int tp){
        // mengeset tahun berdiri klub
        this.tahun = tp;
    }

    public int getTahun(){
        // mengembalikan nilai tahun berdiri klub
        return this.tahun;
    }

    public void setStadion(String stadionP){
        // mengeset stadion klub
        this.stadion = stadionP;
    }

    public String getStadion(){
        // mengembalikan nilai stadion klub
        return this.stadion;
    }

    public void setLiga(String ligaP){
        // mengeset liga klub
        this.liga = ligaP;
    }

    public String getLiga(){
        // mengembalikan nilai liga klub
        return this.liga;
    }

    // inner class
    class Pemain{
        private String nama;
        private String posisi;

        Pemain(){
            // konstruktor
        }

        Pemain(String nama, String pss){
            // konstruktor atribut yang lengkap dari kelas pemain
            this.nama = nama;
            this.posisi = pss;
        }
        
        public void setNamaPemain(String nama){
            // mengeset nama pemain
            this.nama = nama;
        }
        public String getNamaPemain(){
            // mengembalikan nama pemain
            return this.nama;
        }

        public void setPosisi(String pss){
            // mengeset posisi pemain
            this.posisi = pss;
        }

        public String getPosisi(){
            // mengembalikan nilai posisi pemain
            return this.posisi;
        }
    }
}