package com.heibao.ordermeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.order).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OrderMealActivity.class);
                //intent.putExtra("name",nameTv.getText());
                /*Bundle bundle = new Bundle();
                bundle.putString("usermsg", "直接返回");
                intent.putExtras(bundle);*/
                startActivity(intent);
            }
        });

    }




}
