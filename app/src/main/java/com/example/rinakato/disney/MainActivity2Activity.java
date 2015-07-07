package com.example.rinakato.disney;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity2Activity extends Activity implements OnClickListener {
    private Button button_segue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_activity2);
        button_segue=(Button)findViewById(R.id.buttonDisney);
        button_segue.setOnClickListener(this);

        Character cha = new Character();
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.CharacterGroup);
        rg1.setOnCheckedChangeListener(cha);

        Area area = new Area();
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.AreaGroup);
        rg2.setOnCheckedChangeListener(area);
    }

    class Character implements OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            RadioButton rb1 = (RadioButton) findViewById(checkedId);
            if (rb1.isChecked() == true) {
                Toast.makeText(
                        MainActivity2Activity.this,
                ((RadioButton) findViewById(checkedId)).getText()
                        + "を選択しました。", Toast.LENGTH_SHORT).show();
            }
        }
    }

    class Area implements OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            RadioButton rb2 = (RadioButton) findViewById(checkedId);
            if (rb2.isChecked() == true) {
                Toast.makeText(
                        MainActivity2Activity.this,
                        ((RadioButton) findViewById(checkedId)).getText()
                                + "を選択しました。", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onClick(View v) {

        if(v==button_segue){
            Intent intent = new Intent(this, disneyTweet.class);
            startActivityForResult(intent, 0);
        }

    }
}
