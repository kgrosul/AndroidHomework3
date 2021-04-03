package k.grosul.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent createEmailIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, "kirill.grosul@gmail.com");
        intent.putExtra(Intent.EXTRA_TEXT, "Отправлено из моего прилоежния");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Homework3");
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button openButton = findViewById(R.id.OpenButton);
        openButton.setOnClickListener(this);
        final Button sendButton = findViewById(R.id.SendButton);
        sendButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final Intent intent;
        switch (view.getId()) {
            case R.id.OpenButton:
                intent = new Intent(this, ProfileActivity.class);
                break;
            case R.id.SendButton:
                intent = createEmailIntent();
                break;
            default:
                throw new IllegalArgumentException("Unknown button");
        }
        startActivity(intent);

    }
}