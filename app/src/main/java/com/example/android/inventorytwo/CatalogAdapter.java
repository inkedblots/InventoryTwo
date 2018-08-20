package com.example.android.inventorytwo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public abstract class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.ListHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<MainActivity.CatalogList> ListDatabase;


    //Creates the actual method of performing the recycler
    public CatalogAdapter(Context context,
                          ArrayList<MainActivity.CatalogList> ListDatabase) {
        this.layoutInflater = LayoutInflater.from(context);
        this.ListDatabase = ListDatabase;
    }

    //Creates the view that is inflated via the Recycler
    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new ListHolder(view);

    }

    //Binds your Array data to the particular layout views
    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        final MainActivity.CatalogList currentList = ListDatabase.get(position);


        //Assign the values of your ArrayList to the assigned holder views
        holder.productName.setText(productName.getProductName());
        holder.productDesc.setText(productDesc.getProductDesc());
        holder.price.setText(String.valueOf(price.getPrice());
        holder.quantity.setText(String.valueOf(currentquantity.getQuantity());
        holder.supplierName.setText(String.valueOf(currentsupplierName.getSupplierName());
        holder.supplierPhone.setText(String.valueOf(currentsupplierPhone.getSupplierPhone());

    }

    //Returns your Array size
    @Override
    public int getItemCount() {
        return ListDatabase.size();
    }

    //This is a custom holder which is how your data binding occurs, this is where the ids are assigned.
    class ListHolder extends RecyclerView.ViewHolder {
        private TextView ProductName;
        private TextView ProductDesc;
        private TextView Price;
        private TextView Quantity;
        private TextView SupplierName;
        private TextView SupplierPhone;

        private ListHolder(View CatalogView) {
            super(CatalogView);
            productName = CatalogView.findViewById(R.id.productName);
            productDesc = CatalogView.findViewById(R.id.productDesc);
            price = CatalogView.findViewById(R.id.price);
            quantity = CatalogView.findViewById(R.id.quantity);
            supplierName = CatalogView.findViewById(R.id.supplierName);
            supplierPhone = CatalogView.findViewById(R.id.supplierPhone);
        }
    }
}
