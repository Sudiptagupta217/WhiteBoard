package com.sudipta.whiteboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import static com.sudipta.whiteboard.display.colorList;
import static com.sudipta.whiteboard.display.current_brush;
import static com.sudipta.whiteboard.display.pathList;


public class MainActivity extends AppCompatActivity {
    public static Path path = new Path();
    public static Paint paint_brush = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);  //set full screen;
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE); // set screen orientation "LANDSCAPE"

        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();  //--> use this line or change the Themes
    }
    public void redColor(View view) {
        paint_brush.setColor(Color.RED);
        currentColor(paint_brush.getColor());
    }

    public void blueColor(View view) {
        paint_brush.setColor(Color.BLUE);
        currentColor(paint_brush.getColor());
    }

    public void greenColor(View view) {
        paint_brush.setColor(Color.rgb(22, 76, 25));
        currentColor(paint_brush.getColor());
    }

    public void yellowColor(View view) {
        paint_brush.setColor(Color.YELLOW);
        currentColor(paint_brush.getColor());
    }

    public void violetColor(View view) {
        paint_brush.setColor(Color.rgb(123, 32, 138));
        currentColor(paint_brush.getColor());
    }

    public void blackColor(View view) {
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }

    public void skyBlueColor(View view) {
        paint_brush.setColor(Color.rgb(3,169,244));
        currentColor(paint_brush.getColor());
    }

    public void eraser(View view) {
        pathList.clear();
        colorList.clear();
        path.reset();
    }

    public void pen(View view) {
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }

    public void currentColor(int c){
        current_brush =c;
        path = new Path();
    }



}