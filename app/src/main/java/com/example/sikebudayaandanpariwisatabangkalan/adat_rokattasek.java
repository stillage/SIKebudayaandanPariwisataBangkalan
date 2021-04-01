package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class adat_rokattasek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adat_rokattasek);

        TextView dscrokattasek = (TextView)findViewById(R.id.descrokattasek);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Upacara Adat Rokat Tase` di Kecamatan Sepulu dan Kecamatan Arosbaya, yaitu upacara ritual untuk memohon keselamatan dan berkah laut dari Tuhan YME.\n";
        stringBuilder.append(someMessage);

        dscrokattasek.setText(stringBuilder.toString());
    }
}



