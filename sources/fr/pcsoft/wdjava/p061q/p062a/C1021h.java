package fr.pcsoft.wdjava.p061q.p062a;

import android.app.Activity;
import android.graphics.Point;
import fr.pcsoft.wdjava.ui.activite.C1056i;

/* renamed from: fr.pcsoft.wdjava.q.a.h */
public class C1021h extends C1020g {
    /* renamed from: a */
    public Point mo3295a(boolean z) {
        if (!z) {
            return super.mo3295a(z);
        }
        Point point = new Point();
        Activity a = C1056i.m7562a();
        if (a == null) {
            return point;
        }
        a.getWindowManager().getDefaultDisplay().getRealSize(point);
        return point;
    }
}
