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
        txt_fauna.setText(Html.fromHtml("Di Taman Nasional Alas Purwo terdapat 50 jenis mamalia dari 26 famili yang teridentifikasi sampai dengan saat ini. Dari 50 jenis tersebut, 16 jenis merupakan jenis yang dilindungi diantaranya yaitu Banteng (<i>Bos javanicus</i>), Rusa (<i>Cervus timorensis</i>), Kijang (<i>Muntiacus muntjak</i>), Macan Tutul (<i>Panthera pardus</i>), Ajag (<i>Cuon alpinus</i>), Kucing Hutan (<i>Prionailurus bengalensis</i>).<br><br><br>" +
                "Aves di Taman Nasional Alas Purwo sampai saat ini telah teridentifikasi kurang lebih 302 jenis dari 65 famili. Dari 302 jenis tersebut, 83 jenis merupakan jenis yang dilindungi, di antaranya yaitu Elang Bondol (<i>Haliastur indus</i>), Elang Brontok (<i>Spizaetus cirrhatus</i>), Kangkareng Perut Putih (<i>Anthracoceros albirostris</i>), Merak Hijau (<i>Pavo muticus</i>), dan Elang Jawa (<i>Nisateus bartelsi)</i>.<br><br><br>" +
                "Sampai saat ini tercatat 64 jenis hepterofauna yang terdiri dari 15 jenis amfibi dan 49 jenis reptil. Di antara jenis hepterofauna yang ada di kawasan, terdapat 6 jenis reptil yang dilindungi yaitu Penyu Lekang/ Abu-Abu (<i>Lepidochelys olivacea</i>), Penyu Hijau (<i>Chelonia mydas</i>), Penyu Sisik (<i>Eretmochelys imbricata</i>), Penyu Belimbing (<i>Dermochelys coriacea</i>), Biawak Abu-Abu (<i>Varanus nebulosus</i>), dan Sanca Bodo (<i>Phyton molurus</i>).<br><br><br>" +
                "Jenis ikan yang telah berhasil diidentifikasi di Taman Nasional Alas Purwo berjumlah lebih dari 20 jenis, diantaranya: Sepat (<i>Trichogaster sp.</i>), Lele (<i>Clarias sp.</i>), Blodok (<i>Periopthalamus sp.</i>), dan Bedul (<i>Acentrogobius caninus</i>). Jenis-jenis ikan tersebut dijumpai di Segoro Anak dan sungai yang mengalir di dalam kawasan Taman Nasional Alas Purwo. diantara jenis-jenis ikan tersebut, Bedul merupakan jenis yang cukup banyak dijumpai di sekitar Segoro Anak hingga sebagian kawasan tersebut dikenal dengan Blok Bedul. Selain jenis Bedu;, Blodok juga merupakan jenis yang khas dan mudah dijumpai ‘berjalan’ di sekitar dermaga Blok Bedul terutama pada saat surut.<br><br>"));


    }
}
