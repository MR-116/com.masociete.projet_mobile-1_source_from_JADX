package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.net.http.C0990o;
import java.io.File;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: fr.pcsoft.wdjava.core.context.b */
public class C0670b implements C0668g {
    /* renamed from: a */
    private byte[] f1678a = null;
    /* renamed from: b */
    private File f1679b = null;
    /* renamed from: c */
    private String f1680c = "";
    /* renamed from: d */
    private String f1681d = "";
    /* renamed from: e */
    private int f1682e = 0;

    /* renamed from: a */
    public void mo2567a() {
        this.f1681d = null;
        this.f1678a = null;
        this.f1680c = null;
        this.f1679b = null;
    }

    /* renamed from: a */
    public void m2749a(int i) {
        this.f1682e = i;
    }

    /* renamed from: a */
    public final void m2750a(File file) {
        this.f1679b = file;
    }

    /* renamed from: a */
    public void m2751a(String str) {
        this.f1681d = str;
    }

    /* renamed from: a */
    public final void m2752a(HttpsURLConnection httpsURLConnection) {
        if (this.f1682e > 0) {
            if ((this.f1682e & 2) > 0) {
                httpsURLConnection.setHostnameVerifier(C0990o.m7218g());
            }
            if (this.f1682e != 2) {
                httpsURLConnection.setSSLSocketFactory(C0990o.m7208b(this.f1682e));
            }
        }
    }

    /* renamed from: a */
    public void m2753a(byte[] bArr) {
        this.f1678a = bArr;
    }

    /* renamed from: b */
    public int m2754b() {
        return this.f1682e;
    }

    /* renamed from: b */
    public void m2755b(String str) {
        this.f1680c = str;
    }

    /* renamed from: c */
    public final File m2756c() {
        return this.f1679b;
    }

    /* renamed from: d */
    public String m2757d() {
        return this.f1680c;
    }

    /* renamed from: e */
    public void m2758e() {
        this.f1681d = "";
        this.f1678a = null;
        this.f1680c = "";
        this.f1679b = null;
    }

    /* renamed from: f */
    public byte[] m2759f() {
        return this.f1678a;
    }

    /* renamed from: g */
    public String m2760g() {
        return this.f1681d;
    }
}
