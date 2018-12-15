package fr.pcsoft.wdjava.net.oauth2;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fr.pcsoft.wdjava.net.oauth2.WDOAuth2Manager.OAuth2Token;

/* renamed from: fr.pcsoft.wdjava.net.oauth2.c */
final class C1004c implements Creator<OAuth2Token> {
    C1004c() {
    }

    /* renamed from: a */
    public OAuth2Token m7310a(Parcel parcel) {
        return new OAuth2Token(parcel);
    }

    /* renamed from: a */
    public OAuth2Token[] m7311a(int i) {
        return new OAuth2Token[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7310a(parcel);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return m7311a(i);
    }
}
