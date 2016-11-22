package com.example.admin.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;

/**
 * Created by Admin on 20-11-2016.
 */
public class MyDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {




        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()).setPositiveButton("CANCEL",
                new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){


            }
        })
// A
        .setNegativeButton("DELETE", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }

        });
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.alert_dialog, null));


// Create the AlertDia= builder.create();
        AlertDialog dialog = builder.create();
return builder.create();
    }}

