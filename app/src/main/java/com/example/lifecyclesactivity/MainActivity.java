package com.example.lifecyclesactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        if (savedInstanceState !=null){
            textView.setText(savedInstanceState.getString("ololo"));
        }
        Log.d("ololo", "onCreate: ");
        textView.append("onCreate:" + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ololo", "onStart: ");
        textView.append("onStart:" + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ololo", "onResume: ");
        textView.append("onResume:" + "\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ololo", "onPause: ");
        textView.append("onPause:" + "\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ololo", "onStop: ");
        textView.append("onStop" +"\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ololo", "onDestroy: ");
        textView.append("onDestroy" + "\n");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("ololo", "onSaveInstanceState: ");
        textView.append("ololo"+"\n");
        outState.putString("ololo",textView.getText().toString());
    }
}
