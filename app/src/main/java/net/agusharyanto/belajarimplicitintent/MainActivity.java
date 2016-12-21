package net.agusharyanto.belajarimplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /** Called when the activity is first created. */
        Button btnMcDonald = (Button)findViewById(R.id.btnMcDonald);
        Button btnKFC = (Button)findViewById(R.id.btnKFC);
        Button btnBelajarAndroid = (Button)findViewById(R.id.btnBelajarAndroid);
        Button btnJadwalPuasa = (Button)findViewById(R.id.btnDetik);
        Button btnKamera = (Button)findViewById(R.id.btnKamera);
        Button btnMap = (Button)findViewById(R.id.btnMap);

        btnMcDonald.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                // getRequest(txtResult,txtUrl);
                CallIntent(v);
            }
        });
        btnKFC.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                // getRequest(txtResult,txtUrl);
                CallIntent(v);
            }
        });
        btnBelajarAndroid.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                // getRequest(txtResult,txtUrl);
                CallIntent(v);
            }
        });
        btnJadwalPuasa.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                // getRequest(txtResult,txtUrl);
                CallIntent(v);
            }
        });
        btnKamera.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                // getRequest(txtResult,txtUrl);
                CallIntent(v);
            }
        });
        btnMap.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                // getRequest(txtResult,txtUrl);
                CallIntent(v);
            }
        });
    }
    public void CallIntent(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btnKFC:
                //akan melakukan Call ke nomor 14022
                intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:14022"));
                startActivity(intent);
                break;
            case R.id.btnMcDonald:
                //akan melakukan Call ke nomor 14045
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:14045"));
                startActivity(intent);
                break;
            case R.id.btnBelajarAndroid:

                intent = new Intent(Intent.ACTION_VIEW, Uri
                        .parse("http://agusharyanto.net"));
                startActivity(intent);
                break;
            case R.id.btnDetik:

                intent = new Intent(Intent.ACTION_VIEW, Uri
                        .parse("http://www.kemendagri.go.id/"));
                startActivity(intent);
                break;
            case R.id.btnKamera:
                //akan memanggil fungsi Camera android
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(intent, 0);
                break;
            case R.id.btnMap:
                intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?saddr=ragunan&daddr=mampang"));
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
