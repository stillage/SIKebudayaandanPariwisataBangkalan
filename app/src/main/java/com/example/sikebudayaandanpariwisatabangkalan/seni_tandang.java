package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class seni_tandang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_tandang);

        TextView dsctandang = (TextView)findViewById(R.id.desctandang);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Tarian tandhang adalah tarian khas kabupaten bangkalan yang bertujuan untuk hiburan rakyat tarian ini memeberikan tarian tarian yang menggambarkan tentang kehidupan rakyat di bangkalan yang itu seperti ramah,sopan dan menghargai sesama warga sekitar tarian ini biasanya di adakan di daerah perdesahan kabupaten bangkalan sampai saat ini tarian tandhang masi di populerkan\n";
        stringBuilder.append(someMessage);

        dsctandang.setText(stringBuilder.toString());


    }
}
