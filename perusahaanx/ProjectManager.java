package perusahaanx;
public class ProjectManager extends PerusahaanX {
    public ProjectManager(int masaKerja) {
        super(masaKerja);
    }
    public long getTunjangan(){
        return 6000000;
    }
    public long getBonus(){
        return super.getBonus()+450000;
    }
    public long getApresisasi(){
        if (super.getmasaKerja()>=10)
            return 700000;
        else
            return 225000;
    }
    public long getGajiTotal(){
        return getGajiPokok()+getTunjangan()+getBonus()+getApresisasi();
    }
}
