package perusahaanx;
public class PerusahaanX {    
    private int masaKerja;
    PerusahaanX(int masaKerja){
        this.masaKerja = masaKerja;
    }
    public long getBonus(){
        if (masaKerja>5)
            return 250000;
        else
            return 0;
    }
    public long getGajiPokok(){
        return 2500000;
    }
    public int getmasaKerja(){
        return masaKerja;
    }
}
