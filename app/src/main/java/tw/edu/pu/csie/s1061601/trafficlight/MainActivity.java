package tw.edu.pu.csie.s1061601.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //設定全螢幕顯示
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        //設定螢幕為橫式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main);

        EditText myEdit = (EditText) findViewById(R.id.gre);
        if ("".equals(myEdit.getText().toString().trim())) {
            Toast.makeText(this, "燈號的秒數不能為空白", Toast.LENGTH_LONG).show();
            return;
        }
    }

    public void StartGame(View v){
        Intent it = new Intent();
        it.setClass(this, GameActivity.class);
        startActivity(it);
        finish();
    }

    public void EndApp(View v){
        finish();
    }
}
