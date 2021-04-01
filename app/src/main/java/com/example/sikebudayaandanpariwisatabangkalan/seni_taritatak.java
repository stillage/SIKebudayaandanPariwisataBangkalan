package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class seni_taritatak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_taritatak);

        TextView dsctaritatak = (TextView)findViewById(R.id.desctaritatak);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Tari tatak adalah tarian yang di ambil dari sebuah cerita rakyat yang sangat mencintai seorang suami dan tarian ini sangat unik dari kabupaten bangkalan, kenapa unik?? Di karenakan tarian ini menggambarkan seorang wanita yang gaga dan berani untuk melindungi sang suami, tarian ini masi sering tampil atau sering di gunakan warga bangkalan saat ada hajatan atau nikahan \n";
        stringBuilder.append(someMessage);

        dsctaritatak.setText(stringBuilder.toString());
    }
}
