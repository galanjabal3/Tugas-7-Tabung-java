package bangunruang;

public class Main {

    public static void main(String[] args) {
	BangunRuang bangunRuang = new BangunRuang();
	Tabung tabung = new Tabung(6,15);

	// memanggil method luas dan method volume
     bangunRuang.luas();
     System.out.println("Luas tabung: " + tabung.luas());
     bangunRuang.volume();
     System.out.println("Volume tabung: " + tabung.volume());
    }
}
