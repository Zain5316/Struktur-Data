package Latihan_Praktikum;

public class Kota<Element> {
    private Element element;

    public Kota(Element kota){
        element = kota;
    }

    public Element getElement() {
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahkota = new Kota<Integer>(9);
        Kota<String> namakota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota Di Jawa Timur : " + jumlahkota.getElement() + " Kota");
        System.out.println("Salah satu kota di Jawa Timur : Kota " + namakota.getElement());
    }
}
