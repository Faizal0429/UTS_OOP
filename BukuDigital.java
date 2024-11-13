public class BukuDigital extends Buku{
    private String format;

    public BukuDigital(String judul, String pengarang, int tahunTerbit, String ISBN, String status, String format){
        super(judul, pengarang, tahunTerbit, ISBN, status);
        this.format = format;
    }

    public void setFormat(String format){
        this.format = format;
    }

    public String getFormat(){
        return format;
    }

    @Override
    public void tampilkanInfoBuku(){
        super.tampilkanInfoBuku();
        System.out.println("Formatnya berapa : " +format);
    }
}