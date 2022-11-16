package personal.training.material.design;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class FloatingActionButtonActivity extends AppCompatActivity {
    private boolean isFavorite = false;
    private FloatingActionButton floatingActionButtonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);

        floatingActionButtonButton = findViewById(R.id.fab_main_id);

        floatingActionButtonButton.setOnClickListener(v -> {
            if (!isFavorite) {

                floatingActionButtonButton.setImageResource(R.drawable.ic_baseline_add_circle_outline_24);
                isFavorite = !isFavorite;

                Snackbar addSnackBarCustomize = Snackbar.make(v, "Add!", Snackbar.LENGTH_LONG);

                View viewAddSnackBar = addSnackBarCustomize.getView();
                viewAddSnackBar.setBackgroundColor(getResources().getColor(R.color.purple_200, getTheme()));

                addSnackBarCustomize.setTextColor(getColor(R.color.black));
                addSnackBarCustomize.setActionTextColor(getColor(R.color.black));

                addSnackBarCustomize.setAction("بریم؟", vAdd ->
                        startActivity(new Intent(this, ThemeActivity.class))
                ).show();
            } else {

                floatingActionButtonButton.setImageResource(R.drawable.ic_baseline_add_24);
                isFavorite = !isFavorite;

                Snackbar removeSnackBarCustomize = Snackbar.make(v, "Remove!", Snackbar.LENGTH_LONG);

                View viewRemoveSnackBar = removeSnackBarCustomize.getView();
                viewRemoveSnackBar.setBackgroundColor(getResources().getColor(R.color.purple_200, getTheme()));

                removeSnackBarCustomize.setTextColor(getResources().getColor(R.color.black, getTheme()));
                removeSnackBarCustomize.setActionTextColor(getColor(R.color.black));

                removeSnackBarCustomize.setAction("بریم؟", vRemove ->
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/")))
                ).show();
            }


        });
    }
}