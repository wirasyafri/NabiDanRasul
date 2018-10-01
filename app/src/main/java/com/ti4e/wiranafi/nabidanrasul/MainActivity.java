package com.ti4e.wiranafi.nabidanrasul;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ResepListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    public void onShowDetails(View view){
//        Intent intent = new Intent(this,DetailActivity.class);
//        startActivity(intent);
//    }

    public void itemClicked(long id)
    {
        View fragmenDetail = findViewById(R.id.fragment_container);
        if(fragmenDetail != null )
        {
            ResepDetailFragment deta = new ResepDetailFragment();
            FragmentTransaction fragTrans = getSupportFragmentManager().beginTransaction();
            deta.setResep(id);
            fragTrans.replace(R.id.fragment_container,deta);
            fragTrans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//            supaya tidak ketumpuk transactionnya maka script dibawah ini di comment
            //fragTrans.addToBackStack(null);
            fragTrans.commit();
        }

        else
        {
            Toast.makeText(this, "Item " + id + " was clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this.getApplicationContext(), DetailActivity.class);
            Bundle b = new Bundle();
            b.putDouble("id",id);
            intent.putExtras(b);
            startActivity(intent);
        }
    }
}
