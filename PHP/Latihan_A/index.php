<?php

include "Mahasiswa.php";

$mhs1 = new Mahasiswa();
$mhs1->setNim(1903618);
$mhs1->setNama("Fia");
$mhs1->setJk("Perempuan");
$mhs1->setProdi("Ilkom");
$mhs1->setSemester(6);

$mhs2 = new Mahasiswa(1903816, "Fajri", "Laki-laki", "Psikologi", 4);

echo "Nama (2)          : ". $mhs2->getNama() ."<br>";
echo "NIM (2)           : ". $mhs2->getNim() ."<br>";
echo "Jenis kelamin (2) : ". $mhs2->getJk() ."<br>";
echo "Prodi (2)         : ". $mhs2->getProdi() ."<br>";
echo "Semester (2)      : ". $mhs2->getSemester() ."<br>";

echo "<br><br><br>";

echo "Nama (1)          : ". $mhs1->getNama() ."<br>";
echo "NIM (1)           : ". $mhs1->getNim() ."<br>";
echo "Jenis kelamin (1) : ". $mhs1->getJk() ."<br>";
echo "Prodi (1)         : ". $mhs1->getProdi() ."<br>";
echo "Semester (1)      : ". $mhs1->getSemester() ."<br>";

?>