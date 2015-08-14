package harry.com.stickybr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter2 = new IntentFilter("com.test.training");

        MyReceiver2 myReceiver2 = new MyReceiver2();
        this.registerReceiver(myReceiver2, intentFilter2);
    }
//    public void br(View view) {
//        Intent intent = new Intent();
//        intent.setAction("com.test.training");
//        intent.putExtra("int", 5);
//        sendStickyBroadcast(intent);
//    }

    class MyReceiver2 extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            int t = intent.getIntExtra("int",0);
            Toast.makeText(MainActivity.this, "CHANGED level: " + t, Toast.LENGTH_SHORT).show();
//            Log.d("training", "changed level: " + t);
        }
    }
}
