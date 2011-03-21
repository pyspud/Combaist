package uk.co.kalgan.app.combaist;

import android.app.Activity;
import android.os.Bundle;

public class Combaist extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        CombaistView cv = (CombaistView)this.findViewById(R.id.combaistView);
        cv.setBearing(45);
    }
}