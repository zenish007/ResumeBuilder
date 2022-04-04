package com.example.resumebuilder;

import static com.example.resumebuilder.Data.about1;
import static com.example.resumebuilder.Data.add1;
import static com.example.resumebuilder.Data.comname1;
import static com.example.resumebuilder.Data.email1;
import static com.example.resumebuilder.Data.enddate1;
import static com.example.resumebuilder.Data.eng1;
import static com.example.resumebuilder.Data.fclg1;
import static com.example.resumebuilder.Data.fdegree1;
import static com.example.resumebuilder.Data.fhobby1;
import static com.example.resumebuilder.Data.fskill1;
import static com.example.resumebuilder.Data.fyear1;
import static com.example.resumebuilder.Data.github1;
import static com.example.resumebuilder.Data.guj1;
import static com.example.resumebuilder.Data.hindi1;
import static com.example.resumebuilder.Data.lang1;
import static com.example.resumebuilder.Data.lang2;
import static com.example.resumebuilder.Data.lang3;
import static com.example.resumebuilder.Data.linkedin1;
import static com.example.resumebuilder.Data.name1;
import static com.example.resumebuilder.Data.num1;
import static com.example.resumebuilder.Data.pos1;
import static com.example.resumebuilder.Data.pro1;
import static com.example.resumebuilder.Data.sabout1;
import static com.example.resumebuilder.Data.sclg1;
import static com.example.resumebuilder.Data.scomname1;
import static com.example.resumebuilder.Data.sdegree1;
import static com.example.resumebuilder.Data.senddate1;
import static com.example.resumebuilder.Data.shobby1;
import static com.example.resumebuilder.Data.spos1;
import static com.example.resumebuilder.Data.sskill1;
import static com.example.resumebuilder.Data.sstartdate1;
import static com.example.resumebuilder.Data.startdate1;
import static com.example.resumebuilder.Data.summary1;
import static com.example.resumebuilder.Data.syear1;
import static com.example.resumebuilder.Data.tclg1;
import static com.example.resumebuilder.Data.tdegree1;
import static com.example.resumebuilder.Data.thobby1;
import static com.example.resumebuilder.Data.tskill1;
import static com.example.resumebuilder.Data.tyear1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class two_temp extends AppCompatActivity {

    TextView name1_txt, pro1_txt, add1_txt, no1_txt, email1_txt, summary1_txt, fskill1_txt, sskill1_txt, tskill1_txt, pos1_txt,
            startdate1_txt, enddate1_txt, comname1_txt, about1_txt, spos1_txt, sstartdate1_txt, senddate1_txt, scomname1_txt,
            sabout1_txt, fdegree1_txt, fyear1_txt, fclg1_txt, sdegree1_txt, syear1_txt, sclg1_txt, tdegree1_txt, tyear1_txt,
            tclg1_txt, guj1_txt, hindi1_txt, eng1_txt, lang1_txt, lang2_txt, lang3_txt, fhobby1_txt, shobby1_txt, thobby1_txt,
            linkedin1_txt, github1_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_temp);

        binding();

        name1_txt.setText(name1);
        pro1_txt.setText(pro1);
        add1_txt.setText(add1);
        no1_txt.setText(num1);
        email1_txt.setText(email1);
        summary1_txt.setText(summary1);
        fskill1_txt.setText(fskill1);
        sskill1_txt.setText(sskill1);
        tskill1_txt.setText(tskill1);
        pos1_txt.setText(pos1);
        startdate1_txt.setText(startdate1);
        enddate1_txt.setText(enddate1);
        comname1_txt.setText(comname1);
        about1_txt.setText(about1);
        spos1_txt.setText(spos1);
        sstartdate1_txt.setText(sstartdate1);
        senddate1_txt.setText(senddate1);
        scomname1_txt.setText(scomname1);
        sabout1_txt.setText(sabout1);
        fdegree1_txt.setText(fdegree1);
        fyear1_txt.setText(fyear1);

        fclg1_txt.setText(fclg1);
        sdegree1_txt.setText(sdegree1);
        syear1_txt.setText(syear1);
        sclg1_txt.setText(sclg1);
        tdegree1_txt.setText(tdegree1);
        tyear1_txt.setText(tyear1);
        tclg1_txt.setText(tclg1);
        lang1_txt.setText(guj1);
        lang2_txt.setText(hindi1);
        lang3_txt.setText(eng1);
        guj1_txt.setText(lang1);
        hindi1_txt.setText(lang2);
        eng1_txt.setText(lang3);
        fhobby1_txt.setText(fhobby1);
        shobby1_txt.setText(shobby1);
        thobby1_txt.setText(thobby1);
        linkedin1_txt.setText(linkedin1);
        github1_txt.setText(github1);



        no1_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String no = "tel:" + num1;
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(no));
                startActivity(i);

            }
        });

    }

    private void binding() {

        name1_txt = findViewById(R.id.name1_txt);
        pro1_txt = findViewById(R.id.pro1_txt);
        add1_txt = findViewById(R.id.add1_txt);
        no1_txt = findViewById(R.id.no1_txt);
        email1_txt = findViewById(R.id.email1_txt);
        summary1_txt = findViewById(R.id.summary1_txt);
        fskill1_txt = findViewById(R.id.fskill1_txt);
        sskill1_txt = findViewById(R.id.sskill1_txt);
        tskill1_txt = findViewById(R.id.tskill1_txt);
        pos1_txt = findViewById(R.id.pos1_txt);
        startdate1_txt = findViewById(R.id.startdate1_txt);
        enddate1_txt = findViewById(R.id.enddate1_txt);
        comname1_txt = findViewById(R.id.comname1_txt);
        about1_txt = findViewById(R.id.about1_txt);
        spos1_txt = findViewById(R.id.spos1_txt);
        sstartdate1_txt = findViewById(R.id.sstartdate1_txt);
        senddate1_txt = findViewById(R.id.senddate1_txt);
        scomname1_txt = findViewById(R.id.scomname1_txt);
        sabout1_txt = findViewById(R.id.sabout1_txt);
        fdegree1_txt = findViewById(R.id.fdegree1_txt);
        fyear1_txt = findViewById(R.id.fyear1_txt);
        fclg1_txt = findViewById(R.id.fclg1_txt);
        sdegree1_txt = findViewById(R.id.sdegree1_txt);
        syear1_txt = findViewById(R.id.syear1_txt);
        sclg1_txt = findViewById(R.id.sclg1_txt);
        tdegree1_txt = findViewById(R.id.tdegree1_txt);
        tyear1_txt = findViewById(R.id.tyear1_txt);
        tclg1_txt = findViewById(R.id.tclg1_txt);
        lang1_txt = findViewById(R.id.lang1_txt);
        lang2_txt = findViewById(R.id.lang2_txt);
        lang3_txt = findViewById(R.id.lang3_txt);
        guj1_txt = findViewById(R.id.guj1_txt);
        hindi1_txt = findViewById(R.id.hindi1_txt);
        eng1_txt = findViewById(R.id.eng1_txt);
        fhobby1_txt = findViewById(R.id.fhobby1_txt);
        shobby1_txt = findViewById(R.id.shobby1_txt);
        thobby1_txt = findViewById(R.id.thobby1_txt);
        linkedin1_txt = findViewById(R.id.linkedin1_txt);
        github1_txt = findViewById(R.id.github1_txt);


    }

}