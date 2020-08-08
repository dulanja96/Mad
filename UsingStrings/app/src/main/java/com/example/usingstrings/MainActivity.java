package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("lifecycle","onCreate() invoked");

        txtview2 = findViewById(R.id.textView2);
        txtview2.setText(R.string.Msg2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifecycle","onStart() invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifecycle","onRestart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifecycle","onResume() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycle","onPause() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle","onStop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycle","onDestroy() invoked");
    }
}