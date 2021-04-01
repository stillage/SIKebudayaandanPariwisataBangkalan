package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class seni_slabadan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_slabadan);

        TextView dscslabadan = (TextView)findViewById(R.id.descslabadan);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Salabhadan adalah tradisi kabupaten bangkalan di mana tradisi ini mengangkat tentang warga bangkalan yang sedang mengadakan arisan. arisan ini beda dengan arisan di daerah lain arisan di daerah bangkalan sangat unik yaitu arisannya mengadakan hiburan rakyat. Acara salabhaden ini di adakan di daerah tempat rumah yang mengadakan arisan dan acara ini terus bergantian ke rumah lainnya untuk melanjutkan arisan dan uniknya iniknya ini wajib untuk orang yang berarisan.\n";
        stringBuilder.append(someMessage);

        dscslabadan.setText(stringBuilder.toString());
    }
}
