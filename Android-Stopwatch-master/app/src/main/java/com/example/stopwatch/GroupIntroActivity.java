package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GroupIntroActivity extends AppCompatActivity {

    private Button buttonGoToShoppingListMainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This links the Java file to your XML layout file
        setContentView(R.layout.home_layout);

        // Find the button in the layout by its ID
        buttonGoToShoppingListMainPage = findViewById(R.id.buttonGoToShoppingListMainPage);

        // Set a click listener on the button
        buttonGoToShoppingListMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start MainActivity (your shopping list page)
                Intent intent = new Intent(GroupIntroActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}