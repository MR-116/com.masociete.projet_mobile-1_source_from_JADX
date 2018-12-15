package fr.pcsoft.wdjava.ui.champs.slidingmenu.p070a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* renamed from: fr.pcsoft.wdjava.ui.champs.slidingmenu.a.b */
public class C1259b extends BaseSavedState {
    /* renamed from: b */
    public static final Creator<C1259b> f3717b = new C1272n();
    /* renamed from: a */
    private final int f3718a;

    private C1259b(Parcel parcel) {
        super(parcel);
        this.f3718a = parcel.readInt();
    }

    C1259b(Parcel parcel, C1268k c1268k) {
        this(parcel);
    }

    public C1259b(Parcelable parcelable, int i) {
        super(parcelable);
        this.f3718a = i;
    }

    /* renamed from: a */
    public int m8756a() {
        return this.f3718a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3718a);
    }
}
