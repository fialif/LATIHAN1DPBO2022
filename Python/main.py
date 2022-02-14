from Klub import Klub

arrKlub = []

arrKlub.append( Klub("Persija", "Indonesia", 1928, "Jakarta Stadium", "Liga 1") )
arrKlub.append( Klub("Manchester City", "Inggris", 1894, "City of Manchester Stadium", "Premier League") )

pemainPersija = []

pemainPersija.append( arrKlub[0].pmn )
pemainPersija[0].setNamaPemain("Gilang")
pemainPersija[0].setPosisi("Bek")

print("Nama Tim        : ", arrKlub[0].getNamaKlub())
print("Nama Tim        : ", arrKlub[1].getNamaKlub())
print("Negara Asal Tim : ", arrKlub[0].getNegara())
print("Tahun Berdiri   : ", arrKlub[0].getTahun())
print("Stadion         : ", arrKlub[0].getStadion())
print("Liga            : ", arrKlub[0].getLiga())

print("==================================")
print("Anggota")
print("==================================")
print("Nama Pemain     : ", pemainPersija[0].getNamaPemain())
print("Posisi          : ", pemainPersija[0].getPosisi());
print("-------------------------------")
