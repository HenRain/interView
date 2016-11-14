package com.example.administrator.interview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.interview.XML.XMLActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_xml, R.id.btn_json, R.id.btn_html})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_xml:
               startActivity(new Intent(this, XMLActivity.class ));
                break;
            case R.id.btn_json:
                break;
            case R.id.btn_html:
                break;
        }
    }
}
