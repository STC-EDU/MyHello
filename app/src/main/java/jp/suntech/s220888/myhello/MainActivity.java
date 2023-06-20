package jp.suntech.s220888.myhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン・オブジェクトの用意
        Button btClick = findViewById(R.id.btClick);
        //リスナ・オブジェクトの用意
        HelloListener listener = new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);
    }

    //ボタンをクリックした時のリスナクラス
    private class HelloListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);

            int id = v.getId();
            if(id==R.id.btClick) {
                String inputStr = input.getText().toString();
                output.setText(inputStr);
            }else if(id ==R.id.btClear){
                input.setText("");
                output.setText("");
            }
        }
    }
}