package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import fr.pcsoft.wdjava.ui.p069g.C1203e;
import fr.pcsoft.wdjava.ui.p069g.C1409j;
import fr.pcsoft.wdjava.ui.utils.C1508i;

/* renamed from: fr.pcsoft.wdjava.ui.champs.groupeoptions.m */
final class C1205m extends PopupWindow {
    /* renamed from: a */
    private final int f3616a = C1409j.f4188e;
    /* renamed from: b */
    private ImageView f3617b;
    /* renamed from: c */
    private C1203e f3618c;
    /* renamed from: d */
    private Drawable f3619d = null;
    /* renamed from: e */
    private int[] f3620e = new int[2];
    final C0500n this$0;

    public C1205m(C0500n c0500n, Context context) {
        this.this$0 = c0500n;
        super(context);
        setBackgroundDrawable(new ColorDrawable(0));
        setTouchable(false);
        setFocusable(false);
        setOutsideTouchable(false);
        setAnimationStyle(0);
        setClippingEnabled(false);
        setWindowLayoutMode(-2, -2);
        this.f3617b = new ImageView(context);
        setContentView(this.f3617b);
        this.f3618c = new C1204l(this, C1409j.f4188e, this.f3617b, c0500n);
    }

    static int[] access$000(C1205m c1205m) {
        return c1205m.f3620e;
    }

    static void access$100(C1205m c1205m) {
        c1205m.m8536d();
    }

    /* renamed from: d */
    private void m8536d() {
        int[] iArr;
        View composant = this.this$0.getComposant();
        composant.getLocationOnScreen(this.f3620e);
        Rect bounds = this.f3619d.getBounds();
        if (this.this$0.f909m.isCocheADroite()) {
            int[] iArr2 = this.f3620e;
            iArr2[0] = (composant.getWidth() - bounds.width()) + iArr2[0];
        } else {
            iArr = this.f3620e;
            iArr[0] = iArr[0] + bounds.left;
        }
        iArr = this.f3620e;
        iArr[1] = bounds.top + iArr[1];
    }

    /* renamed from: a */
    public void m8537a() {
        dismiss();
        this.f3617b = null;
        if (this.f3618c != null) {
            this.f3618c.m8534d();
            this.f3618c = null;
        }
        this.f3619d = null;
    }

    /* renamed from: a */
    public final void m8538a(Drawable drawable, Drawable drawable2, boolean z) {
        Drawable a = C1508i.m10480a(drawable);
        Drawable a2 = C1508i.m10480a(drawable2);
        this.f3619d = a;
        this.f3617b.setImageDrawable(a);
        this.f3618c.m8531a(!z);
        m8536d();
        showAtLocation(this.this$0.getComposant(), 0, this.f3620e[0], this.f3620e[1]);
        this.f3618c.m8530a(this.this$0);
        this.f3618c.m8529a(a2);
    }

    /* renamed from: b */
    public final C1203e m8539b() {
        return this.f3618c;
    }

    /* renamed from: c */
    public void m8540c() {
        if (this.f3618c != null) {
            this.f3618c.m8527a();
        }
    }

    /* renamed from: e */
    public final Drawable m8541e() {
        return this.f3619d;
    }
}
