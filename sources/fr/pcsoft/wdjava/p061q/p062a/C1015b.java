package fr.pcsoft.wdjava.p061q.p062a;

import android.app.Notification;
import android.app.Service;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.MotionEvent;

/* renamed from: fr.pcsoft.wdjava.q.a.b */
public class C1015b extends C1014a {
    /* renamed from: a */
    public int mo3278a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    /* renamed from: a */
    public Drawable mo3279a(ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    /* renamed from: a */
    public void mo3280a(Service service, int i) {
        service.stopForeground(i >= 0);
    }

    /* renamed from: a */
    public void mo3281a(Service service, int i, Notification notification) {
        service.startForeground(i, notification);
    }
}
