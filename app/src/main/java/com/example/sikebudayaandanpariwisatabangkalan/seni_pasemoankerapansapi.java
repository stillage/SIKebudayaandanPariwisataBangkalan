package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class seni_pasemoankerapansapi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_pasemoankerapansapi);

        TextView dscpasemoan = (TextView)findViewById(R.id.descpasemoankerapansapi);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Kasamoan kerapan sapi adalah sebuah tariann tradisional bangkalan yang saat ini masih kental di gunakan di daerah daerah kabupaten bangkalan kenapa dinamakan kasamoan kerapan sapi di karenakan tarian ini bertujuan menghibur rakyat atau penonton kerapan sapi tari kasamoan kerapan sapi ini banyak bertranformasi. Tarian kasamoan kerapan sapi ini cukup baru di kalangan tradisi kabupaten bangkalan sekitar taun 1990. \n" +
                "\tSebelum adanya tarian kasamoan kerapan sapi , bangkalan juga memmpunyai tari pecut yang mirip dengan tari kasamoan kerapan sapi yang tujuannya juga sama menghibur rakyat dan penonton kerapan sapi akan tetapi tarian pecut semakin lama semakin hilang di karenakan berkembangnya usia dan munculla tarian kasamoan kerapan sapi dengan iring iringan musik seperti saronin.\n" +
                "\n\n";
        stringBuilder.append(someMessage);

        dscpasemoan.setText(stringBuilder.toString());
    }
}
