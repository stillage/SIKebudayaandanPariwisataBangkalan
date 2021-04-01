package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class adat_bacangan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat_bacangan);

        TextView dscbacangan = (TextView)findViewById(R.id.descbacangan);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Maaf Belum Ada Deskripsi.\n";
        stringBuilder.append(someMessage);

        dscbacangan.setText(stringBuilder.toString());
    }
}
