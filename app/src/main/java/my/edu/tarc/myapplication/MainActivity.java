package my.edu.tarc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge;
    private TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);
    }
    public void displayMessage(View view){
        String name = "<name>";
        if(!editTextName.getText().toString().isEmpty())
            name = editTextName.getText().toString();
        String age = "#";
        if(!editTextAge.getText().toString().isEmpty()) {
            age = String.valueOf(Integer.parseInt(editTextAge.getText().toString())+1);
        }
        textViewMessage.setText("Hi "+name+", you will be "+age+" year old in 2018.");
    }
    public void resetMessage(View view){
        editTextName.setText("");
        editTextAge.setText("");
        textViewMessage.setText(R.string.defaultMessage);
    }

}
