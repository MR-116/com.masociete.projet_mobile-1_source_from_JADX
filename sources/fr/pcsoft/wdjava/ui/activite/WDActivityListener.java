package fr.pcsoft.wdjava.ui.activite;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;

public abstract class WDActivityListener implements C0492a {
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    public void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    public void onCreate(Activity activity, Bundle bundle) {
    }

    public void onDestroy(Activity activity) {
    }

    public void onFinish(Activity activity) {
    }

    public void onLowMemory(Activity activity) {
    }

    public void onNewIntent(Activity activity, Intent intent) {
    }

    public void onPause(Activity activity) {
    }

    public void onResume(Activity activity) {
    }

    public void onSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onSelectOption(Activity activity, MenuItem menuItem) {
    }

    public void onStart(Activity activity) {
    }

    public void onStop(Activity activity) {
    }

    public final void register(Activity activity) {
        if (activity instanceof WDActivite) {
            ((WDActivite) activity).mo1766b().ajouterEcouteurActivite(this);
        }
    }

    public final void unregister(Activity activity) {
        if (activity instanceof C0502g) {
            ((WDActivite) activity).mo1766b().supprimerEcouteurActivite(this);
        }
    }
}
