package de.bytescoding.delilandroidapp;

import android.content.Context;
import android.graphics.Color;
import android.widget.Button;
import android.widget.Toast;

public class ExtraCode {


    public static int color = Color.RED;
    public static void execute(Button button, Context context) {
        
        button.setOnClickListener(v -> {
            
            if (color == Color.RED){
                button.setBackgroundColor(Color.GREEN);
                color = Color.GREEN;
            } else{
                button.setBackgroundColor(Color.RED);
                color = Color.RED;
            }
              
            Toast.makeText(context, "Wurde angeklickt", Toast.LENGTH_SHORT).show();
        });
        
        
        
    }
    
}
