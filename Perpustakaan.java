public class Perpustakaan{
    public java.util.List<Buku> daftarBuku;
    public java.util.List<Anggota> daftarAnggota;

    public Perpustakaan(){
        this.daftarBuku = new java.util.ArrayList<>();
        this.daftarAnggota = new java.util.ArrayList<>();
    }

    public void tambahBuku(Buku buku){
        daftarBuku.add(buku);
        System.out.println("\nBuku sudah ditambahkan!!! ");
    }



    public void daftarBukuTersedia(){
        System.out.println("\nBuku yang tersedia di perpus : ");
        boolean bukuYangTersedia = false;
        for (Buku buku : daftarBuku){
            if (buku.getStatus().equals("ada")){
                buku.tampilkanInfoBuku();
                bukuYangTersedia = true;
            }
        }
        if (!bukuYangTersedia){
            System.out.println("Ngga ada bukunya woi!!!");
        }
    }




    public void tambahAnggota(Anggota anggota){
        daftarAnggota.add(anggota);
        System.out.println("\nKamu telah berhasil jadi anggota");
    }





    public void pinjamBuku(String nomorAnggota, String ISBN){
        Anggota anggota = null;
        for (Anggota a : daftarAnggota){
            if (a.getNomorAnggota().equals(nomorAnggota)){
                anggota = a;
                break;
            }
        }

        if (anggota == null){
            System.out.println("Anggota yang lu cari ngga ada!!");
            return;
        }

        Buku buku = null;
        for (Buku b : daftarBuku){
            if(b.getISBN().equals(ISBN)&&b.getStatus().equals("ada")){
                buku = b;
                break;
            }
        }

        if (buku == null){
            System.out.println("Buku yang kamu cari ngga ada!!");
            return;
        }

        buku.setStatus("Udah dipinjam");
        anggota.tambahPeminjaman(buku);
        System.out.println("Buku berhasil kamu pinjam!!!");
    }






    public void mengembalikanBuku(String nomorAnggota, String ISBN){
        Anggota anggota = null;
        for (Anggota a : daftarAnggota){
            if (a.getNomorAnggota().equals(nomorAnggota)){
                anggota = a;
                break;
            }
        }

        if (anggota == null){
            System.out.println("Anggota yang kamu cari ngga ada!!!");
            return;
        }

        Buku buku = null;
        for (Buku b : anggota.getDaftarpeminjaman()){
            if (b.getISBN().equals(ISBN)){
                buku = b;
                break;
            }
        }

        if (buku == null){
            System.out.println("Buku lagi tidak dipinjam");
            return;
        }

        buku.setStatus("ada");
        anggota.hapusPeminjaman(buku);
        System.out.println("Buku yang kamu pinjam berhasil dibalikin");
    }




    

    public void tampilkanInfoAnggota(String nama){
        Anggota anggota = null;
        for(Anggota a : daftarAnggota){
            if (a.getNama().equals(nama)){
                anggota = a;
                break;
            }
        }

        if (anggota == null){
            System.out.println("Anggota yang lu cari ngga ada");
            return;
        }

        anggota.tampilkanInfoAnggota();
    }

}