package com.example.pm013_minesweeperv1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Celda extends Button {

    private boolean bomba;
    private boolean visible;

    public Celda(Context context, boolean bomba, boolean visible) {
        super(context);
        this.bomba=bomba;
        this.visible=visible;
        //setImageResource(R.drawable.boton);
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }




}
