package com.example.vijay.broadcastreceiver6;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        broadcastReceiver = new MyBroadCastReceiver();
        Toast.makeText(this, "activity thread id " + Thread.currentThread().getId(), Toast.LENGTH_SHORT).show();
    }

    public void view_click(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent();
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("com.br1");
                sendBroadcast(intent);
                break;
        }
    }
}
