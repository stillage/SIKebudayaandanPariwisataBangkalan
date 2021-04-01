package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class seni_gemantaka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_gemantaka);

        TextView dscgemantaka = (TextView)findViewById(R.id.descgemantaka);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Mohon Maaf Masi Belum Ada Deskripsi\n";
        stringBuilder.append(someMessage);

        dscgemantaka.setText(stringBuilder.toString());
    }
}
