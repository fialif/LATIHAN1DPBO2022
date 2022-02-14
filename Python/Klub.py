class Klub:
    def __init__(self, n, ng, t, s, l):
        self.nama = n
        self.negara = ng
        self.tahun = t
        self.stadion = s
        self.liga = l
        self.pmn = self.Pemain()
        # self.pmn.append(self.Pemain())
    
    # method get set
    def setNamaKlub(self, n):
        self.nama = n

    def getNamaKlub(self):
        return self.nama

    def setNegara(self, n):
        self.negara = n

    def getNegara(self):
        return self.negara

    def setTahun(self, t):
        self.tahun = t

    def getTahun(self):
        return self.tahun

    def setStadion(self, s):
        self.stadion = s

    def getStadion(self):
        return self.stadion

    def setLiga(self, l):
        self.liga = l

    def getLiga(self):
        return self.liga

    class Pemain:
        def __init__(self):
            pass
            # self.nama
            # self.posisi

        def setNamaPemain(self, n):
            self.nama = n

        def getNamaPemain(self):
            return self.nama

        def setPosisi(self, p):
            self.posisi = p

        def getPosisi(self):
            return self.posisi
