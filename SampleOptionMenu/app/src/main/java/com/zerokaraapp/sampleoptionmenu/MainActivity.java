package com.zerokaraapp.sampleoptionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //アプリバーにメニューを作成するメソッド
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //インフレーターを使ってメニューを表示させる
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    //メニューボタンを押したときの反応を定義するメソッド
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //テキストビューに文字を表示する様に定義
        TextView textView = findViewById(R.id.text_view);
        textView.setText(R.string.get_text);
        return true;
    }

}