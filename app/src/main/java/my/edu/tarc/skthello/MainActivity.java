package my.edu.tarc.skthello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg; //a module level variable
    @Override
    //onCreate = main() function
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //display UI
        //R = resource class
        //layout = folder name
        setContentView(R.layout.activity_main);
        //linking UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
    }

    //View = class
    //v = an instance of a class
    public void showMessage(View v)
    {

        textViewMsg.setText("Hello, WYIC");
    }

    public void clearScreen(View v)
    {
        textViewMsg.setText("");
    }
}
