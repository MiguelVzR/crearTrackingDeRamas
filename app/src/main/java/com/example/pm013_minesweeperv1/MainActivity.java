package com.example.pm013_minesweeperv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        crearCeldas();

    }

    private void crearCeldas(){
        GridLayout gl= (GridLayout) findViewById(R.id.gl);
        Celda c;
        for (int i=0;i<18;i++){
            boolean bomba=false;

            if(Math.random()<0.3){
                bomba=true;
            }else{
                bomba=false;
            }
            c=new Celda(this,bomba,false);
            //No se si es realmente necesario
            c.setId(i+1);
            c.setText(String.valueOf(i));
            //Hacemos que los botones se adapten al tamaño del gridLayout
            c.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            GridLayout.LayoutParams lp=new GridLayout.LayoutParams();
            System.out.println("######################"+c.getPaddingLeft());
            System.out.println("######################"+c.getPaddingBottom());
            //c.setPadding(0,0,0,0);
            c.setPadding(200,200,200,200);
            //c.setScaleX((float)0.5);

            c.setPadding(-200,-200,-200,-200);
            c.setTextSize(10);
            float scale=5/2;
            //c.setScaleX(scale);
            //c.setScaleY(scale);
            c.setLayoutParams(lp);

            //Mostrar los botones en en gl en el indice i
            gl.addView(c,i);
        }
    }
}