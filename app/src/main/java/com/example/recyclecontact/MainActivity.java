package com.example.recyclecontact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btnOpenDialog;
    RecycleContactAdapter adapter;
    RecyclerView recyclerView;

    ArrayList<ContactModel> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        btnOpenDialog = findViewById(R.id.add);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update);

                EditText editName = dialog.findViewById(R.id.editName);
                EditText editNumber = dialog.findViewById(R.id.editNumber);
                Button btnAction = dialog.findViewById(R.id.adup);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = "",number ="";
                        if (!editName.getText().toString().equals("")){
                            name = editName.getText().toString();
                        } else {
                            Toast.makeText(MainActivity.this,"Please Enter Contact Name",Toast.LENGTH_SHORT).show();
                        }
                        if (!editNumber.getText().toString().equals("")){
                            number = editNumber.getText().toString();
                        } else {
                            Toast.makeText(MainActivity.this,"Please Enter Contact Number",Toast.LENGTH_SHORT).show();
                        }
                        int img = R.drawable.xavier;
                        if(!editName.getText().toString().equals("") && !editNumber.getText().toString().equals("")){
                            arrayList.add(new ContactModel(img,name,number));
                            adapter.notifyItemInserted(arrayList.size()-1);
                        }
                        recyclerView.scrollToPosition(arrayList.size()-1);
                    }
                });
                dialog.show();
            }
        });


        arrayList.add(new ContactModel(R.drawable.xavier,"Xavier the bos","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Utasv","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Divayesh","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Mohit","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Man","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Deep","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Vivek","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Amit","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Kevin","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Brijesh","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Brij","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Man","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Deep","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Vivek","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Amit","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Kevin","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Brijesh","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Brij","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Divayesh","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Mohit","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Man","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Deep","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Vivek","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Amit","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Kevin","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Brijesh","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Brij","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Man","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Deep","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Vivek","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Amit","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Kevin","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Brijesh","9685321470"));
        arrayList.add(new ContactModel(R.drawable.xavier,"Brij","9685321470"));


        adapter = new RecycleContactAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);

    }
}