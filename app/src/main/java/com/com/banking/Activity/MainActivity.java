package com.com.banking.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.com.banking.Adapter.CryptoWalletAdapter;
import com.com.banking.Domain.CryptoWallet;
import com.example.moden1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewInit();
    }

    ArrayList<CryptoWallet> cryptoWalletArrayList = new ArrayList<>();

    private void recyclerViewInit() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView = findViewById(R.id.view);
        recyclerView.setLayoutManager(gridLayoutManager);

        cryptoWalletArrayList.add(new CryptoWallet("XRP","xrp",-3.14,2.6,21463.10));
        cryptoWalletArrayList.add(new CryptoWallet("LTC","ltc",4.54,3.5,5412.46));

        adapter = new CryptoWalletAdapter(cryptoWalletArrayList);
        recyclerView.setAdapter(adapter);
    }
}