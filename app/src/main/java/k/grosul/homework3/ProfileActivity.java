package k.grosul.homework3;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        if (savedInstanceState != null) {
            final TextView textEdit = findViewById(R.id.resultEditText);
            textEdit.setText(savedInstanceState.getString("text"));
        }

    }


    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        final TextView textEdit = findViewById(R.id.resultEditText);
        savedInstanceState.putString("text", textEdit.getText().toString());
    }
}