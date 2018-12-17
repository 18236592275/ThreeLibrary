package com.example.meicai.threelibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    public static void maketext(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
