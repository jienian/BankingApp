package com.com.banking.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.com.banking.Domain.CryptoWallet;
import com.example.moden1.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CryptoWalletAdapter extends RecyclerView.Adapter<CryptoWalletAdapter.Viewholder> {

    ArrayList<CryptoWallet> cryptoWallets;
    DecimalFormat formatter;

    public CryptoWalletAdapter(ArrayList<CryptoWallet> cryptoWallets) {
        this.cryptoWallets = cryptoWallets;
        formatter = new DecimalFormat("###,###,###,###,##");
    }

    @NonNull
    @Override
    public CryptoWalletAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_item,parent,false);
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoWalletAdapter.Viewholder holder, int position) {
        holder.cryptoSymbolTxt.setText(cryptoWallets.get(position).getCryptoSymbol());
        holder.cryptoBalanceTxt.setText("$"+formatter.format(cryptoWallets.get(position).getCryptoBalance()));
        holder.changePercentTxt.setText(cryptoWallets.get(position).getChangPercent()+"%");
        holder.propertyAmountTxt.setText(cryptoWallets.get(position).getPropertyAmount()+" "+cryptoWallets.get(position).getCryptoSymbol());

        int drawableResourceId = holder.itemView.getContext().getResources()
                .getIdentifier(cryptoWallets.get(position).getPicUrl(),"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.logoCrypto);

        try{
            if (cryptoWallets.get(position).getChangPercent()>=0){
                holder.changePercentTxt.setTextColor(holder.itemView.getContext().getResources().getColor(R.color.green));
            }else {
                holder.changePercentTxt.setTextColor(holder.itemView.getContext().getResources().getColor(R.color.red));
            }

        }catch (Exception e){

        }

    }

    @Override
    public int getItemCount() {
        return cryptoWallets.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView cryptoSymbolTxt,cryptoBalanceTxt,changePercentTxt,propertyAmountTxt;
        ImageView logoCrypto;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            cryptoSymbolTxt = itemView.findViewById(R.id.symbolTxt);
            cryptoBalanceTxt = itemView.findViewById(R.id.balanceTxt);
            changePercentTxt = itemView.findViewById(R.id.percentTxt);
            propertyAmountTxt = itemView.findViewById(R.id.amountTxt);
            logoCrypto = itemView.findViewById(R.id.pic);
        }
    }
}
