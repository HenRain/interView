package com.example.administrator.interview.XML;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.administrator.interview.R;
import com.example.administrator.interview.entity.Book;

import java.io.InputStream;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class XMLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_sax, R.id.btn_dom, R.id.btn_pull})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_sax:
                SAXparser();
                break;
            case R.id.btn_dom:
                break;
            case R.id.btn_pull:
                break;
        }
    }

    private void SAXparser() {
        try {
            InputStream inputStream = getAssets().open("Books.xml");
            SaxBookParser saxBookParser = new SaxBookParser();
            List<Book> books = saxBookParser.parser(inputStream);
            for (Book book : books){
                Log.e("SAXparser",book.toString());
            }
        } catch (Exception e) {
        }
    }
}
