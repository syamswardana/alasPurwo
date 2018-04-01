package com.example.cubix.alaspurwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TanamanActivity extends AppCompatActivity {
    String Tanaman[];
    String namaTanaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman);

        TextView txt_namaTanaman = findViewById(R.id.txt_namaTumbuhan);
        ImageView img_tanaman = findViewById(R.id.img_tanaman);
        TextView txt_klasifikasi = findViewById(R.id.txt_klasifikasi);
        TextView txt_deskripsi = findViewById(R.id.txt_deskripsi);
        TextView txt_manfaat = findViewById(R.id.txt_manfaat);

        namaTanaman = getIntent().getStringExtra("namaTumbuhan");
        switch (namaTanaman) {
            case "Keben":
                Tanaman = getResources().getStringArray(R.array.keben);
                img_tanaman.setImageResource(R.drawable.keben);
                break;
            case "Ketapang":
                Tanaman = getResources().getStringArray(R.array.ketapang);
                img_tanaman.setImageResource(R.drawable.ketapang);
                break;
            case "Legaran Pantai":
                Tanaman = getResources().getStringArray(R.array.legaranPantai);
                img_tanaman.setImageResource(R.drawable.legaran_pantai);
                break;
            case "Nyamplung":
                Tanaman = getResources().getStringArray(R.array.nyamplung);
                img_tanaman.setImageResource(R.drawable.nyamplung);
                break;
            case "Sawo Kecik":
                Tanaman = getResources().getStringArray(R.array.sawoKecik);
                img_tanaman.setImageResource(R.drawable.sawo_kecik);
                break;
            case "Bambu Ampel":
                Tanaman = getResources().getStringArray(R.array.bambuAmpel);
                img_tanaman.setImageResource(R.drawable.bambu_ampel);
                break;
            case "Bambu Wuluh":
                Tanaman = getResources().getStringArray(R.array.bambuWuluh);
                img_tanaman.setImageResource(R.drawable.bambu_wuluh);
                break;
            case "Asam":
                Tanaman = getResources().getStringArray(R.array.asam);
                img_tanaman.setImageResource(R.drawable.asam);
                break;
            case "Bendo":
                Tanaman = getResources().getStringArray(R.array.bendo);
                img_tanaman.setImageResource(R.drawable.bendo);
                break;
            case "Beringin":
                Tanaman = getResources().getStringArray(R.array.beringin);
                img_tanaman.setImageResource(R.drawable.beringin);
                break;
            case "Kedawung":
                Tanaman = getResources().getStringArray(R.array.kedawung);
                img_tanaman.setImageResource(R.drawable.kedawung);
                break;
            case "Kedondong Hutan":
                Tanaman = getResources().getStringArray(R.array.kedondongHutan);
                img_tanaman.setImageResource(R.drawable.kedondong_hutan);
                break;
            case "Kemiri":
                Tanaman = getResources().getStringArray(R.array.kemiri);
                img_tanaman.setImageResource(R.drawable.kemiri);
                break;
            case "Kepuh":
                Tanaman = getResources().getStringArray(R.array.kepuh);
                img_tanaman.setImageResource(R.drawable.kepuh);
                break;
            case "Api Api Pantai":
                Tanaman = getResources().getStringArray(R.array.apiApiPantai);
                img_tanaman.setImageResource(R.drawable.api_api_pantai);
                break;
            case "Bako Bako":
                Tanaman = getResources().getStringArray(R.array.bakoBako);
                img_tanaman.setImageResource(R.drawable.bako_bako);
                break;
            case "Cordia Bantamensi":
                Tanaman = getResources().getStringArray(R.array.cordiaBantamensis);
                img_tanaman.setImageResource(R.drawable.cordia_bantamensis);
                break;
            case "Heritiera Littoralis":
                Tanaman = getResources().getStringArray(R.array.heritieraLittoralis);
                img_tanaman.setImageResource(R.drawable.heritiera_littoralis);
//                fail
                break;
            case "Mangrove Pedada":
                Tanaman = getResources().getStringArray(R.array.mangrovePedada);
                img_tanaman.setImageResource(R.drawable.mangrove_pedada);
                break;
            case "Rhizophora Mucronata":
                Tanaman = getResources().getStringArray(R.array.rhizophoraMucronata);
                img_tanaman.setImageResource(R.drawable.rhizophora_mucronata);
//                fail
                break;
            case "Soneratia Alba":
                Tanaman = getResources().getStringArray(R.array.soneratiaAlba);
                img_tanaman.setImageResource(R.drawable.soneratia_alba);
                break;
            case "Tanjang":
                Tanaman = getResources().getStringArray(R.array.tanjang);
                img_tanaman.setImageResource(R.drawable.tanjang);
                break;
            case "Xylocarpus Granatum":
                Tanaman = getResources().getStringArray(R.array.xylocarpusGranatum);
                img_tanaman.setImageResource(R.drawable.xylocarpus_granatum);
                break;
            case "Adem Ati":
                Tanaman = getResources().getStringArray(R.array.ademAti);
                img_tanaman.setImageResource(R.drawable.adem_ati);
                break;
            case "Akasia":
                Tanaman = getResources().getStringArray(R.array.akasia);
                img_tanaman.setImageResource(R.drawable.akasia);
                break;
            case "Jati":
                Tanaman = getResources().getStringArray(R.array.jati);
                img_tanaman.setImageResource(R.drawable.jati);
                break;
            case "Alang-Alang":
                Tanaman = getResources().getStringArray(R.array.alangAlang);
                img_tanaman.setImageResource(R.drawable.alang_alang);
                break;
        }

        txt_namaTanaman.setText(Tanaman[0]);
        for (int i=1;i<10;i++){
            txt_klasifikasi.append("\n"+Tanaman[i]);
        }
        txt_deskripsi.append("\n"+Tanaman[10]);
        txt_manfaat.append("\n"+Tanaman[11]);

    }
}
