import java.time.LocalDate;

public class BukuLuar extends Buku{
    private String importOleh;
    private LocalDate tglImpor;

    public BukuLuar(String idBuku, String namaBuku){
        super(idBuku, namaBuku);
    }

    public void setImporOleh(String imporOleh){
        this.importOleh = imporOleh;
    }

    public String getImporOleh(){
        return importOleh;
    }

    public void setTglimpor(LocalDate tglImpor){
        this.tglImpor = tglImpor;
    }

    public LocalDate getTglImpor(){
        return tglImpor;
    }
}
