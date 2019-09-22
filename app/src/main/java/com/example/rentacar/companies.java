package com.example.rentacar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class companies extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[ ] comp={"Hertz", "AVIS", "enterprise", "Budget", "Thrifty", "National"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_companies, R.id.rental, comp));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){

        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.hertz.com ")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.avis.com ")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.enterprise.com ")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.budget.com ")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.thrifty.com ")));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.nationalcar.com ")));
                break;

        }

    }
}
