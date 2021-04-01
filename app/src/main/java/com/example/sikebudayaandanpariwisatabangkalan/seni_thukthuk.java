package com.example.sikebudayaandanpariwisatabangkalan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class seni_thukthuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni_thukthuk);

        TextView dscthuk = (TextView)findViewById(R.id.descthukthuk);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Thuk thuk adalah tradisi dari daerah kabupaten bangkalan hasil warisan nenek moyang yang masi tada di daerah kabupaten bangalan warisan ini berbentuk bhutabuen (musik) tradisional yang di adakan saat ada acara lombah kerapan sapi di daerah bangkalan yaitu bertujuan menghibur rakyat yang sedang menonton lombah kerapan sapi dan ada juga sebagian orang ada yang mengatakan untuk memerikan acara kerapan sapi.\n" +
                "Dan setelah adanya berkembangnya jaman kini thuk thuk semakin seruh yaitu di padukan dengan musik saronin. musik saronin ini bukan hanya milik daerah bangkalan tapi musik saronin ini di miliki semua kabupaten di madura seperti sumenep,pamakasan,sampang dan bangkalan saronin ini musik irama tiupan sruling yang tangga nadanya milik asli orang madura.\n";
        stringBuilder.append(someMessage);

        dscthuk.setText(stringBuilder.toString());
    }
}
