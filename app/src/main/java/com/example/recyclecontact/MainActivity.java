package com.example.recyclecontact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

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

        RecycleContactAdapter adapter = new RecycleContactAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);

    }
}