package fr.pcsoft.wdjava.p061q.p062a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.Toolbar;

@TargetApi(21)
/* renamed from: fr.pcsoft.wdjava.q.a.j */
public class C1023j extends C1021h {
    /* renamed from: a */
    public void mo3303a(Activity activity) {
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView != null) {
            decorView.setElevation(0.0f);
            decorView.setZ(0.0f);
            decorView.setClipToOutline(false);
        }
    }

    /* renamed from: a */
    public void mo3304a(View view, Drawable drawable) {
        if (view instanceof Toolbar) {
            ((Toolbar) view).setNavigationIcon(drawable);
        }
    }

    /* renamed from: a */
    public void mo3305a(Window window, int i) {
        if (i == -2) {
            window.clearFlags(Integer.MIN_VALUE);
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
    }
}
