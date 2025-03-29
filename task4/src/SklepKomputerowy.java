import java.util.ArrayList;
import java.util.List;

public class SklepKomputerowy {
    private List <Produkt> produkty = new ArrayList<Produkt>();
    private List <Klient> klienci = new ArrayList<Klient>();
    private List <Zamowienie> zamowienia = new ArrayList<Zamowienie>();
    private int liczbaProduktow , liczbaKlientow , liczbaZamowien = 0;

    public void dodajProdukt (Produkt produkt){
        produkty.add(produkt);
        liczbaProduktow++;
    }
    public void dodajKlienta(Klient klient){
        klienci.add(klient);
        liczbaKlientow++;
    }
    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci){
        Zamowienie zamowienie = new Zamowienie();
        liczbaZamowien++;
        zamowienie.setId(liczbaZamowien);
        zamowienie.setKlient(klient);
        zamowienie.setProdukty(produkty);
        zamowienie.setIilosci(ilosci);
        zamowienia.add(zamowienie);
        zamowienie.setStatus("NOWE");
        zamowienie.setDataZamowienia("data");
        return zamowienie;
    }
    
    public void  aktualizujStanMagazynowy(Zamowienie zamowienie){
        Produkt[] produktyZamowione = zamowienie.getProdukty();
        int[] ilosciZamowione = zamowienie.getIlosci();
    
        for (int i = 0; i < produktyZamowione.length; i++) {
            Produkt produktZamowiony = produktyZamowione[i];
            int iloscZamowiona = ilosciZamowione[i];
    
            for (Produkt p : produkty) {
                if (p.getId() == produktZamowiony.getId()) {
                    int nowyStan = p.getiloscwmagazynie() - iloscZamowiona;
                    p.setIloscWMagazynie(nowyStan);
                }
            }
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus){
        for (Zamowienie z : zamowienia){
            if(z.getId() == idZamowienia){
                z.setStatus(nowyStatus);
            }
        }
    }

    public void  wyswietlProduktyWKategorii(String kategoria){
        for (Produkt p : produkty){
            if (p.getkategoria() == kategoria){
                p.wyswietlInformacje();
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta){
        for (int i = 0; i < liczbaZamowien; i++) {
            Zamowienie zam = zamowienia.get(i);
            if (zam.getKlient().getId() == idKlienta) {
                zam.wyswietlSzczegoly();
            }
        }
    }
    }

