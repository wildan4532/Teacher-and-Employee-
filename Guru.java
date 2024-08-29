public class Guru {
  //Object Class
  private int id;
  private String nama, mapel, alamat;
  

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getMapel() {
    return mapel;
  }

  public void setMapel(String mapel) {
    this.mapel = mapel;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  //Constructor nama sama dgn nama Class
  public Guru() {
    id = 0;
    nama = "";
    mapel = "";
    alamat = "";
    
  }

  //Constructor Parameter
  public Guru (int id, String nama, String mapel, String alamat ) {
    this.id = id;
    this.nama = nama;
    this.mapel = mapel;
    this.alamat = alamat;
  }

  //Method
  public void print () {
    System.out.println("----------------------");
    System.out.println("Id: " + id);
    System.out.println("Nama: " + nama);
    System.out.println("Mapel :" + mapel);
    System.out.println("Alamat: " + alamat);
    System.out.println("-----------------------");
  }
}


