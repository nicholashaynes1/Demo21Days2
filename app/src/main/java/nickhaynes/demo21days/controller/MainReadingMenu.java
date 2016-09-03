package nickhaynes.demo21days.controller;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;
import nickhaynes.demo21days.R;

import nickhaynes.demo21days.model.AndroidSaveState;
/**
 * main menu seen on app opening.
 */
public class MainReadingMenu extends Activity {

    //Test button decleration
    private Button testButton1;
    private Button testButton2;
    private Button testButton3;

    //saveState stuff
    private AndroidSaveState saveState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_reading_menu);

        //Test button instantiation
        testButton1 = (Button) findViewById(R.id.testButton1);
        testButton2 = (Button) findViewById(R.id.testButton2);
        testButton3 = (Button) findViewById(R.id.testButton3);

        //access to the save state


        //call for listeners
        setupListeners();
    }

    private void setupListeners()
    {
        //changes screens to the reading screen.
        testButton1.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View clickView)
            {
                Intent changeScreen = new Intent(clickView.getContext(), ReadingScreenActivity.class);
                startActivityForResult(changeScreen, 0);
            }

        });

    }

}
