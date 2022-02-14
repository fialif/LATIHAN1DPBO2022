<?php

class Pemain
{
    private $nama = "";
    private $namaKlub = "";
    private $posisi = "";

    public function __construct($nama = "null", $pss = "null", $namaKlub = ""){
        $this->nama = $nama;
        $this->posisi = $pss;
        $this->namaKlub = $namaKlub;
    }

    public function setNama($n){
        $this->nama = $n;
    }

    public function getNama(){
        return $this->nama;
    }

    public function setPosisi($pss){
        $this->posisi = $pss;
    }

    public function getPosisi(){
        return $this->posisi;
    }

    public function setNKPemain($namaKlub){
        $this->namaKlub = namaKlub;
    }

    public function getNKPemain(){
        return $this->namaKlub;
    }
}

?>