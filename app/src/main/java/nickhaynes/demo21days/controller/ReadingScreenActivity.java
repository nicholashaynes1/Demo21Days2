package nickhaynes.demo21days.controller;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nickhaynes.demo21days.R;

/**
 * The new activity that uses a screen to show the stories.
 */
public class ReadingScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_screen);
    }
}
