package perusahaanx;
public class Main {
    public static void main(String[] args) {
        SoftwareEngineer se1 = new SoftwareEngineer (3);
        SoftwareEngineer se2 = new SoftwareEngineer (7);
        ProjectManager pm1 = new ProjectManager (2);
        ProjectManager pm2 = new ProjectManager (8);
        ProjectManager pm3 = new ProjectManager (11);
        System.out.println("Software Engineer 1 ");
        System.out.println("Masa Kerja : "+se1.getmasaKerja());
        System.out.println("Gaji Total : "+se1.getGajiTotal());
        System.out.println("Software Engineer 2 ");
        System.out.println("Masa Kerja : "+se2.getmasaKerja());
        System.out.println("Gaji Total : "+se2.getGajiTotal());
        System.out.println("Project Manager 1 ");
        System.out.println("Masa Kerja : "+pm1.getmasaKerja());
        System.out.println("Gaji Total : "+pm1.getGajiTotal());
        System.out.println("Project Manager 2 ");
        System.out.println("Masa Kerja : "+pm2.getmasaKerja());
        System.out.println("Gaji Total : "+pm2.getGajiTotal());
        System.out.println("Project Manager 3 ");
        System.out.println("Masa Kerja : "+pm3.getmasaKerja());
        System.out.println("Gaji Total : "+pm3.getGajiTotal());
    }    
}