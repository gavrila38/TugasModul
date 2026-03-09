class KategoriBuku{
    //data field
    private String kategori;
    private int banyakBuku;
    Buku[] daftarBuku;


    //Constructor
    public KategoriBuku(String kategori, int banyakBuku){
        this.kategori = kategori;
        this.banyakBuku = banyakBuku;
        daftarBuku = new Buku[banyakBuku];
    }
    public KategoriBuku(String kategori, int banyakBuku,Buku[] daftarBuku){
        this.kategori= kategori;
        this.banyakBuku = banyakBuku;
        this.daftarBuku = daftarBuku;
    }


    //Getter Setter
    public String getKategori(){
        return this.kategori;
    }
    public int getBanyakBuku(){
        return this.banyakBuku;
    }
    public Buku[] getDaftarBuku(){
        return this.daftarBuku;
    }
    public void setKategori(String kategori){
        this.kategori= kategori;
    }
    public void setBanyakBuku(int banyakBuku){
        this.banyakBuku = banyakBuku;
    }
    public void setDaftarBuku(int i, int jumlahPenulis,String[] penulis,String judul,String sinopsis){
        this.daftarBuku[i] = new Buku(jumlahPenulis,penulis, judul, sinopsis);

    }

    //Method untuk cek judul
    public boolean cekJudul(String judul){
        for(int i=0 ; i<daftarBuku.length; i++){
            if(judul.equalsIgnoreCase(daftarBuku[i].getJudul())){
                return true;
            }
        }
        return false;
    }
    
    //Method untuk menghitung jumlah kata di sinopsis
    public void hitungSinopsis(String kategori, String judul){
        for(int i=0 ; i<daftarBuku.length; i++){
            if(judul.equalsIgnoreCase(daftarBuku[i].getJudul())){
                String[] kelompokSinopsis = daftarBuku[i].getSinopsis().split(" ");
                System.out.println("Jumlah kata : " + kelompokSinopsis.length);
            }   
        }
        
    }
    
    
    //Method untuk menampilkan seluruh daftar dari data field
    public void tampikanBuku(){
        System.out.printf("%-10s : %s\n","Kategori",this.kategori);
        System.out.printf("%-10s : %d\n","Jumlah Buku",this.banyakBuku);
        
        for(int i =0; i< banyakBuku; i++){
            System.out.printf("%-10s : %s\n","Judul",daftarBuku[i].getJudul() );
            System.out.printf("%-10s : ","Penulis");
            for(int j =0 ; j<daftarBuku[i].getJumlahPenulis() ; j++ ){
            System.out.print( daftarBuku[i].getPenulis(j) + " ");
            }
            System.out.println();
            System.out.printf("%-10s : %s\n","Sinopsis",daftarBuku[i].getSinopsis());
            System.out.println();
        }
        System.out.println("======================================================================\n");
        
    }

    //Method cek tingkat kesamaan, dengan parameter object lain dan nilai kembalian 0-100% sesuai kesamaan attribute kedua object,
    public void cekKesamaan(int i,int j){
        int sama=0;
        int totalParameter = 3;
        if(daftarBuku[i].getJudul().equalsIgnoreCase(daftarBuku[j].getJudul())){
            sama++;
        }
        if(daftarBuku[i].getJumlahPenulis()==daftarBuku[j].getJumlahPenulis()){
            sama++;
        }
        if(daftarBuku[i].getSinopsis().equalsIgnoreCase(daftarBuku[j].getSinopsis())){
            sama++;
        }
        int persentaseKesamaan = sama/totalParameter*100;

        System.out.print("Tingkat kesamaan : " + persentaseKesamaan + "%");
    }

    //Method copy yang mengembalikan object yang nilainya sama
    //parameter merujuk pada posisi array yang ingin di copy
    public KategoriBuku copy(){
        return  new KategoriBuku(this.kategori, this.banyakBuku,this.daftarBuku);
    }

}

