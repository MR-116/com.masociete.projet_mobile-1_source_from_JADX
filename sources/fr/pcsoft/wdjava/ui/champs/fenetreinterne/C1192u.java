package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.u */
final class C1192u implements ParcelableCompatCreatorCallbacks<C1190q> {
    C1192u() {
    }

    /* renamed from: a */
    public C1190q m8512a(Parcel parcel, ClassLoader classLoader) {
        return new C1190q(parcel, classLoader);
    }

    /* renamed from: a */
    public C1190q[] m8513a(int i) {
        return new C1190q[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m8512a(parcel, classLoader);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return m8513a(i);
    }
}
