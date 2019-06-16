package com.example.navigationdrawer.pedido;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoPedidoActivity extends Fragment {


    public ListadoPedidoActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.listado_itempedido, container, false);
    }

}
