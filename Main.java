public class Main{
    public static Perpustakaan perpustakaan = new Perpustakaan();
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        while (true) { 
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahBuku();
                case 2 -> tambahAnggota();
                case 3 -> pinjamBuku();
                case 4 -> kembalikanBuku();
                case 5 -> daftarBukuTersedia();
                case 6 -> tampilkanInfoAnggota();
                case 7 -> tampilkanInfoBuku();
                case 8 -> {
                    System.out.println("Keluar dari program");
                    return;
                }
                default -> System.out.println("Pilihanmu tidak tersedia");
            }
        }
    }





    private static void tampilkanMenu(){
        System.out.println("\nMenu yang ada diaplikasi Perpustakaan : ");
        System.out.println("1. Menambahkan Buku ke Perpustakaan");
        System.out.println("2. Mendaftarkan Anggota Perpustakaan");
        System.out.println("3. Meminjam Buku");
        System.out.println("4. Mengembalikan Buku");
        System.out.println("5. Buku-Buku Yang Ada di Perpustakaan");
        System.out.println("6. Menampilkan Anggota Perpustakaan");
        System.out.println("7. Menampilkan Info Buku");
        System.out.println("8. Keluar Program");
    }






    public static void tambahBuku(){
        System.out.println("\nJudul Buku : ");
        String judul = scanner.nextLine();

        System.out.println("Pengarang Buku : ");
        String pengarang = scanner.nextLine();

        System.out.println("Tahun Terbit : ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ISBN : ");
        String ISBN = scanner.nextLine();

        System.out.println("Status buku (Ada/Dipinjam) : ");
        String status = scanner.nextLine();

        System.out.println("Buku Digital ? : ");
        String Digital = scanner.nextLine();

        Buku buku;
        if(Digital.equalsIgnoreCase("ya")){
            System.out.println("Ukuran formatnya : ");
            String format = scanner.nextLine();
            buku = new BukuDigital(judul, pengarang, tahunTerbit, ISBN, status, format);
        }else{
            buku = new Buku(judul, pengarang, tahunTerbit, ISBN, status);
        }

        perpustakaan.tambahBuku(buku);
    }






    public static void tambahAnggota(){
        System.out.println("\nNama Kamu : ");
        String nama = scanner.nextLine();

        System.out.println("Nomor Kamu : ");
        String nomorAnggota = scanner.nextLine();

        System.out.println("Alamat Kamu : ");
        String alamat = scanner.nextLine();

        Anggota anggota = new Anggota(nama, nomorAnggota, alamat);

        perpustakaan.tambahAnggota(anggota);
    }






    public static void pinjamBuku(){
        System.out.println("\nNomor Anggota : ");
        String nomorAnggota = scanner.nextLine();

        System.out.println("Judul Buku : ");
        String judul = scanner.nextLine();

        perpustakaan.pinjamBuku(nomorAnggota, judul);
    }



    public static void kembalikanBuku(){
        System.out.println("\nNomor Kamu : ");
        String nomorAnggota = scanner.nextLine();

        System.out.println("Judul Buku : ");
        String judul = scanner.nextLine();

        perpustakaan.mengembalikanBuku(nomorAnggota, judul);
    }




    public static void daftarBukuTersedia(){
        perpustakaan.daftarBukuTersedia();
    }



    public static void tampilkanInfoAnggota(){
        System.out.println("\nNama Anggota");
        String nama = scanner.nextLine();

        perpustakaan.tampilkanInfoAnggota(nama);

    }





    public static void tampilkanInfoBuku(){
        System.out.println("\nJudul Buku");
        String judul = scanner.nextLine();

        Buku buku = null;
        for(Buku b : perpustakaan.daftarBuku){
            if(b.getJudul().equals(judul)){
                buku = b;
                break;
            }
        }

        if(buku == null){
            System.out.println("Buku yang kamu cari ngga ada!!!");
        }else{
            buku.tampilkanInfoBuku();
            if(!(buku instanceof BukuDigital)){
                System.out.println("Buku fisik");
            }else{
                System.out.println("Buku Digital");
                System.out.println("Format Bukunya : "+((BukuDigital)buku).getFormat());
            }
        }
    }

}