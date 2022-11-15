package personal.training.material.design;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ThemeActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;

    private Button dayBtnTheme;
    private Button nightBtnTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences = getSharedPreferences("preferences", 0);
        final Boolean theme = sharedPreferences.getBoolean("theme?", true);
        super.onCreate(savedInstanceState);
        if (theme) {
            setContentView(R.layout.activity_theme);
        } else {
            setContentView(R.layout.activity_theme_dark);
        }
        setIds();
        setListeners();
    }

    private void setListeners() {
        dayBtnTheme.setOnClickListener(v -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("theme?", true);
            editor.commit();
            recreate();
        });

        nightBtnTheme.setOnClickListener(v -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("theme?", false);
            editor.commit();
            recreate();
        });
    }

    private void setIds() {
        dayBtnTheme = findViewById(R.id.btn_day_theme_id);
        nightBtnTheme = findViewById(R.id.btn_night_theme_id);
    }
}