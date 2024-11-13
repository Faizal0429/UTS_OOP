public class Buku{
    public String judul;
    public String pengarang;
    public int tahunTerbit;
    protected String ISBN;
    protected String status;

    public Buku(String judul, String pengarang, int tahunTerbit, String iSBN, String status){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.ISBN = iSBN;
        this.status = status;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getJudul(){
        return judul;
    }

    public String getPengarang(){
        return pengarang;
    }

    public int getTahunTerbit(){
        return tahunTerbit;
    }

    public String getISBN(){
        return ISBN;
    }

    public String getStatus(){
        return status;
    }

    public void tampilkanInfoBuku(){
        System.out.println("Judul buku : " +judul);
        System.out.println("Pengarangnya siapa : " +pengarang);
        System.out.println("Tahun Terbit berapa : " +tahunTerbit);
        System.out.println("ISBN apa : " +ISBN);
        System.out.println("Status apa : " + status);
    }
}