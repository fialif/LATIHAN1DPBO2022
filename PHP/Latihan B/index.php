<?php

include "Klub.php";
include "Pemain.php";

$persija = new Klub("Persija", "Indonesia", 1928, "Jakarta Stadium", "Liga 1");
$pemainPersija[] = new Pemain("Gilang", "Bek", "Persija");
$pemainPersija[] = new Pemain("Galang", "Kiper", "Persija");

echo "Nama Tim        : ". $persija->getNamaKlub() ."<br>";
echo "Negara Asal Tim : ". $persija->getNegara() ."<br>";
echo "Tahun Berdiri   : ". $persija->getTahun() ."<br>";
echo "Stadion         : ". $persija->getStadion() ."<br>";
echo "Liga            : ". $persija->getLiga() ."<br>";

echo "================================== <br>";
echo "Anggota<br>";
echo "================================== <br>";
echo "Nama Pemain     : ". $pemainPersija[0]->getNama() ."<br>";
echo "Posisi          : ". $pemainPersija[0]->getPosisi() ."<br>";
echo "------------------------------- <br>";
echo "Nama Pemain     : ". $pemainPersija[1]->getNama() ."<br>";
echo "Posisi          : ". $pemainPersija[1]->getPosisi() ."<br>";
echo "------------------------------- <br>";



?>