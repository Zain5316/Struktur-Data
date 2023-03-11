package Latihan_Praktikum;

public class Konsumsi<Element, Element1> {
    private Element makanan;
    private Element1 minuman;

    public Element getMakanan(){
        return makanan;
    }

    public Element1 getMinuman() {
        return minuman;
    }

    public void setKonsumsi(Element makanan, Element1 minuman){
        this.makanan = makanan;
        this.minuman = minuman;
    }
}
