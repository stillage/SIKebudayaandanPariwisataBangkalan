package com.example.sikebudayaandanpariwisatabangkalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class religimataaerebuh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religimataaerebuh);

        TextView dscaerebuh= (TextView)findViewById(R.id.descaerebuh);

        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Ratu Ibu atau dalam bahasa Madura di kenal dengan Rato Ebhu adalah Syarifah Ambami istri dari Raden Praseno seorang penguasa Madura yang memiliki gelar Cakraningrat I. Cerita sejarah tangisan Ratu ibu ini sangat terkenal dan mata air Ratu Ibu yang begitu keramat. Di komplek pemakaman yang cukup luas ini juga merupakan komplek pemakaman keluarga tujuh turunan.\n"+
                "Tempat wisata ziarah Air Mata Ibu ini adalah salah satu wisata ziarah ini berupa komplek pemakaman yang menyimpan cerita sejarah yang cukup terkenal dan di percaya hingga sekarang. Arosbaya, sebuah kecamatan yang termasuk dari kabupaten Bangkalan adalah tempat wisata ziarah Air Mata Ibu berasal.\n" +
                "\n" +
                "Tempat wisata ziarah air mata Ratu Ibu ini di kenal dengan nama Pesarean Aer Mata Ebuh atau Makam Rato Ebu, berada tepat di desa Buduran Arosbaya. Pesarean Aer Mata Ebuh menyimpan nilai sejarah yang di angggap keramat oleh sebagian besar masyarakat Bangkalan dan para peziarah yang telah datang menjejakkan kakinya ke pesarean.";
        stringBuilder.append(someMessage);

        dscaerebuh.setText(stringBuilder.toString());
    }
}