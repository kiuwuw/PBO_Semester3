public class App {
    public static void main(String [] args){
        Barang spidol = new Barang("Spidol", 3000);
        Barang pensil = new Barang("Pensil",1500);

        Pelanggan P1 = new Pelanggan("Rizki", "+6282143962370",pensil,5);
        Pelanggan P2 = new Pelanggan("Olders", "+6282143962370",pensil,5);
    }
}
