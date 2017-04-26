package perusahaanx;
public class SoftwareEngineer extends PerusahaanX {    
    public SoftwareEngineer(int masaKerja) {
        super(masaKerja);
    }
    public long getBonus(){
        return super.getBonus()+300000;
    }
    public long getTunjangan(){
        return 5500000;
    }
    public long getGajiTotal(){
        return getGajiPokok()+getBonus()+getTunjangan();
    }
}
