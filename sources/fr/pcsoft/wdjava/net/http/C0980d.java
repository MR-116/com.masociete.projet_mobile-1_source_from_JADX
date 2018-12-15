package fr.pcsoft.wdjava.net.http;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: fr.pcsoft.wdjava.net.http.d */
public class C0980d extends C0979c {
    /* renamed from: z */
    private static final String[] f2780z = new String[]{C0980d.m7113z(C0980d.m7114z("Y M3:fyT7\u0018\u001b7V\"AY<\u00198\u0014W5")), C0980d.m7113z(C0980d.m7114z("Z)I:\bX8M?\u000eUvV5\u0015^-\u0014%\u0015I<X;")), C0980d.m7113z(C0980d.m7114z("Y0W7\u0013B"))};
    /* renamed from: d */
    private final String f2781d;
    /* renamed from: e */
    private final byte[] f2782e;
    final C0994s this$0;

    public C0980d(C0994s c0994s, byte[] bArr, String str) {
        this(c0994s, bArr, f2780z[1], str);
    }

    public C0980d(C0994s c0994s, byte[] bArr, String str, String str2) {
        this.this$0 = c0994s;
        super(str);
        if (bArr == null) {
            throw new IllegalArgumentException(f2780z[0]);
        }
        this.f2782e = bArr;
        this.f2781d = str2;
    }

    /* renamed from: z */
    private static String m7113z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 59;
                    break;
                case 1:
                    i2 = 89;
                    break;
                case 2:
                    i2 = 57;
                    break;
                case 3:
                    i2 = 86;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7114z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 97);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3265a() {
        return this.f2781d;
    }

    /* renamed from: a */
    public void mo3266a(OutputStream outputStream) throws IOException {
        outputStream.write(this.f2782e);
    }

    /* renamed from: b */
    public long mo3267b() {
        return (long) this.f2782e.length;
    }

    /* renamed from: c */
    public String mo3268c() {
        return null;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ String mo3262d() {
        return super.mo3262d();
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ String mo3263e() {
        return super.mo3263e();
    }

    /* renamed from: f */
    public String mo3269f() {
        return f2780z[2];
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ String mo3264g() {
        return super.mo3264g();
    }
}
