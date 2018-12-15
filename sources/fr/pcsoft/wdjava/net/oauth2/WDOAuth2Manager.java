package fr.pcsoft.wdjava.net.oauth2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.net.C0974g;
import fr.pcsoft.wdjava.p059n.C0969g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

public class WDOAuth2Manager {
    /* renamed from: a */
    private static final String f2877a = m7301z(m7302z("qA\u001f\f"));
    /* renamed from: b */
    private static final String f2878b = m7301z(m7302z("s[\u000f\u0001\b`G\u0001\b\u0013{A\u00156\u0004}J\u001e"));
    /* renamed from: c */
    private static final String f2879c = m7301z(m7302z("qB\u0012\f\tfq\u0012\r"));
    /* renamed from: d */
    private static final String f2880d = m7301z(m7302z("aM\u0014\u0019\u0002"));
    /* renamed from: e */
    private static final String f2881e = m7301z(m7302z("qB\u0012\f\tfq\b\f\u0004`K\u000f"));
    /* renamed from: f */
    private static final String f2882f = m7301z(m7302z("PK\u001a\u001b\u0002`"));
    /* renamed from: g */
    private static final String f2883g = m7301z(m7302z("fA\u0010\f\tMZ\u0002\u0019\u0002"));
    /* renamed from: h */
    private static final String f2884h = m7301z(m7302z("wV\u000b\u0000\u0015w]$\u0000\t"));
    /* renamed from: i */
    private static final String f2885i = m7301z(m7302z("`K\u001d\u001b\u0002aF$\u001d\byK\u0015"));
    /* renamed from: j */
    private static final String f2886j = m7301z(m7302z("fA\u0010\f\tMZ\u0002\u0019\u0002"));
    /* renamed from: k */
    private static final String f2887k = m7301z(m7302z("`K\u001f\u0000\u0015wM\u000f6\u0012`G"));
    /* renamed from: l */
    private static final String f2888l = m7301z(m7302z("`K\u001d\u001b\u0002aF$\u001d\byK\u0015"));
    /* renamed from: m */
    private static final String f2889m = m7301z(m7302z("w\\\t\u0006\u0015"));
    /* renamed from: n */
    private static final String f2890n = m7301z(m7302z("{J$\u001d\byK\u0015"));
    /* renamed from: o */
    public static final String f2891o = m7301z(m7302z("Wv/;&M~:;&_}"));
    /* renamed from: p */
    private static final String f2892p = m7301z(m7302z("qA\u001f\f"));
    /* renamed from: q */
    private static final String f2893q = m7301z(m7302z("u\\\u001a\u0007\u0013MZ\u0002\u0019\u0002"));
    /* renamed from: r */
    private static final String f2894r = m7301z(m7302z("sM\u0018\f\u0014aq\u000f\u0006\fw@"));
    /* renamed from: s */
    public static final String f2895s = m7301z(m7302z("Wv/;&Mz4\"\"\\"));
    /* renamed from: t */
    private static final String f2896t = m7301z(m7302z("`K\b\u0019\b|]\u001e6\u0013k^\u001e"));
    /* renamed from: u */
    private static final String f2897u = m7301z(m7302z("Ec$:(Qe>=8]o.=/"));
    /* renamed from: v */
    private static final String f2898v = m7301z(m7302z("w\\\t\u0006\u0015"));
    /* renamed from: w */
    private static final String f2899w = m7301z(m7302z("aZ\u001a\u001d\u0002"));
    /* renamed from: x */
    private static final String f2900x = m7301z(m7302z("sM\u0018\f\u0014aq\u000f\u0006\fw@"));
    /* renamed from: z */
    private static final String[] f2901z;

    public static final class OAuth2Parameters implements Parcelable {
        public static final Creator<OAuth2Parameters> CREATOR = new C1008g();
        /* renamed from: z */
        private static final String[] f2858z = new String[]{m7258z(m7259z("1B`oWSBflZ[DswA]YmlIGCz|F]YmpXWT{eAWR")), m7258z(m7259z("`rVJzwtF|}`~")), m7258z(m7259z("acSWm")), m7258z(m7259z("at]Sm")), m7258z(m7259z("q{[FffH[G")), m7258z(m7259z("qxVF")), m7258z(m7259z("`rASg|dW||kgW")), m7258z(m7259z("q{[FffHAFk`rF")), m7258z(m7259z("1B`oWFXyfFMXsv\\ZH|lFMDbfK[Q{fM")), m7258z(m7259z("ueSM|McKSm")), m7258z(m7259z("`rTQmamWgyr\\")), m7258z(m7259z("sbFKg`~HB|{x\\|k}sW"))};
        /* renamed from: a */
        private String f2859a;
        /* renamed from: b */
        private String f2860b;
        /* renamed from: c */
        private long f2861c = 0;
        /* renamed from: d */
        private String f2862d;
        /* renamed from: e */
        private String f2863e;
        /* renamed from: f */
        private String f2864f;
        /* renamed from: g */
        private String f2865g;
        /* renamed from: h */
        private String f2866h;

        public OAuth2Parameters(Parcel parcel) {
            this.f2864f = parcel.readString();
            this.f2866h = parcel.readString();
            this.f2863e = parcel.readString();
            this.f2865g = parcel.readString();
            this.f2862d = parcel.readString();
            this.f2860b = parcel.readString();
            this.f2859a = parcel.readString();
            this.f2861c = parcel.readLong();
        }

        public OAuth2Parameters(OAuth2Parameters oAuth2Parameters) {
            this.f2864f = oAuth2Parameters.f2864f;
            this.f2866h = oAuth2Parameters.f2866h;
            this.f2863e = oAuth2Parameters.f2863e;
            this.f2865g = oAuth2Parameters.f2865g;
            this.f2862d = oAuth2Parameters.f2862d;
            this.f2860b = oAuth2Parameters.f2860b;
            this.f2859a = oAuth2Parameters.f2859a;
        }

        /* renamed from: z */
        private static String m7258z(char[] cArr) {
            int length = cArr.length;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case 0:
                        i2 = 18;
                        break;
                    case 1:
                        i2 = 23;
                        break;
                    case 2:
                        i2 = 50;
                        break;
                    case 3:
                        i2 = 35;
                        break;
                    default:
                        i2 = 8;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            return new String(cArr).intern();
        }

        /* renamed from: z */
        private static char[] m7259z(String str) {
            char[] toCharArray = str.toCharArray();
            if (toCharArray.length < 2) {
                toCharArray[0] = (char) (toCharArray[0] ^ 8);
            }
            return toCharArray;
        }

        /* renamed from: a */
        public final long m7260a() {
            return this.f2861c;
        }

        /* renamed from: a */
        public final void m7261a(String str) {
            this.f2860b = str;
        }

        /* renamed from: b */
        public final void m7262b() {
            this.f2864f = null;
            this.f2866h = null;
            this.f2863e = null;
            this.f2865g = null;
            this.f2862d = null;
            this.f2860b = null;
            this.f2859a = null;
        }

        /* renamed from: b */
        public final void m7263b(String str) {
            this.f2859a = str;
        }

        /* renamed from: c */
        public final String m7264c() {
            return this.f2866h;
        }

        /* renamed from: c */
        public final void m7265c(String str) {
            this.f2862d = str;
        }

        /* renamed from: d */
        public final String m7266d() {
            return this.f2860b;
        }

        /* renamed from: d */
        public final void m7267d(String str) {
            this.f2863e = str;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String m7268e() {
            return this.f2859a;
        }

        /* renamed from: e */
        public final void m7269e(String str) {
            this.f2866h = str;
        }

        /* renamed from: f */
        public final String m7270f() {
            return this.f2862d;
        }

        /* renamed from: f */
        public final String m7271f(String str) throws C1010i {
            Map hashMap = new HashMap();
            try {
                try {
                    hashMap.put(f2858z[4], this.f2864f != null ? this.f2864f : "");
                    try {
                        hashMap.put(f2858z[7], this.f2866h != null ? this.f2866h : "");
                        hashMap.put(f2858z[9], f2858z[10]);
                        hashMap.put(f2858z[10], str);
                        if (C0808l.m4053k(this.f2860b)) {
                            throw new C1010i(C0745b.m3222b(f2858z[8], new String[0]));
                        }
                        String str2 = this.f2860b;
                        int indexOf = str2.indexOf(63);
                        if (indexOf > 0) {
                            try {
                                if (indexOf < str2.length() - 1) {
                                    C0974g.m7039a(str2.substring(indexOf + 1), hashMap);
                                    str2 = str2.substring(0, indexOf);
                                }
                            } catch (C1010i e) {
                                throw e;
                            }
                        }
                        Builder buildUpon = Uri.parse(str2).buildUpon();
                        for (Entry entry : hashMap.entrySet()) {
                            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                        }
                        return buildUpon.build().toString();
                    } catch (C1010i e2) {
                        throw e2;
                    }
                } catch (C1010i e22) {
                    throw e22;
                }
            } catch (C1010i e222) {
                throw e222;
            }
        }

        /* renamed from: g */
        public final String m7272g() {
            return this.f2865g;
        }

        /* renamed from: g */
        public final String m7273g(String str) throws C1010i {
            Map hashMap = new HashMap();
            try {
                try {
                    hashMap.put(f2858z[4], this.f2864f != null ? this.f2864f : "");
                    try {
                        hashMap.put(f2858z[7], this.f2866h != null ? this.f2866h : "");
                        hashMap.put(f2858z[1], this.f2859a);
                        hashMap.put(f2858z[5], str);
                        hashMap.put(f2858z[9], f2858z[11]);
                        if (C0808l.m4053k(this.f2860b)) {
                            throw new C1010i(C0745b.m3222b(f2858z[8], new String[0]));
                        }
                        String str2 = this.f2860b;
                        int indexOf = str2.indexOf(63);
                        if (indexOf > 0) {
                            try {
                                if (indexOf < str2.length() - 1) {
                                    C0974g.m7039a(str2.substring(indexOf + 1), hashMap);
                                    str2 = str2.substring(0, indexOf);
                                }
                            } catch (C1010i e) {
                                throw e;
                            }
                        }
                        Builder buildUpon = Uri.parse(str2).buildUpon();
                        for (Entry entry : hashMap.entrySet()) {
                            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                        }
                        return buildUpon.build().toString();
                    } catch (C1010i e2) {
                        throw e2;
                    }
                } catch (C1010i e22) {
                    throw e22;
                }
            } catch (C1010i e222) {
                throw e222;
            }
        }

        /* renamed from: h */
        public String m7274h() {
            return this.f2863e;
        }

        /* renamed from: h */
        public void m7275h(String str) {
            this.f2864f = str;
        }

        /* renamed from: i */
        public final String m7276i() throws C1010i {
            Map hashMap = new HashMap();
            try {
                if (!C0808l.m4053k(this.f2864f)) {
                    hashMap.put(f2858z[4], this.f2864f);
                }
                try {
                    if (!C0808l.m4053k(this.f2865g)) {
                        hashMap.put(f2858z[3], this.f2865g);
                    }
                    try {
                        if (!C0808l.m4053k(this.f2859a)) {
                            hashMap.put(f2858z[1], this.f2859a);
                        }
                        try {
                            hashMap.put(f2858z[6], f2858z[5]);
                            C0974g.m7039a(this.f2863e, hashMap);
                            if (C0808l.m4053k(this.f2862d)) {
                                throw new C1010i(C0745b.m3222b(f2858z[0], new String[0]));
                            }
                            String substring;
                            Builder buildUpon;
                            String str = this.f2862d;
                            int indexOf = str.indexOf(63);
                            if (indexOf > 0) {
                                try {
                                    if (indexOf < str.length() - 1) {
                                        C0974g.m7039a(str.substring(indexOf + 1), hashMap);
                                        substring = str.substring(0, indexOf);
                                        str = (String) hashMap.get(f2858z[1]);
                                        if (!C0808l.m4053k(str)) {
                                            this.f2859a = str;
                                        }
                                        this.f2861c = System.nanoTime();
                                        hashMap.put(f2858z[2], String.valueOf(this.f2861c));
                                        buildUpon = Uri.parse(substring).buildUpon();
                                        for (Entry entry : hashMap.entrySet()) {
                                            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                                        }
                                        return buildUpon.build().toString();
                                    }
                                } catch (C1010i e) {
                                    throw e;
                                }
                            }
                            substring = str;
                            str = (String) hashMap.get(f2858z[1]);
                            try {
                                if (C0808l.m4053k(str)) {
                                    this.f2859a = str;
                                }
                                this.f2861c = System.nanoTime();
                                hashMap.put(f2858z[2], String.valueOf(this.f2861c));
                                buildUpon = Uri.parse(substring).buildUpon();
                                for (Entry entry2 : hashMap.entrySet()) {
                                    buildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
                                }
                                return buildUpon.build().toString();
                            } catch (C1010i e2) {
                                throw e2;
                            }
                        } catch (C1010i e22) {
                            throw e22;
                        }
                    } catch (C1010i e222) {
                        throw e222;
                    }
                } catch (C1010i e2222) {
                    throw e2222;
                }
            } catch (C1010i e22222) {
                throw e22222;
            }
        }

        /* renamed from: i */
        public void m7277i(String str) {
            this.f2865g = str;
        }

        /* renamed from: j */
        public final String m7278j() {
            return this.f2864f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2864f);
            parcel.writeString(this.f2866h);
            parcel.writeString(this.f2863e);
            parcel.writeString(this.f2865g);
            parcel.writeString(this.f2862d);
            parcel.writeString(this.f2860b);
            parcel.writeString(this.f2859a);
            parcel.writeLong(this.f2861c);
        }
    }

    public static final class OAuth2Token implements Parcelable {
        public static final Creator<OAuth2Token> CREATOR = new C1004c();
        /* renamed from: z */
        private static final String[] f2867z = new String[]{m7280z(m7281z("B\u0016\u001b\u001d@~'")), m7280z(m7281z("Ni;\u0000\u0000")), m7280z(m7281z("_t\"\n\u001cto0\u001f\u0017")), m7280z(m7281z("Y~/\u001d\u0017Xs\u0016\u001b\u001d@~'")), m7280z(m7281z("\b^\u001b=-{Z\u001b<;e\\\u0016=7{T\u0007<7tH\f=$nN\u001b0=jN\u001d'")), m7280z(m7281z("Nc9\u0006\u0000Nh\u0016\u0006\u001c")), m7280z(m7281z("Jx*\n\u0001XD=\u0000\u0019Nu")), m7280z(m7281z("~O\u000fBJ"))};
        /* renamed from: a */
        private int f2868a;
        /* renamed from: b */
        private String f2869b;
        /* renamed from: c */
        private String f2870c;
        /* renamed from: d */
        private byte[] f2871d;
        /* renamed from: e */
        private String f2872e;
        /* renamed from: f */
        private String f2873f;
        /* renamed from: g */
        private OAuth2Parameters f2874g;

        public OAuth2Token(Parcel parcel) {
            this.f2872e = parcel.readString();
            this.f2869b = parcel.readString();
            this.f2868a = parcel.readInt();
            this.f2873f = parcel.readString();
            this.f2870c = parcel.readString();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.f2871d = new byte[readInt];
                parcel.readByteArray(this.f2871d);
            }
            if (parcel.readInt() > 0) {
                this.f2874g = (OAuth2Parameters) parcel.readParcelable(OAuth2Parameters.class.getClassLoader());
            }
        }

        OAuth2Token(OAuth2Parameters oAuth2Parameters, String str, String str2, byte[] bArr) {
            this.f2874g = oAuth2Parameters;
            this.f2871d = bArr;
        }

        OAuth2Token(OAuth2Parameters oAuth2Parameters, byte[] bArr) throws C1010i {
            this.f2874g = oAuth2Parameters;
            this.f2871d = bArr;
            m7279a();
        }

        public OAuth2Token(OAuth2Token oAuth2Token) {
            this.f2872e = oAuth2Token.f2872e;
            this.f2869b = oAuth2Token.f2869b;
            this.f2868a = oAuth2Token.f2868a;
            this.f2873f = oAuth2Token.f2873f;
            this.f2870c = oAuth2Token.f2870c;
            this.f2871d = oAuth2Token.f2871d;
            this.f2874g = oAuth2Token.f2874g;
        }

        public OAuth2Token(String str) {
            this.f2872e = str;
        }

        /* renamed from: a */
        private final void m7279a() throws C1010i {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(new String(this.f2871d, f2867z[7]));
            } catch (UnsupportedEncodingException e) {
            }
            try {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    if (str.equalsIgnoreCase(f2867z[1])) {
                        str = jSONObject.getString(f2867z[1]);
                        if (!C0808l.m4053k(str)) {
                            throw new C1010i(str);
                        }
                    } else if (str.equalsIgnoreCase(f2867z[6])) {
                        this.f2872e = jSONObject.getString(f2867z[6]);
                    } else if (str.equalsIgnoreCase(f2867z[3])) {
                        this.f2869b = jSONObject.getString(f2867z[3]);
                    } else if (str.equalsIgnoreCase(f2867z[5])) {
                        this.f2868a = jSONObject.getInt(f2867z[5]);
                    } else if (str.equalsIgnoreCase(f2867z[0])) {
                        this.f2873f = jSONObject.getString(f2867z[0]);
                    } else if (str.equalsIgnoreCase(f2867z[2])) {
                        this.f2870c = jSONObject.getString(f2867z[2]);
                    }
                }
            } catch (UnsupportedEncodingException e2) {
                throw e2;
            } catch (UnsupportedEncodingException e22) {
                throw e22;
            } catch (UnsupportedEncodingException e222) {
                throw e222;
            } catch (UnsupportedEncodingException e2222) {
                throw e2222;
            } catch (UnsupportedEncodingException e22222) {
                throw e22222;
            } catch (UnsupportedEncodingException e222222) {
                throw e222222;
            } catch (JSONException e3) {
                throw new C1010i(C0745b.m3222b(f2867z[4], new String[0]));
            }
        }

        /* renamed from: z */
        private static String m7280z(char[] cArr) {
            int length = cArr.length;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case 0:
                        i2 = 43;
                        break;
                    case 1:
                        i2 = 27;
                        break;
                    case 2:
                        i2 = 73;
                        break;
                    case 3:
                        i2 = 111;
                        break;
                    default:
                        i2 = 114;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            return new String(cArr).intern();
        }

        /* renamed from: z */
        private static char[] m7281z(String str) {
            char[] toCharArray = str.toCharArray();
            if (toCharArray.length < 2) {
                toCharArray[0] = (char) (toCharArray[0] ^ 114);
            }
            return toCharArray;
        }

        /* renamed from: a */
        public final void m7282a(int i) {
            this.f2868a = i;
        }

        /* renamed from: a */
        public final void m7283a(String str) {
            this.f2869b = str;
        }

        /* renamed from: b */
        public String m7284b() {
            return this.f2869b;
        }

        /* renamed from: b */
        public final void m7285b(String str) {
            this.f2870c = str;
        }

        /* renamed from: c */
        public final String m7286c() {
            return this.f2873f;
        }

        /* renamed from: c */
        public final void m7287c(String str) {
            this.f2873f = str;
        }

        /* renamed from: d */
        public final String m7288d() {
            return this.f2870c;
        }

        /* renamed from: d */
        public final void m7289d(String str) {
            this.f2872e = str;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final void m7290e() {
            this.f2872e = null;
            this.f2869b = null;
            this.f2873f = null;
            this.f2870c = null;
            this.f2871d = null;
            this.f2874g = null;
        }

        /* renamed from: f */
        public final String m7291f() {
            return this.f2872e;
        }

        /* renamed from: g */
        public final OAuth2Parameters m7292g() {
            return this.f2874g;
        }

        /* renamed from: h */
        public final int m7293h() {
            return this.f2868a;
        }

        /* renamed from: i */
        public final byte[] m7294i() {
            return this.f2871d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2872e);
            parcel.writeString(this.f2869b);
            parcel.writeInt(this.f2868a);
            parcel.writeString(this.f2873f);
            parcel.writeString(this.f2870c);
            if (this.f2871d == null || this.f2871d.length <= 0) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(this.f2871d.length);
                parcel.writeByteArray(this.f2871d);
            }
            if (this.f2874g != null) {
                parcel.writeInt(1);
                parcel.writeParcelable(this.f2874g, 0);
                return;
            }
            parcel.writeInt(0);
        }
    }

    public static final class OAuthActivity extends Activity {
        /* renamed from: z */
        private static final String[] f2875z = new String[]{m7297z(m7298z("\u0017R\bV\u001b{]\u0014C\u001czF\u0007G\u0017kF\u001fK\u001e}@\nV\u0017aA")), m7297z(m7298z("qK\u001fP\u0013kV\u0019P\u001df")), m7297z(m7298z("\u0017R\u001eV\u001aq]\u001fK\u0014}P\nV\u001b{]\u0014G\u001ckP\u0004W\u0000g")), m7297z(m7298z("\u0017R\u001eV\u001aq]\u001fK\u0014}P\nV\u001b{]\u0014E\u001d{T\u0007G")), m7297z(m7298z("\u0017R\u0005L\u0007xV\u0019")), m7297z(m7298z("U}/p=]wek<@v%v|Up?k=Z=\u001dK\u0017c")), m7297z(m7298z("qK\u001fP\u0013kC\nP\u0013y@"))};
        /* renamed from: a */
        private AsyncTask<OAuth2Parameters, Void, OAuth2Token> f2876a = null;

        /* renamed from: a */
        private void m7295a() {
            try {
                startActivity(new Intent(f2875z[5], Uri.parse(((OAuth2Parameters) getIntent().getParcelableExtra(f2875z[6])).m7276i())));
            } catch (C1010i e) {
                Intent intent = new Intent();
                intent.putExtra(f2875z[1], e.getMessage());
                setResult(0, intent);
                finish();
            }
            try {
                if (this.f2876a == null) {
                    return;
                }
                if (this.f2876a.getStatus() == Status.PENDING) {
                    this.f2876a.execute(new OAuth2Parameters[]{r0});
                }
            } catch (C1010i e2) {
                throw e2;
            } catch (C1010i e22) {
                throw e22;
            }
        }

        /* renamed from: b */
        private void m7296b() {
            Intent intent = new Intent();
            intent.putExtra(f2875z[1], C0745b.m3222b(f2875z[0], new String[0]));
            setResult(0, intent);
            finish();
        }

        /* renamed from: z */
        private static String m7297z(char[] cArr) {
            int length = cArr.length;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case 0:
                        i2 = 52;
                        break;
                    case 1:
                        i2 = 19;
                        break;
                    case 2:
                        i2 = 75;
                        break;
                    case 3:
                        i2 = 2;
                        break;
                    default:
                        i2 = 82;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            return new String(cArr).intern();
        }

        /* renamed from: z */
        private static char[] m7298z(String str) {
            char[] toCharArray = str.toCharArray();
            if (toCharArray.length < 2) {
                toCharArray[0] = (char) (toCharArray[0] ^ 82);
            }
            return toCharArray;
        }

        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            CharSequence titreSuivant = WDProjet.getInstance().getTitreSuivant();
            if (titreSuivant == null) {
                titreSuivant = C0745b.m3224c(f2875z[3], new String[0]);
            }
            setTitle(titreSuivant);
            View relativeLayout = new RelativeLayout(this);
            View textView = new TextView(this);
            textView.setTextSize(21.0f);
            textView.setText(C0745b.m3224c(f2875z[2], new String[0]));
            relativeLayout.addView(textView, new LayoutParams(-1, -2));
            ((RelativeLayout.LayoutParams) textView.getLayoutParams()).addRule(10);
            View button = new Button(this);
            button.setText(C0745b.m3224c(f2875z[4], new String[0]));
            relativeLayout.addView(button, new LayoutParams(-1, -2));
            ((RelativeLayout.LayoutParams) button.getLayoutParams()).addRule(12);
            button.setOnClickListener(new C1007f(this));
            setContentView(relativeLayout);
            this.f2876a = new C1005d(this);
            m7295a();
        }

        protected void onDestroy() {
            super.onDestroy();
            if (this.f2876a != null && this.f2876a.getStatus() != Status.FINISHED) {
                this.f2876a.cancel(false);
            }
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return super.onKeyDown(i, keyEvent);
            }
            m7296b();
            return true;
        }

        protected void onStart() {
            super.onStart();
        }
    }

    static {
        String[] strArr = new String[7];
        strArr[0] = m7301z(m7302z(".k4/Y"));
        strArr[1] = m7301z(m7302z("zZ\u000f\u0019]=\u0001\u0017\u0006\u0004sB\u0013\u0006\u0014f\u0014"));
        strArr[2] = m7301z(m7302z("\"\u0000KGW<\u001e"));
        strArr[3] = m7301z(m7302z("1k);8Q|>(3[a564]m0,3Ma:<3Z"));
        strArr[4] = m7301z(m7302z("s^\u000b\u0005\u000eqO\u000f\u0000\b|\u0001\u0003D\u0010eYV\u000f\b`CV\u001c\u0015~K\u0015\n\bvK\u001f"));
        strArr[5] = m7301z(m7302z("QA\u0015\u001d\u0002|ZV=\u001ebK"));
        strArr[6] = m7301z(m7302z("Ba(="));
        f2901z = strArr;
    }

    /* renamed from: a */
    public static final synchronized OAuth2Token m7299a(OAuth2Parameters oAuth2Parameters) throws C0539d {
        OAuth2Token oAuth2Token;
        int i = 80;
        synchronized (WDOAuth2Manager.class) {
            try {
                String e = oAuth2Parameters.m7268e();
                if (C0808l.m4053k(e)) {
                    i = 9874;
                    while (!C0969g.m7018a(f2897u, f2901z[2], i, false)) {
                        i++;
                        if (i > 65536) {
                            throw new C1010i(C0745b.m3222b(f2901z[3], new String[0]));
                        }
                    }
                    oAuth2Parameters.m7263b(f2901z[1] + i);
                } else {
                    int d;
                    int lastIndexOf = e.lastIndexOf(":");
                    if (lastIndexOf > 0) {
                        if (e.length() > lastIndexOf + 1) {
                            d = C0725i.m3064d(e.substring(lastIndexOf + 1));
                            if (d >= 0) {
                                i = d;
                            }
                            if (!C0969g.m7018a(f2897u, f2901z[2], i, false)) {
                                throw new C1010i(C0745b.m3222b(f2901z[3], new String[0]));
                            }
                        }
                    }
                    d = 80;
                    if (d >= 0) {
                        i = d;
                    }
                    if (C0969g.m7018a(f2897u, f2901z[2], i, false)) {
                        throw new C1010i(C0745b.m3222b(f2901z[3], new String[0]));
                    }
                }
                C0969g.m7011a(f2897u, 3, f2901z[0]);
                ic c1009h = new C1009h(oAuth2Parameters);
                try {
                    c1009h.m1795g();
                } catch (Throwable e2) {
                    if (e2 instanceof C1010i) {
                        throw ((C1010i) e2);
                    }
                    WDErreurManager.m2888b(e2);
                } catch (Exception e3) {
                    throw e3;
                }
                oAuth2Token = (OAuth2Token) c1009h.m1792d();
                if (C0969g.m7015a(f2897u)) {
                    C0969g.m7023d(f2897u);
                }
            } catch (Exception e32) {
                throw e32;
            } catch (Exception e322) {
                throw e322;
            } catch (Exception e3222) {
                throw e3222;
            } catch (Exception e32222) {
                throw e32222;
            } catch (Throwable th) {
                if (C0969g.m7015a(f2897u)) {
                    C0969g.m7023d(f2897u);
                }
            }
        }
        return oAuth2Token;
    }

    /* renamed from: a */
    public static final synchronized OAuth2Token m7300a(OAuth2Token oAuth2Token) throws C0539d {
        OAuth2Token oAuth2Token2;
        Throwable th;
        IOException iOException;
        HttpURLConnection httpURLConnection = null;
        synchronized (WDOAuth2Manager.class) {
            String b = oAuth2Token.m7284b();
            try {
                if (C0808l.m4053k(b)) {
                    oAuth2Token2 = null;
                } else {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(oAuth2Token.m7292g().m7271f(b)).openConnection();
                        try {
                            httpURLConnection2.setRequestMethod(f2901z[6]);
                            httpURLConnection2.setRequestProperty(f2901z[5], f2901z[4]);
                            if (httpURLConnection2.getResponseCode() != C0607n.Dt) {
                                throw new C1010i(bb.m3843a(httpURLConnection2.getErrorStream()));
                            }
                            OAuth2Token oAuth2Token3 = new OAuth2Token(oAuth2Token.m7292g(), bb.m3846b(httpURLConnection2.getInputStream()));
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            oAuth2Token2 = oAuth2Token3;
                        } catch (IOException e) {
                            throw e;
                        } catch (IOException e2) {
                            IOException iOException2 = e2;
                            httpURLConnection = httpURLConnection2;
                            iOException = iOException2;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            httpURLConnection = httpURLConnection2;
                            th = th3;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        iOException = e3;
                        try {
                            throw new C1010i(iOException.getMessage());
                        } catch (Throwable th4) {
                            th = th4;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                }
            } catch (IOException iOException3) {
                throw iOException3;
            } catch (IOException iOException32) {
                throw iOException32;
            } catch (IOException iOException322) {
                throw iOException322;
            }
        }
        return oAuth2Token2;
    }

    /* renamed from: z */
    private static String m7301z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 18;
                    break;
                case 1:
                    i2 = 46;
                    break;
                case 2:
                    i2 = 123;
                    break;
                case 3:
                    i2 = 105;
                    break;
                default:
                    i2 = 103;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7302z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 103);
        }
        return toCharArray;
    }
}
