#include <iostream>
#include <stdio.h>
#include <string>

using namespace std;

static int count;

class Klub{

    private:
        int idTim; /* id tim sepak bola */
        string namaKlub; /* nama tim sepak bola */
        string negara; /* negara asal tim sepak bola */
        int tahun; /* tahun berdirinya tim sepak bola */
        string stadion; /* stadion tim sepak bola */
        string liga; /* liga tim sepak bola */

    public:
        Klub(){
            setIDKLub(++count);
        }

        Klub(string namap, string negarap, int tp, string stadionp, string ligap){
            setIDKLub(++count);
            namaKlub = namap;
            negara = negarap;
            tahun = tp;
            stadion = stadionp;
            liga = ligap;
        }

        // method get set
        void setIDKLub(int id){
            // set id
            idTim = id;
        }

        int getIDKlub(){
            // mengembalikan id
            return idTim;
        }

        // nama, negara, tahun, stadion, liga.
        void setNamaKlub(string namap){
            namaKlub = namap;
        }
        string getNamaKlub(){
            return namaKlub;
        }

        void setNegara(string negarap){
            negara = negarap;
        }
        string getNegara(){
            return negara;
        }

        void setTahun(int tp){
            // mengeset nilai tahun berdiri tim sepak bola
            tahun = tp;
        }
        int getTahun(){
            // mengembalikan nilai tahun
            return tahun;
        }

        void setStadion(string stadionp){
            stadion = stadionp;
        }
        string getStadion(){
            return stadion;
        }

        void setLiga(string ligap){
            liga = ligap;
        }
        string getLiga(){
            return liga;
        }

        ~Klub(){

        }

        class Pemain{
            private:
                string namaP;
                string posisi;

            public:
                Pemain(){
                    // konstruktor
                }

                Pemain(string n, string pss){
                    namaP = n;
                    posisi = pss;
                }

                void setNamaPemain(string n){
                    namaP = n;
                }

                string getNamaPemain(){
                    return namaP;
                }

                void setPosisi(string n){
                    posisi = n;
                }

                string getPosisi(){
                    return posisi;
                }
        };

        Pemain pmn[2];
};