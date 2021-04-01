package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class seni_jarankencak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_jarankencak);

        TextView dscjarankencak = (TextView)findViewById(R.id.descjarankencak);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Upacara adat Jaran Kenca` di Kecamatan Socah, yakni upacara penyambutan tamu pada acara resepsi sunatan (khitanan) dan temantenan.\n";
        stringBuilder.append(someMessage);

        dscjarankencak.setText(stringBuilder.toString());

    }
}
