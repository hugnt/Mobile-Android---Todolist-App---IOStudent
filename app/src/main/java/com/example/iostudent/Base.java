package com.example.iostudent;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

public class Base {
    public static boolean handleNavigationItemSelected(Activity baseActivity, @NonNull MenuItem item) {
        Log.d("item", "1");
        if (item.getItemId() == R.id.menu_task) {
            Log.d("item", "1");
            replaceActivity(baseActivity, TaskActivity.class);
            return true;
        } else if (item.getItemId() == R.id.menu_tasklines) {
            Log.d("item", "2");
            replaceActivity(baseActivity, TaskLineActivity.class);
            return true;
        } else if (item.getItemId() == R.id.menu_history) {
            Log.d("item", "3");
            replaceActivity(baseActivity, HistoryActivity.class);
            return true;
        } else if (item.getItemId() == R.id.menu_settings) {
            Log.d("item", "4");
            replaceActivity(baseActivity, SettingsActivity.class);
            return true;
        }
        Log.d("item", "false");
        return false;
    }

    public static void replaceActivity(Activity baseActivity, Class activityClass) {
        Intent intent = new Intent(baseActivity, activityClass);
        baseActivity.startActivity(intent);
        //baseActivity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        baseActivity.finish();
    }
}
