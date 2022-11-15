package personal.training.material.design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button floatingActionBtn;
    private Button themeBtn;
    private Button snackBarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        floatingActionBtn = findViewById(R.id.btn_fab_menu_id);
        themeBtn = findViewById(R.id.btn_theme_menu_id);
        snackBarBtn = findViewById(R.id.btn_snkb_menu_id);

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