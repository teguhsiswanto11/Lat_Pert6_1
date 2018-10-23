    /*  kalau di class diagram nama kelasnya miring -> itu class Abstract */
public class Main {
        public static void main(String[] args) {
            Persegi psg = new Persegi();
            Lingkaran lg = new Lingkaran();

            psg.setSisi(6);
            System.out.println("Keliling persegi = "+psg.hitungkeliling());
            System.out.println("Luas persegi = "+psg.hitungLuas());

            lg.setR(7);
            System.out.println("Keliling Lingkaran = "+Math.ceil(lg.hitungkeliling()));
            System.out.println("Keliling Luas = "+Math.ceil(lg.hitungLuas()));

        }
}
