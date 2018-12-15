package fr.pcsoft.wdjava.ui.p072i;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.p065b.C1097h;
import fr.pcsoft.wdjava.ui.p065b.C1099j;
import java.util.HashMap;

/* renamed from: fr.pcsoft.wdjava.ui.i.b */
class C1432b extends C1097h {
    final C1434f this$1;
    final C1306c val$callback;
    final C0520c val$champImage;

    C1432b(C1434f c1434f, C1099j c1099j, C0520c c0520c, C1306c c1306c) {
        this.this$1 = c1434f;
        this.val$champImage = c0520c;
        this.val$callback = c1306c;
        super(c1099j);
    }

    /* renamed from: a */
    protected void mo3468a(Drawable drawable) {
        super.mo3468a(drawable);
        if (!isCancelled() && !this.val$champImage.isReleased()) {
            if (C1434f.access$200(this.this$1) == null) {
                C1434f.access$202(this.this$1, new HashMap(2));
            }
            C1434f.access$200(this.this$1).put(((gc) this.val$champImage).getName(), drawable);
            C1434f.access$302(this.this$1, false);
            int a = this.this$1.this$0.m10056a(this.this$1);
            if (a >= 0 && this.val$callback != null) {
                this.val$callback.mo3570a(a);
            }
        }
    }

    /* renamed from: a */
    protected void mo3469a(ProgressBar progressBar) {
    }

    /* renamed from: b */
    protected void mo3470b() {
        super.mo3470b();
        C1434f.access$100(this.this$1, this);
    }

    /* renamed from: b */
    protected void mo3471b(ProgressBar progressBar) {
    }

    protected /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        mo3468a((Drawable) obj);
    }
}
