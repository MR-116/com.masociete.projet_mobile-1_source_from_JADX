package fr.pcsoft.wdjava.net.oauth2;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Parameters;

/* renamed from: fr.pcsoft.wdjava.net.oauth2.g */
final class C1008g implements Creator<OAuth2Parameters> {
    C1008g() {
    }

    /* renamed from: a */
    public OAuth2Parameters m7319a(Parcel parcel) {
        return new OAuth2Parameters(parcel);
    }

    /* renamed from: a */
    public OAuth2Parameters[] m7320a(int i) {
        return new OAuth2Parameters[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7319a(parcel);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return m7320a(i);
    }
}
