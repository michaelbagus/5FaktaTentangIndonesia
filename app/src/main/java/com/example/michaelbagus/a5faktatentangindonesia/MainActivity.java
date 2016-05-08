package com.example.michaelbagus.a5faktatentangindonesia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private TextView text_judul;
    private TextView text_isi;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] string = new String[]{
                "5 Fakta Tentang Indonesia yang Mendunia:Berikut ini 5 fakta tentang Indonesia yang Mendunia ",
                "1. Negara Kepulauan Terbesar:Indonesia merupakan Negara kepulauan terbesar di dunia. Menurut Departemen Dalam Negeri Republik Indonesia pada tahun 2004 terdapat 17.504 pulau. 7870 diantaranya telah memiliki nama, sedangkan 9.634 belum bernama",
                "2. Penopang Bumi dan Dunia:Dunia telah mengakui bahwa Indonesia memiliki kekayaan alam yang sangat banyak dan beragam. Di daratan salah satunya, Indonesia memiliki hutan tropis terbesar di dunia. Sekitar 39.549.447 hektar di pulau Sumatra, Kalimantan, Dan Sulawesi terdapat keanekaragaman hayati dan platsa nutfa terlengkap di dunia.",
                "3. Kekayaan Laut Terindah di Dunia:Di dunia terdapat 6 negara yang memiliki gugusan terumbu karang terbanyak dan terindah yang disebut sebagai segitiga coral, salah satunya adalah Indonesia yang memiliki 65% dari segitiga coral tersebut",
                "4. Surganya Kopi Dunia:Kopi merupakan minuman yang banyak disukai seluruh dunia. Dan kopi yang diakui dunia sebagai kopi termahal dan terbaik karena rasanya yang enak adalah kopi luwak. Brazil boleh menjadi penghasil kopi terbesar sementara Indonesia berada di posisi 3. Tetapi kopi luwak, kopi yang dihasilkan dari kotoran musang ini asli berasal dari Indonesia.",
                "5. Penemuan Peninggalan Purba Kala:peninggalan purba kala yang ternyata ada di Indonesia. didunia fauna ada komodo yang merupakan kadal terbesar di dunia dan peninggalan hewan purba. Dan komodo hanya ada di Indonesia tepatnya di Nusa Tenggara Timur (NTT)."
        };

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, string );
        text_judul = (TextView) findViewById(R.id.text_judul);
        text_isi = (TextView) findViewById(R.id.text_isi);

        Button next = (Button) findViewById(R.id.next);
        Button prev = (Button) findViewById(R.id.prev);
        final ImageView imageView = (ImageView) findViewById(R.id.gbr);

//        final int[] gambar = new int[]{
//                R.drawable.gbr0, R.drawable.gbr1, R.drawable.gbr2,
//                R.drawable.gbr3, R.drawable.gbr4, R.drawable.gbr5
//        };



        //assert next != null;
        assert next != null;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i == string.length - 1){
                    Toast.makeText(MainActivity.this, "Ini Halaman Terakhir", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(i == 0){
                    setTitle("5 Fakta Indonesia yang Mendunia");
                    assert imageView != null;
                    imageView.setImageResource(R.drawable.gbr0);
                }
                else if(i == 1){
                    setTitle("Kepulauan Terbesar");
                    assert imageView != null;
                    imageView.setImageResource(R.drawable.gbr1);
                    i = i+1;
                }
                else if(i == 2){
                    setTitle("Paru-paru Dunia");
                    assert imageView != null;
                    imageView.setImageResource(R.drawable.gbr2);
                }
                else if(i == 3){
                    setTitle("Kekayaan Laut");
                    assert imageView != null;
                    imageView.setImageResource(R.drawable.gbr3);
                }
                else if(i == 4){
                    setTitle("Surga Kopi");
                    assert imageView != null;
                    imageView.setImageResource(R.drawable.gbr4);
                }
                else if(i == 5){
                    setTitle("Komodo");
                    assert imageView != null;
                    imageView.setImageResource(R.drawable.gbr5);
                }
                i = i+1;
                text_judul.setText(string[i].split(":")[0]);
                text_isi.setText(string[i].split(":")[1]);
            }
        });

        assert prev != null;
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i == 1){
                    Toast.makeText(MainActivity.this, "Ini Halaman Pertama", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(i == 0){
                    setTitle("5 Fakta Indonesia yang Mendunia");
                    assert imageView != null;
                    imageView.setImageResource(R.drawable.gbr0);
                }
                else {
                    if (i == 1) {
                        setTitle("Kepulauan Terbesar");
                        imageView.setImageResource(R.drawable.gbr1);
                    } else if (i == 2) {
                        setTitle("Paru-paru Dunia");
                        assert imageView != null;
                        imageView.setImageResource(R.drawable.gbr2);
                    } else if (i == 3) {
                        setTitle("Kekayaan Laut");
                        assert imageView != null;
                        imageView.setImageResource(R.drawable.gbr3);
                    } else if (i == 4) {
                        setTitle("Surga Kopi");
                        assert imageView != null;
                        imageView.setImageResource(R.drawable.gbr4);
                    } else if (i == 5) {
                        setTitle("Peninggalan Purba");
                        assert imageView != null;
                        imageView.setImageResource(R.drawable.gbr5);
                    }
                }
                i = i-1;
                text_judul.setText(string[i].split(":")[0]);
                text_isi.setText(string[i].split(":")[1]);
            }
        });
    }
}
