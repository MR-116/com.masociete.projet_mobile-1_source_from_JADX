package fr.pcsoft.wdjava.ui.p080h;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.p032m.C0938m;

/* renamed from: fr.pcsoft.wdjava.ui.h.c */
final class C1421c extends ClickableSpan {
    /* renamed from: a */
    private boolean f4199a;
    /* renamed from: b */
    private final String f4200b;
    /* renamed from: c */
    private final WDCallback f4201c;

    public C1421c(WDCallback wDCallback, String str, boolean z) {
        this.f4201c = wDCallback;
        this.f4200b = str;
        this.f4199a = z;
    }

    static WDCallback access$000(C1421c c1421c) {
        return c1421c.f4201c;
    }

    static String access$100(C1421c c1421c) {
        return c1421c.f4200b;
    }

    public void onClick(View view) {
        C0938m.m6816c().post(new C1420b(this));
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.f4199a) {
            super.updateDrawState(textPaint);
        }
    }
}
