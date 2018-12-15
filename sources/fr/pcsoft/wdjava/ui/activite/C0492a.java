package fr.pcsoft.wdjava.ui.activite;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;

/* renamed from: fr.pcsoft.wdjava.ui.activite.a */
public interface C0492a {
    void onActivityResult(Activity activity, int i, int i2, Intent intent);

    void onConfigurationChanged(Activity activity, Configuration configuration);

    void onCreate(Activity activity, Bundle bundle);

    void onDestroy(Activity activity);

    void onFinish(Activity activity);

    void onLowMemory(Activity activity);

    void onNewIntent(Activity activity, Intent intent);

    void onPause(Activity activity);

    void onResume(Activity activity);

    void onSaveInstanceState(Activity activity, Bundle bundle);

    void onSelectOption(Activity activity, MenuItem menuItem);

    void onStart(Activity activity);

    void onStop(Activity activity);
}
