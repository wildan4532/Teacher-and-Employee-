//Object Class
public class Employee {
    private String nama;
    private double gaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    /*constructor nama sama dengan nama class */
    public Employee(){
        nama = "";
        gaji = 0.00;
    }
    
    //Constructor parameter
    public Employee (String nama , double gaji) {
        this.nama = nama;
        this.gaji= gaji;
    }
    //method
    public void print() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ini Data Dari Karyawan Kantin");
        System.out.println("Nama : "+ nama);
        System.out.println("Gaji : "+ gaji);
        System.out.println("-------------------------------------------------------------------------");
    }

}