package com.ti4e.wiranafi.nabidanrasul;

public class Nabi {
    private String nama_nabi,deskripsi;
    public static final Nabi[]kisahnabi={
            new Nabi("Nabi Adam","Nabi pertama " +
                    "\n Allah Subhanahu wa Ta’ala memberitahukan kepada para malaikat tentang penciptaan Adam ‘alaihis salam, Dia berfirman:\n" +
                    "\n" +
                    "“Sesungguhnya aku hendak menjadikan seorang khalifah di muka bumi.” (QS. Al Baqarah: 30)\n" +
                    "\n" +
                    "Yakni makhluk yang satu dengan yang lain saling menggantikan. Demikianlah Allah Subhanahu wa Ta’ala memberitahukan kepada para malaikat tentang penciptaan Adam sebagaimana Dia memberitahukan perkara besar sebelum terwujud.\n" +
                    "\n" +
                    "\n" +
                    "\n" ),
            new Nabi("Nabi Idris","Nabi kedua " +
                    "\n Nabi Idris adalah keturunan keenam dari Nabi Adam as. Dia adalah putra dari Qabil dan Iqlima (putra dan putri Nabi Adam as).\n" +
                    "\n" +
                    "Saat itu, Allah memerintahkan Nabi Idris untuk mengajak seluruh manusia agar berjalan pada kebenaran. Saat itu dia adalah manusia pertama yang menerima wahyu lewat Malaikat Jibril ketika dirinya berusia 82 tahun.\n" +
                    "\n" +
                    "Sebagai seorang nabi, dia memiliki mukjizat atau kelebihan, yaitu:\n" +
                    "\n" +
                    "1. Manusia pertama yang pandai baca tulis dengan pena.\n" +
                    "\n" +
                    "2. Nabi Idris diberi macam-macam pengetahuan mulai dari merawat kuda, ilmu perbintangan (falaq), hingga ilmu berhitung yang sekarang dikenal dengan matematika.\n" +
                    "\n" +
                    "3. Nama Idris berasal dari kata Darasa yang artinya belajar. Nabi Idris pun kenal sangat senang belajar, dan tekun mengkaji fenomena alam semesta.\n" +
                    "\n" +
                    "4. Nabi Idris adalah orang pertama yang pandai memotong dan menjahit pakaiannya. Orang-orang sebelumnya konon hanya mengenakan kulit binatang sebagai penutup aurat."),
            new Nabi("Nabi Nuh",""),
            new Nabi("Nabi Hud",""),
            new Nabi("Nabi Shaleh",""),
            new Nabi("Nabi Ibrahim",""),
            new Nabi("Nabi Luth",""),
            new Nabi("Nabi Ismail",""),
            new Nabi("Nabi Ishaq",""),
            new Nabi("Nabi Yakub",""),
            new Nabi("Nabi Yusuf",""),
            new Nabi("Nabi Syu'aib",""),
            new Nabi("Nabi Ayub",""),
            new Nabi("Nabi Zulkifli",""),
            new Nabi("Nabi Musa",""),
            new Nabi("Nabi Harun",""),
            new Nabi("Nabi Daud",""),
            new Nabi("Nabi Sulaiman",""),
            new Nabi("Nabi Ilyas",""),
            new Nabi("Nabi Ilyasa",""),
            new Nabi("Nabi Yunus",""),
            new Nabi("Nabi Zakaria",""),
            new Nabi("Nabi Yahya",""),
            new Nabi("Nabi Isa",""),
            new Nabi("Nabi Muhammad ","Nabi terakhir dan rasul terakhir"),


    };

    private Nabi(String name, String description) {
        this.nama_nabi = name;
        this.deskripsi = description;
    }

    public String getNama_nabi() {
        return nama_nabi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
    public String toString(){
        return this.nama_nabi;
    }
}
