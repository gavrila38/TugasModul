import java.util.Scanner;

public class Program{
    
   

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        KategoriBuku[] daftarKategoriBuku ={new KategoriBuku("Teknologi", 5),
                                            new KategoriBuku("Filsafat", 6),
                                            new KategoriBuku("Sejarah", 5),
                                            new KategoriBuku("Agama", 5),
                                            new KategoriBuku("Psikologi", 6),
                                            new KategoriBuku("Politik", 6),
                                            new KategoriBuku("Fiksi", 5)};
                                             
    

        daftarKategoriBuku[0].setDaftarBuku(0,1,new String[]{"Walter Isaacson"},"The Innovators","Kisah para pionir komputer, internet, dan teknologi digital.");
        daftarKategoriBuku[0].setDaftarBuku(1, 1,new String[]{"Ray Kurzweil"},"The Singularity is Near","Prediksi perkembangan kecerdasan buatan dan masa depan manusia.");
        daftarKategoriBuku[0].setDaftarBuku(2,1,new String[]{"Shoshana Zuboff"},"The Age of Surveillance Capitalism","Analisis tentang data, privasi, dan ekonomi digital modern.");
        daftarKategoriBuku[0].setDaftarBuku(3,1,new String[]{"Eric Schmidt", "Jonathan Rosenberg"},"How Google Works","Strategi inovasi dan budaya kerja di perusahaan teknologi besar.");
        daftarKategoriBuku[0].setDaftarBuku(4,1,new String[]{"Andrew Ng"},"Machine Learning Learning","Panduan praktis memahami dan membangun sistem AI.");
        daftarKategoriBuku[0].tampikanBuku();

        daftarKategoriBuku[1].setDaftarBuku(0,1, new String[]{"Marcus Aurelius"},"Meditations","Kumpulan catatan pribadi Kaisar Romawi tentang filsafat Stoik, berisi refleksi tentang kebajikan, ketenangan batin, dan cara menghadapi penderitaan hidup.");
        daftarKategoriBuku[1].setDaftarBuku(1,1, new String[]{"Plato"},"The Republic","Dialog filosofis yang membahas keadilan, bentuk negara ideal, dan konsep “filosof sebagai raja”. Menjadi salah satu karya paling berpengaruh dalam filsafat politik.");
        daftarKategoriBuku[1].setDaftarBuku(2,1, new String[]{"Aristotle"},"Nicomachean Ethics","Menjelaskan konsep etika dan kebahagiaan, dengan gagasan bahwa hidup baik dicapai melalui kebajikan (virtue).");
        daftarKategoriBuku[1].setDaftarBuku(3,1, new String[]{"Friedrich Nietzsche"},"Thus Spoke Zarathustra","Karya monumental Nietzsche yang memperkenalkan konsep “Übermensch” (manusia unggul) dan kritik terhadap moralitas tradisional.");
        daftarKategoriBuku[1].setDaftarBuku(4,1, new String[]{"Martin Heidegger"},"Being and Time","Buku kompleks yang membahas eksistensi manusia (Dasein) dan konsep waktu, menjadi dasar filsafat eksistensialisme abad ke-20.");
        daftarKategoriBuku[1].setDaftarBuku(5,1, new String[]{"Immanuel Kant"},"Critique of Pure Reason","Karya besar yang menjelaskan batasan pengetahuan manusia, membedakan antara fenomena (dunia yang tampak) dan noumena (realitas sejati).");
        daftarKategoriBuku[1].tampikanBuku();
    
        daftarKategoriBuku[2].setDaftarBuku(0,1,new String[]{"Yuval Noah Harari"},"Sapiens: A Brief History of Humankind","Evolusi Homo sapiens dari pemburu-gatherer hingga era modern.");
        daftarKategoriBuku[2].setDaftarBuku(1,1,new String[]{"Jared Diamond"},"Guns, Germs, and Steel","Geografi, biologi, dan teknologi membentuk peradaban dunia.");
        daftarKategoriBuku[2].setDaftarBuku(2,1,new String[]{"Peter Frankopan"},"The Silk Roads: A New History of the World","Jalur perdagangan kuno menghubungkan Timur dan Barat.");
        daftarKategoriBuku[2].setDaftarBuku(3,1,new String[]{"Howard Zinn"},"A People’s History of the United States","Sejarah Amerika dari sudut pandang rakyat biasa.");
        daftarKategoriBuku[2].setDaftarBuku(4,1,new String[]{"William L. Shirer"},"The Rise and Fall of the Third Reich","Dokumentasi detail tentang Nazi Jerman dan Perang Dunia II.");
        daftarKategoriBuku[2].tampikanBuku();

        daftarKategoriBuku[3].setDaftarBuku(0,1,new String[]{"Karen Armstrong"},"A History of God","Sejarah konsep Tuhan dalam tradisi Yahudi, Kristen, dan Islam.");    
        daftarKategoriBuku[3].setDaftarBuku(1,1,new String[]{"Al-Ghazali"},"Ihya Ulum al-Din","Karya klasik Islam tentang etika, ibadah, dan spiritualitas.");
        daftarKategoriBuku[3].setDaftarBuku(2,1,new String[]{"Thomas Aquinas"},"Summa Theologica","Filsafat dan teologi Kristen tentang iman, akal, dan moralitas.");
        daftarKategoriBuku[3].setDaftarBuku(3,1,new String[]{"Swami Prabhupada"},"Bhagavad Gita As It Is","Dialog spiritual Hindu tentang dharma, yoga, dan pengabdian.");
        daftarKategoriBuku[3].setDaftarBuku(4,1,new String[]{"Dalai Lama"},"The Art of Happiness","Ajaran Buddhis tentang kebahagiaan, welas asih, dan kedamaian batin.");
        daftarKategoriBuku[3].tampikanBuku();

        
        daftarKategoriBuku[4].setDaftarBuku(0,1,new String[]{"Sigmund Freud"}, "The Interpretation of Dreams","Dasar teori psikoanalisis melalui analisis mimpi.");
        daftarKategoriBuku[4].setDaftarBuku(1,1, new String[]{"Carl Gustav Jung"}, "Man and His Symbols","Simbol dan arketipe dalam psikologi analitik.");
        daftarKategoriBuku[4].setDaftarBuku(2,1,new String[]{"Daniel Kahneman"},"Thinking, Fast and Slow","Dua sistem berpikir: cepat intuitif dan lambat logis.");
        daftarKategoriBuku[4].setDaftarBuku(3,1,new String[]{"Viktor Frankl"},"Man’s Search for Meaning","Pengalaman di kamp konsentrasi dan logoterapi mencari makna hidup.");
        daftarKategoriBuku[4].setDaftarBuku(4,1,new String[]{"Abraham Maslow"},"Motivation and Personality","Teori kebutuhan manusia dan aktualisasi diri.");
        daftarKategoriBuku[4].setDaftarBuku(5,1,new String[]{"B.F. Skinner"},"Beyond Freedom and Dignity","Perilaku manusia dijelaskan melalui prinsip pengondisian operan.");
        daftarKategoriBuku[4].tampikanBuku();

        
        daftarKategoriBuku[5].setDaftarBuku(0,1,new String[]{"Niccolò Machiavelli"},"The Prince","Panduan kekuasaan dan strategi politik pragmatis.");
        daftarKategoriBuku[5].setDaftarBuku(1,1,new String[]{"Karl Marx", "Friedrich Engels"},"The Communist Manifesto","Manifesto ideologi komunis tentang kelas pekerja dan revolusi.");
        daftarKategoriBuku[5].setDaftarBuku(2,1,new String[]{"John Locke"},"Two Treatises of Government","Dasar pemikiran liberalisme, hak asasi, dan kontrak sosial.");
        daftarKategoriBuku[5].setDaftarBuku(3,1,new String[]{"Jean-Jacques Rousseau"},"The Social Contract","Konsep kedaulatan rakyat dan legitimasi pemerintahan.");
        daftarKategoriBuku[5].setDaftarBuku(4,1,new String[]{"Francis Fukuyama"},"The End of History and the Last Man","Argumen tentang liberal demokrasi sebagai bentuk akhir pemerintahan.");
        daftarKategoriBuku[5].setDaftarBuku(5,1,new String[]{"Samuel P. Huntington"},"The Clash of Civilizations","Prediksi konflik global berbasis budaya dan peradaban.");
        daftarKategoriBuku[5].tampikanBuku();

        daftarKategoriBuku[6].setDaftarBuku(0,1,new String[]{"J.K. Rowling"},"Harry Potter and the Philosopher’s Stone","Petualangan Harry Potter di Hogwarts melawan kekuatan gelap."); 
        daftarKategoriBuku[6].setDaftarBuku(1,1,new String[]{"J.R.R. Tolkien"},"The Lord of the Rings","Perjalanan epik menghancurkan cincin kekuasaan demi menyelamatkan dunia.");
        daftarKategoriBuku[6].setDaftarBuku(2,1,new String[]{"George Orwell"},"1984","Distopia tentang pengawasan total dan hilangnya kebebasan individu.");
        daftarKategoriBuku[6].setDaftarBuku(3,1,new String[]{"Harper Lee"},"To Kill a Mockingbird","Kisah tentang keadilan, rasisme, dan moralitas di Amerika Selatan.");
        daftarKategoriBuku[6].setDaftarBuku(4,1,new String[]{"Gabriel García Márquez"},"One Hundred Years of Solitude","Saga keluarga Buendía dengan sentuhan realisme magis di Macondo.");
        daftarKategoriBuku[6].tampikanBuku();


        //Cek kesamaan
        //Memandingkan 2 buku dalam satu kategori
        daftarKategoriBuku[0].cekKesamaan(1, 2);

        //User mengecek jumlah kata dalam sinopsis
        //Input dari user kategori dan judul
        //Input berupa string
        System.out.println("--Cek jumlah kata sinopsis--");
        System.out.println("Ketik exit dimanapun untuk keluar");

        do{
        System.out.print("Kategori >>");
        
        String inputKategori = (input.nextLine()).toLowerCase().trim();
        if(inputKategori.equalsIgnoreCase("exit")){
        System.out.println("Program dihentikan");
        System.out.println("Nama  : Daud Gavrila Pandiangan");
        System.out.println("NIM   : 255150700111003");
        System.out.println("Kelas : B");
        break;
        }

        else if(!inputKategori.equalsIgnoreCase("teknologi")&&!inputKategori.equalsIgnoreCase("filsafat")
            &&!inputKategori.equalsIgnoreCase("sejarah")&&!inputKategori.equalsIgnoreCase("agama")
            &&!inputKategori.equalsIgnoreCase("psikologi")&&!inputKategori.equalsIgnoreCase("politik")
            &&!inputKategori.equalsIgnoreCase("fiksi")){
                System.out.println("Kategori tidak ditemukan!!");
                continue;
        }
        
        System.out.print("Judul >>");
        String inputJudul = input.nextLine().trim();
        boolean judulAda = false;
        for(int i =0 ; i<7; i++){
            if(daftarKategoriBuku[i].cekJudul(inputJudul)){
                judulAda=true;
            }
        }
        if(!judulAda){
            System.out.println("Judul tidak ditemukan");
            continue;
        }
        
        System.out.println();

        
        if(inputJudul.equalsIgnoreCase("exit")){
            System.out.println("Program dihentikan");
            System.out.println("Nama  : Daud Gavrila Pandiangan");
            System.out.println("NIM   : 255150700111003");
            System.out.println("Kelas : B");
            break;
        }

        else{
        switch(inputKategori){
            case "teknologi" : daftarKategoriBuku[0].hitungSinopsis("teknologi", inputJudul);
            break;
            case "filsafat" : daftarKategoriBuku[1].hitungSinopsis("filsafat", inputJudul);
            break;
            case "sejarah" : daftarKategoriBuku[2].hitungSinopsis("sejarah", inputJudul);
            break;
            case "agama" : daftarKategoriBuku[3].hitungSinopsis("agama", inputJudul);
            break;
            case "psikologi" : daftarKategoriBuku[4].hitungSinopsis("psikologi", inputJudul);
            break;
            case "politik" : daftarKategoriBuku[5].hitungSinopsis("politik", inputJudul);
            break;
            case "fiksi" : daftarKategoriBuku[6].hitungSinopsis("fiksi", inputJudul);
            break;
        }
    }


    }while(true);
    

    //Mengduplikat semua atribut di buku politik
    KategoriBuku kategoriDuplikasi =daftarKategoriBuku[5].copy();
    //tampilkan hasil duplikasi(ketik exit terlebih dahulu agar program sebelumnya berhenti)
    kategoriDuplikasi.tampikanBuku();
    }
}    