<?php

class Klub
{
    private $namaKlub = "";
    private $negara = "";
    private $tahun = 0 ;
    private $stadion = "";
    private $liga = "";

    public function __construct($nama = "null", $negara = "null", $t = 0, $s = "null", $l = "null"){
        $this->namaKlub = $nama;
        $this->negara = $negara;
        $this->tahun = $t;
        $this->stadion = $s;
        $this->liga = $l;
    }

    public function setNamaKlub($n){
        $this->namaKlub = $n;
    }

    public function getNamaKlub(){
        return $this->namaKlub;
    }

    public function setNegara($negara){
        $this->negara = $negara;
    }

    public function getNegara(){
        return $this->negara;
    }

    public function setTahun($tahun){
        $this->tahun = $tahun;
    }

    public function getTahun(){
        return $this->tahun;
    }

    public function setStadion($stadion){
        $this->stadion = $stadion;
    }

    public function getStadion(){
        return $this->stadion;
    }

    public function setLiga($liga){
        $this->liga = $liga;
    }

    public function getLiga(){
        return $this->liga;
    }
}

?>