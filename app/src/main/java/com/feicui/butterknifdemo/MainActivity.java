package com.feicui.butterknifdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class MainActivity extends AppCompatActivity {



    String str = "1111";

    @BindView(R.id.button1111) Button mbtn;
    @BindView(R.id.textView1111)TextView TV;
    @BindString(R.string.app_name)String string;
    @BindColor(R.color.colorAccent)int colores;
    //解绑对象
    private Unbinder munbinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        munbinder =  ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解绑
        munbinder.unbind();
    }
      //绑定多个控件
    @OnClick({R.id.button1111,R.id.button22})
    public void onckick(View view){
       switch (view.getId()){
           case R.id.button1111:
               Toast.makeText(this, "hjbdb", Toast.LENGTH_SHORT).show();
               break;
           case R.id.button22:
               Toast.makeText(this, "hjbdb", Toast.LENGTH_SHORT).show();
               break;
           default:
               Toast.makeText(this, "无效", Toast.LENGTH_SHORT).show();
               break;
       }
    }
}
