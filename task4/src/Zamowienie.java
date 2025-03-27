public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt produkty[];
    private int ilosci[];
    private String dataZamowienia;
    private String status;
    private Double znizka=1.0;

    public void setId(int id) {
        this.id = id;
    }
    public void setKlient(Klient klient) {
        this.klient = klient;
    }
    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }
    public void setIilosci(int[] ilosci) {
        this.ilosci = ilosci;
    }
    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public double  obliczWartoscZamowienia(){
        double wynik=0.0;
        for (int i = 0; i < produkty.length; i++) {
            double cena = produkty[i].getcena();
            wynik+=cena*(ilosci[i])*znizka;
        }
        return wynik;
    }

    public void zastosujZnizke(){
        if(klient.getCzyStaly()){
            znizka=0.9;
        }
    }
    public void wyswietlSzczegoly(){
        System.out.println("id: " + id + "klient: " + klient.getId() + "produkty: " + produkty + "ilosci: " + ilosci + "data: " + dataZamowienia + "status: " + status);
    }
}
