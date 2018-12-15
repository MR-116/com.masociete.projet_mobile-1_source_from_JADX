package fr.pcsoft.wdjava.geo.p056a;

import android.location.LocationManager;
import fr.pcsoft.wdjava.core.utils.ic;

/* renamed from: fr.pcsoft.wdjava.geo.a.e */
class C0914e extends ic {
    final C0911b this$0;
    final LocationManager val$manager;

    C0914e(C0911b c0911b, LocationManager locationManager) {
        this.this$0 = c0911b;
        this.val$manager = locationManager;
    }

    static void access$200(C0914e c0914e, Object obj) {
        c0914e.m1787a(obj);
    }

    /* renamed from: c */
    protected void mo2434c() {
        this.this$0.f2491f = new C0913d(this);
        this.val$manager.requestLocationUpdates(this.this$0.m6503h(), 0, 0.0f, this.this$0.f2491f);
    }
}
