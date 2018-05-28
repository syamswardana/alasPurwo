package com.example.cubix.alaspurwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
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

        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        namaTanaman = getIntent().getStringExtra("namaTumbuhan");
        switch (namaTanaman) {
            //hutan pantai
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

            //hutan bambu
            case "Bambu Ampel":
                Tanaman = getResources().getStringArray(R.array.bambuAmpel);
                img_tanaman.setImageResource(R.drawable.bambu_ampel);
                break;
            case "Bambu Apus":
                Tanaman = getResources().getStringArray(R.array.bambuApus);
                img_tanaman.setImageResource(R.drawable.bambu_apus);
                break;
            case "Bambu Petung":
                Tanaman = getResources().getStringArray(R.array.bambuPetung);
                img_tanaman.setImageResource(R.drawable.bambu_petung);
                break;
            case "Bambu Wulung":
                Tanaman = getResources().getStringArray(R.array.bambuWulung);
                img_tanaman.setImageResource(R.drawable.bambu_wulung);
                break;

            //hutan Daratan Rendah
            case "Andong":
                Tanaman = getResources().getStringArray(R.array.andong);
                img_tanaman.setImageResource(R.drawable.andong);
                break;
            case "Anting-Anting":
                Tanaman = getResources().getStringArray(R.array.antingAnting);
                img_tanaman.setImageResource(R.drawable.anting_anting);
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

            //hutan mangrove
            case "Api Api Pantai":
                Tanaman = getResources().getStringArray(R.array.apiApiPantai);
                img_tanaman.setImageResource(R.drawable.api_api_pantai);
                break;
            case "Bakau":
                Tanaman = getResources().getStringArray(R.array.bakau);
                img_tanaman.setImageResource(R.drawable.bakau);
                break;
            case "Bako Bako":
                Tanaman = getResources().getStringArray(R.array.bakoBako);
                img_tanaman.setImageResource(R.drawable.bako_bako);
                break;
            case "Dungun":
                Tanaman = getResources().getStringArray(R.array.dungun);
                img_tanaman.setImageResource(R.drawable.dungun);
                break;
            case "Mangrove Pedada":
                Tanaman = getResources().getStringArray(R.array.mangrovePedada);
                img_tanaman.setImageResource(R.drawable.mangrove_pedada);
                break;
            case "Nyiri Agang":
                Tanaman = getResources().getStringArray(R.array.nyiriAgang);
                img_tanaman.setImageResource(R.drawable.nyiri_agang);
                break;
            case "Pohon Kendal":
                Tanaman = getResources().getStringArray(R.array.pohonKendal);
                img_tanaman.setImageResource(R.drawable.pohon_kendal);
                break;
            case "Apel Mangrove":
                Tanaman = getResources().getStringArray(R.array.mangroveApel);
                img_tanaman.setImageResource(R.drawable.apel_mangrove);
                break;
            case "Tanjang":
                Tanaman = getResources().getStringArray(R.array.tanjang);
                img_tanaman.setImageResource(R.drawable.tanjang);
                break;

            //hutan Tanaman
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
            //Savana
            case "Alang-Alang":
                Tanaman = getResources().getStringArray(R.array.alangAlang);
                img_tanaman.setImageResource(R.drawable.alang_alang);
                break;
        }

        txt_namaTanaman.setText(Html.fromHtml(Tanaman[0]+" <i>"+Tanaman[1]+"</i>"));
        for (int i=2;i<11;i++){
            txt_klasifikasi.append(Html.fromHtml("<br/>"+Tanaman[i]));
        }
        txt_deskripsi.append(Html.fromHtml("<br/>"+Tanaman[11]));
        txt_manfaat.append("\n"+Tanaman[12]);

    }
}
