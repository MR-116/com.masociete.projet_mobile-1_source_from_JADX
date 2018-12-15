package fr.pcsoft.wdjava.geo.p056a;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: fr.pcsoft.wdjava.geo.a.d */
class C0913d implements LocationListener {
    final C0914e this$1;

    C0913d(C0914e c0914e) {
        this.this$1 = c0914e;
    }

    public void onLocationChanged(Location location) {
        C0914e.access$200(this.this$1, location);
        this.this$1.m1784a();
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
