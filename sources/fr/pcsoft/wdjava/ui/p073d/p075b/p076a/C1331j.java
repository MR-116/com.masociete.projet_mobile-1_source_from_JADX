package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.utils.tb;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.j */
class C1331j extends tb {
    /* renamed from: c */
    int f3966c = -1;
    final C1322a this$0;

    public C1331j(C1322a c1322a, int i) {
        this.this$0 = c1322a;
        super(i);
    }

    /* renamed from: c */
    public void mo3675c() {
        int t = this.this$0.mo3652t();
        try {
            int i;
            long max;
            int i2;
            if (this.f3966c != -1) {
                this.this$0.mo3638a(this.f3966c, true);
                i = this.f3966c;
                max = (long) (((double) Math.max(1000, this.this$0.f)) * 1.5d);
                this.this$0.d.m3662a(this.this$0.e, true, false, max, 0);
                i2 = i;
            } else if (this.this$0.d.m3661a(this.this$0.e, true, false, (long) PlaybackStateCompat.ACTION_PREPARE)) {
                this.this$0.f = 1;
                i = this.this$0.mo3652t();
                max = 1000;
                this.this$0.d.m3662a(this.this$0.e, true, false, 1000, 0);
                i2 = i;
            } else {
                this.this$0.f = 0;
                this.this$0.m9384N();
                this.this$0.mo3664f(0);
                if (t != -1) {
                    this.this$0.mo3638a(t, false);
                    return;
                }
                return;
            }
            if (this.this$0.d.m3599B()) {
                this.this$0.mo3638a(i2, false);
                i = 0;
                while (true) {
                    i2 = this.this$0.d.m3662a(this.this$0.e, true, false, 1, 0) ? i + 1 : i;
                    if (this.this$0.d.m3599B()) {
                        break;
                    }
                    i = i2;
                }
                this.this$0.m9384N();
                C1322a.access$2712(this.this$0, i2);
            } else {
                C1322a.access$2814(this.this$0, max);
                this.this$0.mo3641c(this.f3966c);
                this.f3966c = this.this$0.mo3652t();
            }
            this.this$0.mo3664f(this.this$0.m9391J());
            if (t != -1) {
                this.this$0.mo3638a(t, false);
            }
        } catch (WDException e) {
            throw e;
        } catch (Throwable th) {
            if (t != -1) {
                try {
                    this.this$0.mo3638a(t, false);
                } catch (WDException e2) {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: d */
    protected void mo3676d() {
        super.mo3676d();
        if (this.f3966c >= 0) {
            try {
                this.this$0.mo3641c(this.f3966c);
            } catch (WDException e) {
            }
        }
    }
}
