package com.example.bearadvisor;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickFindBeer(View view){
        TextView descript =  findViewById(R.id.description);
        Spinner item =  findViewById(R.id.item);
        String selectedItem = String.valueOf(item.getSelectedItem());
        String description="";
        switch (selectedItem) {
            case "Apple":
                description = "Selected item: Apple\n\nScientific Name: Malus domestica\n\nDescription: Apples are rich in fiber, vitamin C, and various antioxidants. They come in many varieties, each with its own unique flavor and texture. Apples are also known for their health benefits, including improving heart health and reducing the risk of diabetes.";
                break;
            case "Banana":
                description = "Selected item: Banana\n\nScientific Name: Musa spp.\n\nDescription: Bananas are a good source of potassium, vitamin B6, and vitamin C. They are known for their energy-boosting properties and are often used in smoothies and desserts.";
                break;
            case "Cherry":
                description = "Selected item: Cherry\n\nScientific Name: Prunus spp.\n\nDescription: Cherries are rich in antioxidants, vitamins A and C, and fiber. They are known for their anti-inflammatory properties and can help improve sleep quality and reduce muscle soreness.";
                break;
            case "Date":
                description = "Selected item: Date\n\nScientific Name: Phoenix dactylifera\n\nDescription: Dates are high in natural sugars, fiber, potassium, and magnesium. They are known for their energy-boosting properties and can help improve digestive health.";
                break;
            case "Elderberry":
                description = "Selected item: Elderberry\n\nScientific Name: Sambucus nigra\n\nDescription: Elderberries are high in vitamin C, dietary fiber, and antioxidants. They are often used in syrups and jams and are known for their immune-boosting properties and ability to reduce cold and flu symptoms.";
                break;
        }
        descript.setText(description);
    }
}
