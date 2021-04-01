package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class seni_musiktangkateng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_musiktangkateng);

        TextView dscmusiktangkateng = (TextView)findViewById(R.id.descmusiktangkateng);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Musik teng kateng adalah tradisi musik yang sangat mengental di daerah kabupaten bangkalan musik teng kateng adalah  warisan para leluhur yang saat ini masih di terapkan di daerah kabupaten bangkalan musik teng kateng ini menggunkan alat tradisional asli bangkalan yang di buat dari bambu di jadikan alat musik untuk hiburan rakyat dan musik ini di khususkan untuk hajatan dan ehiburan rakyat\n";
        stringBuilder.append(someMessage);

        dscmusiktangkateng.setText(stringBuilder.toString());
    }
}
