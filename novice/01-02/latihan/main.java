public class main {
    public static void main(String[] args) {
        inheritanceBangunDatar mBangunDatar = new inheritanceBangunDatar();

        persegi mpersegi = new persegi();
        mpersegi.sisi = 2;

        lingkaran mlingkaran = new lingkaran();
        mlingkaran.r = 22;

        mBangunDatar.luas();
        mBangunDatar.keliling();


        mpersegi.luas();
        mpersegi.keliling();


        mlingkaran.luas();
        mlingkaran.keliling();
    }
}