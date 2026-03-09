public class Buku {
    //data field
    String daftarPenulis[];
    private int jumlahPenulis;
    private String judul;
    private String sinopsis;

    //Constructor
    public Buku(int jumlahPenulis, String penulis[],String judul,String sinopsis){
        this.jumlahPenulis =jumlahPenulis;
        this.judul = judul;
        this.sinopsis =sinopsis;
        this.daftarPenulis = penulis;
    }


    //Getter dan setter
    //Set judul
    public void setJudul(String judul){
        this.judul = judul;
    }
    //Set penulis
    public void setPenulis(String penulis){
        for(int i=0; i<jumlahPenulis ; i++){
            if(daftarPenulis[i]!=(null)){
                daftarPenulis[i] = penulis;
            }
        }
    }

    //Set jumlah penulis
    public void setJumlahPenulis(int jumlahPenulis){
        this.jumlahPenulis = jumlahPenulis;
    }
    //Set sinopsis
    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }

    //Untuk mengambil judul
    public String getJudul(){
        return this.judul;
    }
    //Untuk mengambil jumlah penulis
    public int getJumlahPenulis(){
        return this.jumlahPenulis;
    }
    //Untuk mengambil penulis
    public String getPenulis(int i){
        return daftarPenulis[i];
    }
    //Untuk mengambil sinopsis
    public String getSinopsis(){
        return this.sinopsis;
    }

}