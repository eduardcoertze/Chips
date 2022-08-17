package com.example.chips;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ChipGroup cg = findViewById(R.id.maps_chip_group);
//
//        cg.setOnCheckedStateChangeListener(new ChipGroup.OnCheckedStateChangeListener() {
//            @Override
//            public void onCheckedChanged(@NonNull ChipGroup group, @NonNull List<Integer> checkedIds) {
//
//                int selectedChip = checkedIds.get(0);
//
//                Chip chip = cg.findViewById(selectedChip);
//
//                if (chip != null)
//                    Toast.makeText(MainActivity.this, "Chip: " + chip.getText(), Toast.LENGTH_SHORT).show();
//
//            }
//        });




    }
}