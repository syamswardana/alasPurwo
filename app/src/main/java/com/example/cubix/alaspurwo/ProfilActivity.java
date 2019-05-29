package com.example.cubix.alaspurwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.TextView;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView txt_fauna = findViewById(R.id.txt_fauna);
        TextView txt_statuskawasan = findViewById(R.id.txt_statuskawasan);
        TextView txt_kondisifisik = findViewById(R.id.txt_kondisifisik);
        TextView txt_flora = findViewById(R.id.txt_flora);

        txt_statuskawasan.setText(Html.fromHtml("Kawasan Alas Purwo, sebelum ditetapkan sebagai taman nasional, semula berstatus Suaka Margasatwa Banyuwangi Selatan berdasarkan Surat Keputusan Gubernur Jenderal Hindia Belanda Nomor 6 stbl 456 tanggal 01 September 1939 dengan luas areal 62.000 ha, kemudian diubah menjadi Taman Nasional Alas Purwo dengan luas 43.420 ha melalui Surat Keputusan Menteri Kehutanan pada tahun 1992. Tahun 2008, berdasarkan Peraturan Pemerintah Nomor 26 Tahun 2008 tentang Rencana Tata Ruang Wilayah Nasional, Taman Nasional Alas Purwo ditetapkan sebagai Kawasan Strategis Nasional (KSN) dengan fungsi kawasan lindung nasional. Berdasarkan Rencana Induk Pembangunan Kepariwisataan Kabupaten Banyuwangi Tahun 2012, Taman Nasional Alas Purwo (Objek dan Daya Tarik Wisata Alam Plengkung) ditetapkan sebagai salah satu bagian dari tiga objek wisata utama “<i>Triangle Diamond</i>” yaitu Kawah Ijen, Plengkung, dan Sukamade.<br><br>"+
                "Taman Nasional Alas Purwo, sebagaimana diamanatkan dalam Undang-Undang Nomor 5 tahun 1990 tentang Konservasi Sumberdaya Alam Hayati dan Ekosistemnya mempunyai tiga fungsi pokok, yaitu<br>" +
                "1. Perlindungan proses ekologis sistem penyangga kehidupan.<br>" +
                "2. Pengawetan keanekaragaman tumbuhan dan satwa beserta ekosistemnya.<br>" +
                "3. Pemanfaatan secara lestari sumberdaya alam hayati dan ekosistemnya dalam bentuk penelitian, ilmu pengetahuan, pendidikan, penunjang budidaya, dan pariwisata alam.<br>"));

        txt_kondisifisik.setText(Html.fromHtml("    1. Luas dan Letak<br>" +
                "Kawasan TNAP memiliki luasan sebesar 43.420 Ha. Secara geografis kawasan ini terletak di ujung Timur pulau Jawa antara 80 26’ 45” – 80 47’ 00” LS dan 1140 20’ 16” – 1140 36’ 00” BT dan secara administratif berada di 2 kecamatan yaitu Kecamatan Tegaldlimo dan Kecamatan Purwoharjo, Kabupaten Banyuwangi, Provinsi Jawa Timur. Adapun batas-batas wilayah Taman Nasional Alas Purwo meliputi :<br>" +
                "    • Sebelah Utara, berbatasan dengan Teluk Pangpang, Selat Bali, Desa Kedungringin dan Desa Wringinputih Kecamatan Muncar serta Desa Kedungsari Kecamatan Tegaldlimo.<br>" +
                "    • Sebelah Timur, berbatasan dengan Selat Bali dan Samudra Indonesia.<br>" +
                "    • Sebelah Selatan, berbatasan dengan Samudra Indonesia.<br>" +
                "    • Sebelah Barat, berbatasan dengan Teluk Grajagan, kawasan hutan produksi Perum Perhutani Kesatuan Pemangkuan Hutan Banyuwangi Selatan, Desa Grajagan dan Desa Sumberasri (Kecamatan Purwoharjo), serta Desa Purwoagung dan Desa Kendalrejo (Kecamatan Tegaldlimo).<br><br>" +
                "    2. Tanah<br>" +
                "Jenis tanah di kawasan TNAP terdiri atas 4 kelompok, yaitu tanah komplek mediteran merah-litosol seluas 2.106 Ha, tanah regosol kelabu seluas 6.238 Ha, tanah grumosol kelabu seluas 379 Ha, dan tanah aluvial hidromof seluas 34.697 Ha.<br>" +
                "Tanah di kawasan TNAP didominasi jenis tanah aluvial hidromof. Jenis tanah ini mempunyai ciri-ciri fisik berwarna kelabu, bertekstur liat, dan mudah tergenangi air dikarenakan memilik permeabilitas yang lambat.<br><br>" +
                "    3. Geologi<br>" +
                "Secara fisiografis kawasan TNAP terdiri atas 4 unit bentuk lahan, yaitu : bentuk lahan fluvial, organik, marin, dan karst. Bentuk lahan fluvial menempati daerah bagian barat, memanjang dari Teluk Pangpang sampai ke Pantai Triangulasi dengan luas 2.097,7 Ha. Bentuk lahan organik menempati bagian tepi kawasan, terbagi menjadi dua, yaitu daerah mangrove dan terumbu karang dengan luas yang belum dipastikan, karena bersifat sangat dinamik, utamanya dipengaruhi oleh pasang surut air laut. Bentuk lahan marin juga menempati bagian tepi kawasan, berasosiasi dengan bentuk lahan organik. Bentuk lahan karst menempati sebagian besar kawasan, mulai dari Gunung Sembulungan, Tanjung Purwo, Tanjung Bantenan, dan Teluk Banyubiru.<br><br>" +
                "    4. Iklim<br>" +
                "Menurut sistem klasifikasi Schmidth dan Ferguson, kawasan TNAP termasuk ke dalam tipe iklim D (agak lembab) sampai E (agak kering). Secara umum, bulan basah terjadi pada bulan November sampai April dan bulan kering terjadi pada bulan Mei sampai Oktober dengan curah hujan tidak merata sepanjang tahun. Suhu udara rata-rata berkisar antara 25,90C – 28,20C. Kelembaban udara mempunyai fluktuasi tergolong kecil, yaitu berkisar antara 75% - 81%. Arah angin terbanyak adalah arah selatan dengan kecepatan antara 2,3 – 4,2 knot.<br><br>" +
                "    5. Topografi<br>" +
                "Kawasan TNAP terdiri dari daerah pantai, daratan hingga daerah perbukitan dan pegunungan, berketinggian 0 – 322 mdpl dengan puncak tertinggi Gunung Lingga Manis. Daerah pantai melingkar mulai dari Segoro Anak sampai Muncar. Kelerengan kawasan dibedakan menjadi daerah datar (0-8%) seluas 10.554 Ha, landai (8-15%) seluas 19.474 Ha, agak curam (15-25%) seluas 11.091 Ha, dan curam (25-40%) seluas 2.301 Ha.<br><br>" +
                "    6. Hidrologi<br>" +
                "Sebagian kawasan TNAP yang didominasi bentuk lahan karst yang menyimpan potensi air yang cukup besar, hanya saja potensi tersebut merupakan potensi air tanah yang berada pada lapisan dalam, sedangkan air yang muncul ke permukaan terbatas pada lokasi-lokasi tertentu yang muncul sebagai mata air.<br>"));

        txt_flora.setText(Html.fromHtml("Taman Nasional Alas Purwo merupakan kawasan hutan yang mempunyai berbagai macam tipe ekosistem yang tergolong utuh di Pulau Jawa. Ekosistem yang dimiliki mulai dari pantai (hutan pantai) sampai hutan hujan  dataran rendah, hutan mangrove, hutan bambu, savana dan hutan tanaman. Keanekaragaman jenis flora darat di kawasan TNAP  termasuk tinggi, yaitu lebih dari 700 jenis tumbuhan mulai dari tumbuhan tingkat bawah sampai tumbuhan tingkat tinggi dari berbagai tipe vegetasi. Jenis-jenis tumbuhan yang telah teridentifikasi tersebut terbagi dalam 138 famili, yaitu famili Poaceae, Euphorbiaceae, Fabaceae, dan Araceae yang merupakan famili yang memiliki jumlah jenis terbanyak di dalam kawasan.<br>"));

        txt_fauna.setText(Html.fromHtml("Di kawasan TNAP terdapat 50 jenis mamalia dari 26 famili yang teridentifikasi sampai dengan saat ini, 16 jenis termasuk ke dalam kategori fauna yang dilindungi, yaitu Banteng (<i>Bos javanicus</i>), Rusa (<i>Cervus timorensis</i>), Kijang (<i>Muntiacus muntjak</i>), Macan Tutul (<i>Panthera pardus</i>), Ajag (<i>Cuon alpinus</i>), dan Kucing Hutan (<i>Prionailurus bengalensis</i>).<br>" +
                "Aves di kawasan TNAP sampai saat ini telah teridentifikasi kurang lebih 302 jenis dari 65 famili. 83 jenis termasuk ke dalam kategori fauna yang dilindungi, di antaranya Elang Bondol (<i>Haliastur indus</i>), Elang Brontok (<i>Spizaetus cirrhatus</i>), Kangkareng Perut Putih (<i>Anthracoceros albirostris</i>), Merak Hijau (<i>Pavo muticus</i>), dan Elang Jawa (<i>Nisateus bartelsi</i>).<br>" +
                "Sampai saat ini tercatat 64 jenis hepterofauna yang terdiri dari 15 jenis amfibi dan 49 jenis reptil. Di antara jenis hepterofauna yang ada di kawasan, terdapat 6 jenis reptil yang dilindungi yaitu Penyu Lekang/ Abu-Abu (<i>Lepidochelys olivacea</i>), Penyu Hijau (<i>Chelonia mydas</i>), Penyu Sisik (<i>Eretmochelys imbricata</i>), Penyu Belimbing (<i>Dermochelys coriacea</i>), Biawak Abu-Abu (<i>Varanus nebulosus</i>), dan Sanca Bodo (<i>Phyton molurus</i>).<br>" +
                "Jenis ikan yang telah berhasil diidentifikasi di TNAP berjumlah lebih dari 20 jenis, diantaranya: Sepat (<i>Trichogaster sp.</i>), Lele (<i>Clarias sp.</i>), Glodok (<i>Periopthalamus sp.</i>), dan Bedul (<i>Acentrogobius caninus</i>). Jenis-jenis ikan tersebut dijumpai di Segoro Anak dan sungai yang mengalir di dalam kawasan TNAP. Bedul merupakan jenis ikan yang cukup banyak dijumpai di sekitar Segoro Anak hingga sebagian kawasan tersebut dikenal dengan Blok Bedul, selain jenis Bedul, Glodok juga merupakan jenis yang khas dan mudah dijumpai ‘berjalan’ di sekitar dermaga Blok Bedul terutama pada saat surut.<br><br>"));


    }
}
