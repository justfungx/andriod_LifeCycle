package tw.org.iii.life;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyApp myApp;

    public MainActivity(){
        Log.d("DK", "MainActivity");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DK", "onCreate");
        myApp = (MyApp)getApplication();
        Log.d("brad", "myApp:a=" + myApp.getA());
        Log.d("brad", "myApp:b=" + myApp.getB());
        myApp.setA(321);
        myApp.setB("III");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DK", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DK", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DK", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DK", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DK", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DK", "onDestroy");
    }

    public void gotoPage2(View v){
        Intent intent = new Intent(this, Page2Activity.class);
        intent.putExtra("name","DK");
        intent.putExtra("stage",4);
        intent.putExtra("sound",false);
        startActivity(intent);
    }

    public void gotoPage2v2(View v){
        Intent intent = new Intent(this, Page2Activity.class);
        intent.putExtra("name","DK");
        intent.putExtra("stage",4);
        intent.putExtra("sound",false);

        startActivityForResult(intent,77);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("DK","onActivityResult" + resultCode);
        int a = data.getIntExtra("a",-1);
        int b = data.getIntExtra("b",-1);
        Log.d("DK", a +":"+ b );
    }

    public void exit(View v){
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        Log.d("DK", "finish");
    }
}
