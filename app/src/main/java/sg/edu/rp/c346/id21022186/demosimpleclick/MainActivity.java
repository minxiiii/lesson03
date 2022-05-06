package sg.edu.rp.c346.id21022186.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    // step 1: Declare the field variables 
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton toggleBtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2: Link the field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        toggleBtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the action
                // get text of EditText etInput and convert to string
                // assign a variable
                String stringResponse = etInput.getText().toString();
                //display
                tvDisplay.setText(stringResponse);
            }
        });

        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toggleBtn.isChecked() == true) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }
            }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale) {
                    // Write the code when male selected
                    rgGender.check(checkedRadioId);
                    tvDisplay.setText("He says" + stringResponse);


                } else {
                    // Write the code when female selected
                    checkedRadioId = R.id.radioButtonGenderFemale;
                    tvDisplay.setText("She says" + stringResponse);

                }
                tvDisplay.setText(stringResponse);
            }
        });

    }
        }







