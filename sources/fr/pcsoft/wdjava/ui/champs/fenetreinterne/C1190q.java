package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.ParcelableCompat;
import android.view.View.BaseSavedState;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.q */
public class C1190q extends BaseSavedState {
    /* renamed from: c */
    public static final Creator<C1190q> f3595c = ParcelableCompat.newCreator(new C1192u());
    /* renamed from: z */
    private static final String[] f3596z = new String[]{C1190q.m8510z(C1190q.m8511z("&M\u000f\r\u001b\u0005Q\u001a:\u0017\u0007Z\u001cD%\u0001I\u000b\u000e%\u0014^\u001a\u000f\r")), C1190q.m8510z(C1190q.m8511z("@O\u0001\u0019\u001f\u0014V\u0001\u0004K"))};
    /* renamed from: a */
    int f3597a;
    /* renamed from: b */
    ClassLoader f3598b;
    /* renamed from: d */
    Parcelable f3599d;

    C1190q(Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.f3597a = parcel.readInt();
        this.f3599d = parcel.readParcelable(classLoader);
        this.f3598b = classLoader;
    }

    public C1190q(Parcelable parcelable) {
        super(parcelable);
    }

    /* renamed from: z */
    private static String m8510z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 96;
                    break;
                case 1:
                    i2 = 63;
                    break;
                case 2:
                    i2 = 110;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8511z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 118);
        }
        return toCharArray;
    }

    public String toString() {
        return f3596z[0] + Integer.toHexString(System.identityHashCode(this)) + f3596z[1] + this.f3597a + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3597a);
        parcel.writeParcelable(this.f3599d, i);
    }
}
