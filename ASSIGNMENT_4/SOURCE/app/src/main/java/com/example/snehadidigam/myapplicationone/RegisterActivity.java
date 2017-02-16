package com.example.snehadidigam.myapplicationone;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/**
 * Created by SNEHA DIDIGAM on 2/15/2017.
 */

public class RegisterActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_register);
        TextView ls= (TextView) findViewById(R.id.link_to_login);

        ls.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                finish();
            }

        });


    }

}
