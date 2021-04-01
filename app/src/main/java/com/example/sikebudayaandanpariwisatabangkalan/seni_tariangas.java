package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class seni_tariangas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_tariangas);

        TextView dscangas = (TextView)findViewById(R.id.desctariangas);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = " Tari Angas Merupakan tarian penyambutan tamu di Kabupaten Bangkalan Madura. Tari Angas ini memiliki penari berjumlah minimal 5 orang yang terdiri dari laki-laki dan perempuan. Tari penyambutan ini di mainkan untuk menyambut tamu-tamu kehormatan atau tamu-tamu kerajaan pada jaman kerajaan. Saat ini tarian ini dimainkan untuk menyambut tamu-tamu kehormatan yang datang ke Kabupaten Bangkalan\n";
        stringBuilder.append(someMessage);

        dscangas.setText(stringBuilder.toString());
    }
}
