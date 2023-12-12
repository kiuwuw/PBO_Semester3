public class Faktur {
    public String noFaktur;
    public static int a=1;

    public Faktur(String noFaktur){
        this.noFaktur = noFaktur;
    }
    public Faktur(String nama,String noHp,Barang barang ,Integer jumlah ){
        a++;
        System.out.println("No Faktur  : SS"+a);
        cetak(nama, noHp, barang, jumlah);
    }

    public void cetak(String nama,String noHp,Barang barang ,Integer jumlah ){
        System.out.println("========================");
        System.out.println("An         : " + nama);
        System.out.println("Nomor      : "+ noHp);
        System.out.println("Belanja    : ");
        System.out.print(barang.namaBarang + " x " + jumlah +" : " );
        System.out.println(barang.harga * jumlah);
    }
}
