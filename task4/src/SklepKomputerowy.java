import java.util.ArrayList;
import java.util.List;

public class SklepKomputerowy {
    private List <Produkt> produkty = new ArrayList<Produkt>();
    private List <Klient> klienci = new ArrayList<Klient>();
    private Zamowienie[] zamowienia;
    private int liczbaProduktow , liczbaKlientow , liczbaZamowien;

    public void dodajProdukt (Produkt produkt){
        produkty.add(produkt);
    }
    public void dodajKlienta(Klient klient){
        klienci.add(klient);
    }
    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci){
        
    }
}
