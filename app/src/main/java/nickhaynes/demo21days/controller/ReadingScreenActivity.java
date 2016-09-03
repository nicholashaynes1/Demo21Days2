package nickhaynes.demo21days.controller;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import nickhaynes.demo21days.R;

/**
 * The new activity that uses a screen to show the stories.
 */
public class ReadingScreenActivity extends Activity
{
    //button decleration.
    private Button backToMainMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_screen);

        //button instantiation
        backToMainMenuButton = (Button) findViewById(R.id.backToMainMenuButton);

        setupListener();
    }
    private void setupListener()
    {
        backToMainMenuButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View clickView)
            {
                Intent returnIntent = new Intent();
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });

    }
}
