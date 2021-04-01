package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class seni_topengtambakpocog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_topengtambakpocog);

        TextView dsctambakpocog = (TextView)findViewById(R.id.desctopengtambakpocog );

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Topeng tambak pocog adalah tradisi kental khas dari kabupaten bangkalan yang menjadi kultur budaya bangkalan topeng tambak pocog ini di adakan di saat ada acara acara resmi karena tujuan topeng tambak pocog ini yaitu membuang balah . menurut orang madurah balah adalah sebuah malah petakah atau juga bisa di bilang kesialan jadi topeng tambak pocog ini bertujuan untuk mebuang kesialan yang ada di acara tersebut.\n";
        stringBuilder.append(someMessage);

        dsctambakpocog.setText(stringBuilder.toString());
    }
}
