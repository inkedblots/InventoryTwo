package com.example.android.inventorytwo;

import android.support.annotation.NonNull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<CatalogList> ListDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ListDatabase.add(new CatalogList("Matthew", "News App Pt. 1", "1",
                1, "Ahead", "555-555-5555"));
        ListDatabase.add(new CatalogList("Olivia", "Tour Guide", "2", 1,
                "Ahead", "555-555-5555"));
        ListDatabase.add(new CatalogList("Chris", "News", "3",
                1, "Ahead", "555-555-5555"));

        LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(this);

        CatalogAdapter listAdapter = new
                CatalogAdapter(this, ListDatabase) {
                    @Override
                    public void onBindViewHolder(@NonNull CatalogAdapter.ListHolder holder, int position) {

                    }
                };


        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(listAdapter);
    }

    public class CatalogList {
        private String ProductName;
        private String ProductDesc;
        private String Price;
        private int Quantity;
        private String SupplierName;
        private String SupplierPhone;

        //This is how your object is created and also the order in which items should be
        // added to the ArrayList

        public CatalogList(String ProductName, String ProductDesc, String Price, int Quantity,
                           String SupplierName, String SupplierPhone) {
            this.ProductName = ProductName;
            this.ProductDesc = ProductDesc;
            this.Price = Price;
            this.Quantity = Quantity;
            this.SupplierName = SupplierName;
            this.SupplierPhone = SupplierPhone;

        }

        //These are your GETTERS to return the selected items
        public String getProductName() {
            return ProductName;
        }

        public String getProductDesc() {
            return ProductDesc;
        }

        public String getPrice() {
            return Price;
        }

        public int getQuantity() {
            return Quantity;
        }

        public String getSupplierName() {
            return SupplierName;
        }

        public String getSupplierPhone() {
            return SupplierPhone;
        }
    }
}
