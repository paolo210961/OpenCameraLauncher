package com.example.opencameralauncher;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PackageManager pm = getPackageManager();
                Intent intent = pm.getLaunchIntentForPackage("net.sourceforge.opencamera");
                if (intent != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this,
                        "Open Camera non trovata!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
