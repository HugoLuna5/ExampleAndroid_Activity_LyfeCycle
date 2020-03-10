package lunainc.mx.com.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Sucedio el evento onCreate()", Toast.LENGTH_SHORT).show();
        Log.e("onCreate()", "Sucedio el evento onCreate()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Sucedio el evento onStart()", Toast.LENGTH_SHORT).show();
        Log.e("onStart()", "Sucedio el evento onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Sucedio el evento onRestart()", Toast.LENGTH_SHORT).show();
        Log.e("onRestart()", "Sucedio el evento onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Sucedio el evento onResume()", Toast.LENGTH_SHORT).show();
        Log.e("onResume()", "Sucedio el evento onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Sucedio el evento onPause()", Toast.LENGTH_SHORT).show();
        Log.e("onPause()", "Sucedio el evento onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Sucedio el evento onStop()", Toast.LENGTH_SHORT).show();
        Log.e("onStop()", "Sucedio el evento onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Sucedio el evento onDestroy()", Toast.LENGTH_SHORT).show();
        Log.e("onDestroy()", "Sucedio el evento onDestroy()");
    }
}
