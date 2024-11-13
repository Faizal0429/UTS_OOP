public class Anggota{
    protected String nama;
    private String nomorAnggota;
    private String alamat;
    protected java.util.List<Buku> daftarPeminjaman;

    public Anggota(String nama, String nomorAnggota, String alamat){
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.daftarPeminjaman = new java.util.ArrayList<>();
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorAnggota(String nomorAnggota){
        this.nomorAnggota = nomorAnggota;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setDaftarPeminjaman(java.util.List<Buku> daftarPeminjaman){
        this.daftarPeminjaman = daftarPeminjaman;
    }

    public String getNama(){
        return nama;
    }

    public String getNomorAnggota(){
        return nomorAnggota;
    }

    public String getAlamat(){
        return alamat;
    }

    public java.util.List<Buku> getDaftarpeminjaman(){
        return daftarPeminjaman;
    }

    public void tambahPeminjaman(Buku buku){
        this.daftarPeminjaman.add(buku);
    }

    public void hapusPeminjaman(Buku buku){
        this.daftarPeminjaman.remove(buku);
    }

    public void tampilkanInfoAnggota(){
        System.out.println("Nama kamu : " +nama);
        System.out.println("Nomor anggota : " + nomorAnggota);
        System.out.println("Alamat kamu : " +alamat);
        System.out.println("Daftar peminjaman kamu : ");
        for(Buku buku : daftarPeminjaman){
            buku.tampilkanInfoBuku();
        }
    }
}