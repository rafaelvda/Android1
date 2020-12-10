package fr.papi.ppe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView bienvenue;
    EditText saisieTexte;
    Button soumettreTexte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bienvenue = findViewById(R.id.Bienvenue);
        saisieTexte = findViewById(R.id.editText);
        soumettreTexte = findViewById(R.id.button);

        soumettreTexte.setEnabled(false);

        saisieTexte.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                soumettreTexte.setEnabled(saisieTexte.getText().toString().length() !=0);
            }
        });
    }
}