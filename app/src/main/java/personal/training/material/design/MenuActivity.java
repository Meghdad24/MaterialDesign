package personal.training.material.design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private CardView floatingActionBtn;
    private CardView themeBtn;
    private CardView snackBarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        floatingActionBtn = findViewById(R.id.cv_fab_menu_id);
        themeBtn = findViewById(R.id.cv_bg_menu_id);
        snackBarBtn = findViewById(R.id.cv_1_menu_id);

        floatingActionBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FloatingActionButtonActivity.class);
            startActivity(intent);
        });

        themeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ThemeActivity.class);
            startActivity(intent);
        });

        snackBarBtn.setOnClickListener(view -> {
                Intent intent = new Intent(this, SnackBarActivity.class);
                startActivity(intent);
            });
    }
}