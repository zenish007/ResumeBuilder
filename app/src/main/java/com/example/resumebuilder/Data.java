package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class Data extends AppCompatActivity {


    public static String name1,pro1,add1,num1,email1,summary1,fskill1,sskill1,tskill1,pos1,startdate1,enddate1,comname1,about1,
                         spos1,sstartdate1,senddate1,scomname1,sabout1,fdegree1,fyear1,fclg1,sdegree1,syear1,sclg1,tdegree1,tyear1,
                         tclg1,guj1,hindi1,eng1,lang1,lang2,lang3,fhobby1,shobby1,thobby1,linkedin1,github1;

    EditText name_edt,pro_edt,add_edt,email_edt,no_edt,summary_edt,fskill_edt,sskill_edt,tskill_edt,pos_edt,startdate_edt,enddate_edt,
             comname_edt,about_edt,spos_edt,sstartdate_edt,senddate_edt,scomname_edt,sabout_edt,fdegree_edt,fyear_edt,fclg_edt,sdegree_edt,
             syear_edt,sclg_edt,tdegree_edt,tyear_edt,tclg_edt,fhobby_edt,shobby_edt,thobby_edt,linkedin_edt,github_edt;

    Button submit_btn;
    TextView guj_txt,hindi_txt,eng_txt;
    SeekBar guj_seek,hindi_seek,eng_seek;
    CheckBox guj_chk,hindi_chk,eng_chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        binding();

        guj_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true){

                    guj1 = "Gujarati";
                }
                else {

                    guj1 = " ";
                }
            }
        });
        hindi_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true){

                    hindi1 = "Hindi";
                }
                else {

                    hindi1 = " ";
                }
            }
        });
        eng_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true){

                    eng1 = "English";
                }
                else {

                    eng1 = " ";
                }
            }
        });

        guj_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                guj_txt.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        hindi_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                hindi_txt.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        eng_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                eng_txt.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (name_edt.getText().toString().length() <= 0) {
                    name_edt.setError("Enter Name");
                }
                else if (pro_edt.getText().toString().length() <= 0) {
                    pro_edt.setError("Enter Work Profile");
                }
                else if (add_edt.getText().toString().length() <= 0) {
                    add_edt.setError("Enter Your Address");
                }
                else if (no_edt.getText().toString().length() <= 0) {
                    no_edt.setError("Enter Mobile Number");
                }
                else if (email_edt.getText().toString().length() <= 0) {
                    email_edt.setError("Enter Email");
                }
                else if (summary_edt.getText().toString().length() <= 0) {
                    summary_edt.setError("Enter About your Work (Summary)");
                }
                else if (fskill_edt.getText().toString().length() <= 0) {
                    fskill_edt.setError("Enter Your First Skill");
                }
                else if (sskill_edt.getText().toString().length() <= 0) {
                    sskill_edt.setError("Enter Your Second Skill");
                }
                else if (tskill_edt.getText().toString().length() <= 0) {
                    tskill_edt.setError("Enter Your Third Skill");
                }
                else if (pos_edt.getText().toString().length() <= 0) {
                    pos_edt.setError("Enter Your Position");
                }
                else if (startdate_edt.getText().toString().length() <= 0) {
                    startdate_edt.setError("Enter Your Starting Date");
                }
                else if (enddate_edt.getText().toString().length() <= 0) {
                    enddate_edt.setError("Enter Your Ending Date");
                }
                else if (comname_edt.getText().toString().length() <= 0) {
                    comname_edt.setError("Enter Your Company Name");
                }
                else if (about_edt.getText().toString().length() <= 0) {
                    about_edt.setError("Enter Your Experience About Company");
                }
                else if (fdegree_edt.getText().toString().length() <= 0) {
                    fdegree_edt.setError("Enter Your First Degree");
                }
                else if (fyear_edt.getText().toString().length() <= 0) {
                    fyear_edt.setError("Enter Your First Degree Complete Year");
                }
                else if (fclg_edt.getText().toString().length() <= 0) {
                    fclg_edt.setError("Enter Your First College Name");
                }
                else if (sdegree_edt.getText().toString().length() <= 0) {
                    sdegree_edt.setError("Enter Your Second Degree");
                }
                else if (syear_edt.getText().toString().length() <= 0) {
                    syear_edt.setError("Enter Your Second Degree Complete Year");
                }
                else if (sclg_edt.getText().toString().length() <= 0) {
                    sclg_edt.setError("Enter Your Second College Name");
                }
                else if (guj_txt.getText().toString().length() <= 0) {
                    guj_chk.setError("Select The Language You Know");
                }
                else if (hindi_txt.getText().toString().length() <= 0) {
                    hindi_chk.setError("Select The Language You Know");
                }
                else if (fhobby_edt.getText().toString().length() <= 0) {
                    fhobby_edt.setError("Enter Your First Hobby");
                }
                else if (shobby_edt.getText().toString().length() <= 0) {
                    shobby_edt.setError("Enter Your Second Hobby");
                }

                else{

                    name1 = name_edt.getText().toString();
                    pro1 = pro_edt.getText().toString();
                    add1 = add_edt.getText().toString();
                    num1 = no_edt.getText().toString();
                    email1 = email_edt.getText().toString();
                    summary1 = summary_edt.getText().toString();
                    fskill1 = fskill_edt.getText().toString();
                    sskill1 = sskill_edt.getText().toString();
                    tskill1 = tskill_edt.getText().toString();
                    pos1 = pos_edt.getText().toString();
                    startdate1 = startdate_edt.getText().toString();
                    enddate1 = enddate_edt.getText().toString();
                    comname1 = comname_edt.getText().toString();
                    about1 = about_edt.getText().toString();
                    spos1 = spos_edt.getText().toString();
                    sstartdate1 = sstartdate_edt.getText().toString();
                    senddate1 = senddate_edt.getText().toString();
                    scomname1 = scomname_edt.getText().toString();
                    sabout1 = sabout_edt.getText().toString();
                    fdegree1 = fdegree_edt.getText().toString();
                    fyear1 = fyear_edt.getText().toString();
                    fclg1 = fclg_edt.getText().toString();
                    sdegree1 = sdegree_edt.getText().toString();
                    syear1 = syear_edt.getText().toString();
                    sclg1 = sclg_edt.getText().toString();
                    tdegree1 = tdegree_edt.getText().toString();
                    tyear1 = tyear_edt.getText().toString();
                    tclg1 = tclg_edt.getText().toString();
                    lang1 = guj_txt.getText().toString();
                    lang2 = hindi_txt.getText().toString();
                    lang3 = eng_txt.getText().toString();
                    fhobby1 = fhobby_edt.getText().toString();
                    shobby1 = shobby_edt.getText().toString();
                    thobby1 = thobby_edt.getText().toString();
                    linkedin1 = linkedin_edt.getText().toString();
                    github1 = github_edt.getText().toString();

                    Intent intent = new Intent(Data.this,temp.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void binding() {

        name_edt = findViewById(R.id.name_edt);
        pro_edt = findViewById(R.id.pro_edt);
        add_edt = findViewById(R.id.add_edt);
        no_edt = findViewById(R.id.no_edt);
        email_edt = findViewById(R.id.email_edt);
        summary_edt = findViewById(R.id.summary_edt);
        fskill_edt = findViewById(R.id.fskill_edt);
        sskill_edt = findViewById(R.id.sskill_edt);
        tskill_edt = findViewById(R.id.tskill_edt);
        pos_edt = findViewById(R.id.pos_edt);
        startdate_edt = findViewById(R.id.startdate_edt);
        enddate_edt = findViewById(R.id.enddate_edt);
        comname_edt = findViewById(R.id.comname_edt);
        about_edt = findViewById(R.id.about_edt);
        spos_edt = findViewById(R.id.spos_edt);
        sstartdate_edt = findViewById(R.id.sstartdate_edt);
        senddate_edt = findViewById(R.id.senddate_edt);
        scomname_edt = findViewById(R.id.scomname_edt);
        sabout_edt = findViewById(R.id.sabout_edt);
        fdegree_edt = findViewById(R.id.fdegree_edt);
        fyear_edt = findViewById(R.id.fyear_edt);
        fclg_edt = findViewById(R.id.fclg_edt);
        sdegree_edt = findViewById(R.id.sdegree_edt);
        syear_edt = findViewById(R.id.syear_edt);
        sclg_edt = findViewById(R.id.sclg_edt);
        tdegree_edt = findViewById(R.id.tdegree_edt);
        tyear_edt = findViewById(R.id.tyear_edt);
        tclg_edt = findViewById(R.id.tclg_edt);
        fhobby_edt = findViewById(R.id.fhobby_edt);
        shobby_edt = findViewById(R.id.shobby_edt);
        thobby_edt = findViewById(R.id.thobby_edt);
        linkedin_edt = findViewById(R.id.linkedin_edt);
        github_edt = findViewById(R.id.github_edt);

        guj_txt = findViewById(R.id.guj_txt);
        guj_seek = findViewById(R.id.guj_seek);
        hindi_txt = findViewById(R.id.hindi_txt);
        hindi_seek = findViewById(R.id.hindi_seek);
        eng_txt = findViewById(R.id.eng_txt);
        eng_seek = findViewById(R.id.eng_seek);
        guj_chk = findViewById(R.id.guj_chk);
        hindi_chk = findViewById(R.id.hindi_chk);
        eng_chk = findViewById(R.id.eng_chk);



        submit_btn = findViewById(R.id.submit_btn);
    }
}