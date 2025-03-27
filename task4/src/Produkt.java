public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private Double cena;
    private int iloscwmagazynie;

    public void setId(int id) {
        this.id = id;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    public void setCena(Double cena) {
        this.cena = cena;
    }
    public void setIloscWMagazynie(int iloscwmagazynie) {
        this.iloscwmagazynie = iloscwmagazynie;
    }
    public int getId() {
        return id;
    }
    public String getnazwa() {
        return nazwa;
    }
    public String getkategoria() {
        return kategoria;
    }
    public Double getcena() {
        return cena;
    }
    public int getiloscwmagazynie() {
        return iloscwmagazynie;
    }
    public void  wyswietlInformacje(){
        System.out.println("id: " + id + " nazwa: " + nazwa + " kategoria: " + kategoria + " cena: " + cena + " ilosc w magazynie: " + iloscwmagazynie);
    }
}
