package com.ti4e.wiranafi.nabidanrasul;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NabiDetailFragment extends Fragment {

    private long resepId;
    public NabiDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resep_detail, container, false);
    }

    public void setResep(long id) {
        this.resepId = id;
    }
    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Nabi resepmakanan = Nabi.kisahnabi[(int) resepId];

            title.setText(resepmakanan.getNama_nabi());

            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(resepmakanan.getDeskripsi());

        } }
}
