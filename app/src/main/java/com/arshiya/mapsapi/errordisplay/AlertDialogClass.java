package com.arshiya.mapsapi.errordisplay;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.arshiya.mapsapi.R;
//import com.arshiya.mapsapi.common.CurrentActivityContext;
//import com.arshiya.mapsapi.common.FontConstants;

/**
 * Created by akhanumx on 10/22/2015.
 */
public class AlertDialogClass {

    private static final String TAG = "AlertDialogClass";
    public static Dialog dialog;


    public static void showAlert(Context context, String msg) {
//        Context context1 = CurrentActivityContext.getContext();

//        if (null == context1) {
//            Log.e(TAG, "No context available to display error");
//        } else {
//            Log.d(TAG, " Activity :" + context1);
//            // custom dialog
//            dialog = new Dialog(context1);
//            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//            WindowManager.LayoutParams params = dialog.getWindow().getAttributes();
//            params.gravity = Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL;
//
//            params.x = 0;   //x position
//            params.y = 0;   //y position
//            params.height = WindowManager.LayoutParams.WRAP_CONTENT;
//            params.width = WindowManager.LayoutParams.MATCH_PARENT;
//
//
////            LayoutInflater inflater = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
////            View dialogView = inflater
////                    .inflate(R.layout.error_pop_up, null);
////
////            dialog.setContentView(dialogView);
////            dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
////
////            TextView text = (TextView) dialog.findViewById(R.id.error_message);
////            text.setText(msg);
//////            text.setTypeface(FontConstants.ROBOTOREGULAR);
////
////            Button dialogButton = (Button) dialog.findViewById(R.id.error_ok);
////            dialogButton.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View v) {
////                    dialog.dismiss();
////                }
////            });
//////            dialogButton.setTypeface(FontConstants.ROBOTOMEDIUM);
////
////            dialog.show();
//        }
    }

//    public static void dismissAlert(){
//        if (dialog.isShowing()){
//            dialog.dismiss();
//        }
//    }

}

