package com.adriwaas.nano.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ViewGroup layout = (ViewGroup)findViewById(R.id.layoutMain);
        int childrenSize = layout.getChildCount();
        for (int i = 0; i < childrenSize; i++) {
            View view = layout.getChildAt(i);
            if (view instanceof Button) {
                view.setOnClickListener(this);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify:
                Toast.makeText(v.getContext(), "This button will launch Spotify Streamer App", Toast.LENGTH_LONG).show();
                break;
            case R.id.scores:
                Toast.makeText(v.getContext(), "This button will launch Football Scores App", Toast.LENGTH_LONG).show();
                break;
            case R.id.library:
                Toast.makeText(v.getContext(), "This button will launch Library App", Toast.LENGTH_LONG).show();
                break;
            case R.id.bigger:
                Toast.makeText(v.getContext(), "This button will launch Build It Bigger App", Toast.LENGTH_LONG).show();
                break;
            case R.id.xyz:
                Toast.makeText(v.getContext(), "This button will launch XYZ Reader App", Toast.LENGTH_LONG).show();
                break;
            case R.id.capstone:
                Toast.makeText(v.getContext(), "This button will launch my Capstone App", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
