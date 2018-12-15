package fr.pcsoft.wdjava.ui.champs.slidingmenu.p070a;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.a.n */
final class C1272n implements Creator<C1259b> {
    C1272n() {
    }

    /* renamed from: a */
    public C1259b m8903a(Parcel parcel) {
        return new C1259b(parcel, null);
    }

    /* renamed from: a */
    public C1259b[] m8904a(int i) {
        return new C1259b[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8903a(parcel);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return m8904a(i);
    }
}
