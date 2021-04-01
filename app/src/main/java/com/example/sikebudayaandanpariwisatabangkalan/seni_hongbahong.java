package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class seni_hongbahong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_hongbahong);

        TextView dschongbahong = (TextView)findViewById(R.id.deschongbahong);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Upacra adat Hong Bahhong di Kecamatan Geger, yaitu upacara ritual untuk menolak bala / bencana / penyakit dan pengaruh buruk lainnya.\n";
        stringBuilder.append(someMessage);

        dschongbahong.setText(stringBuilder.toString());
    }
}



