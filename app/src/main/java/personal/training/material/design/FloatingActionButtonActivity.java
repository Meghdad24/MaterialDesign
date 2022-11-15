package personal.training.material.design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.widget.Button;
import android.widget.Toast;

public class FloatingActionButtonActivity extends AppCompatActivity {
    private FloatingActionButton floatingActionButtonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButtonButton = findViewById(R.id.fab_main_id);

        floatingActionButtonButton.setOnClickListener(v -> {
//            Toast.makeText("Add")l
            floatingActionButtonButton.setImageResource(R.drawable.ic_baseline_add_circle_outline_24);
//            floatingActionButtonButton.get
        });
    }
}