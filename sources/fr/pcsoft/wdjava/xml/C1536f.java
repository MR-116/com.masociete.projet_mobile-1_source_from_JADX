package fr.pcsoft.wdjava.xml;

/* renamed from: fr.pcsoft.wdjava.xml.f */
public class C1536f {
    /* renamed from: b */
    private static final String f4704b = "";
    /* renamed from: e */
    private static final boolean f4705e = false;
    /* renamed from: f */
    private static final String f4706f = "";
    /* renamed from: a */
    private final String f4707a;
    /* renamed from: c */
    private final String f4708c;
    /* renamed from: d */
    private final String f4709d;

    public C1536f(String str) {
        this("", str, "");
    }

    public C1536f(String str, String str2) {
        this(str, str2, "");
    }

    public C1536f(String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        this.f4709d = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f4707a = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f4708c = str3;
    }

    /* renamed from: a */
    public final String m10725a() {
        return this.f4709d;
    }

    /* renamed from: b */
    public final String m10726b() {
        return this.f4708c;
    }

    /* renamed from: c */
    public final String m10727c() {
        return this.f4707a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1536f)) {
            return false;
        }
        C1536f c1536f = (C1536f) obj;
        return this.f4709d.equalsIgnoreCase(c1536f.f4709d) && this.f4707a.equalsIgnoreCase(c1536f.f4707a);
    }

    public int hashCode() {
        return this.f4709d.toLowerCase().hashCode() ^ this.f4707a.toLowerCase().hashCode();
    }
}
