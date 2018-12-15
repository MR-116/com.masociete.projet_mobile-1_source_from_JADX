package fr.pcsoft.wdjava.p061q.p062a;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.BitmapFactory.Options;
import android.graphics.Paint;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import fr.pcsoft.wdjava.core.p035c.C0665g;

@TargetApi(11)
/* renamed from: fr.pcsoft.wdjava.q.a.e */
public class C1018e extends C1017d {
    /* renamed from: b */
    public static final int f2914b = 2;
    /* renamed from: c */
    public static final int f2915c = 0;
    /* renamed from: d */
    public static final int f2916d = 1;

    /* renamed from: a */
    public int mo3286a(View view) throws C0665g {
        return view.getLayerType();
    }

    /* renamed from: a */
    public void mo3287a(Activity activity, boolean z) {
        activity.setFinishOnTouchOutside(z);
    }

    /* renamed from: a */
    public void mo3288a(Options options, boolean z) throws C0665g {
        options.inMutable = z;
    }

    /* renamed from: a */
    public <T> void mo3289a(AsyncTask asyncTask, T... tArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, tArr);
    }

    /* renamed from: a */
    public void mo3290a(View view, int i, Paint paint) throws C0665g {
        view.setLayerType(i, paint);
    }

    /* renamed from: a */
    public void mo3291a(ViewGroup viewGroup) {
        if (viewGroup.getLayoutTransition() == null) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        }
    }

    /* renamed from: b */
    public void mo3292b(View view) {
        view.setLayerType(2, null);
    }

    /* renamed from: b */
    public void mo3293b(ViewGroup viewGroup) {
        viewGroup.setLayoutTransition(null);
    }

    /* renamed from: c */
    public void mo3294c(View view) {
        view.setLayerType(1, null);
    }
}
