package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class seni_ginggung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_ginggung);

        TextView dscginggung = (TextView)findViewById(R.id.descginggung);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Mohon Maaf Masi Belum Ada Deskripsi\n";
        stringBuilder.append(someMessage);

        dscginggung.setText(stringBuilder.toString());
    }
}
