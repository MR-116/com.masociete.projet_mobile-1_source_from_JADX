package fr.pcsoft.wdjava.p059n;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;

/* renamed from: fr.pcsoft.wdjava.n.a */
public abstract class C0965a {
    /* renamed from: c */
    private static final int f2699c = 4096;
    /* renamed from: z */
    private static final String[] f2700z = new String[]{C0965a.m6948z(C0965a.m6949z("(]p\u001a\u000fNZ`\u0010\n]Os\u0010\u0000N")), C0965a.m6948z(C0965a.m6949z("(]p\u001a\u000fNZ`\u0015\r_Qr\u0018\u0016Z[z\f\u0016THv\u0017")), C0965a.m6948z(C0965a.m6949z("\u0006\u0004")), C0965a.m6948z(C0965a.m6949z("Fa[<dok\u001f-6j`L4-x}V6*+gQ/%gg[<")), C0965a.m6948z(C0965a.m6949z("7Kp\u001fz"))};
    /* renamed from: a */
    protected String f2701a = f2700z[4];
    /* renamed from: b */
    protected int f2702b = 1;
    /* renamed from: d */
    protected OutputStream f2703d = null;
    /* renamed from: e */
    protected InputStream f2704e = null;

    /* renamed from: a */
    private byte[] m6945a(boolean z) throws IOException {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            InputStream b = mo3242b();
            if (b == null) {
                throw new SocketException(C0745b.m3222b(f2700z[0], new String[0]));
            }
            BufferedInputStream bufferedInputStream;
            int i;
            int i2;
            if (z) {
                bufferedInputStream = new BufferedInputStream(b);
            } else if (b instanceof BufferedInputStream) {
                bufferedInputStream = (BufferedInputStream) b;
            } else {
                InputStream bufferedInputStream2 = new BufferedInputStream(b);
                this.f2704e = bufferedInputStream2;
                InputStream inputStream = bufferedInputStream2;
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Object obj = new byte[4096];
            Object obj2 = null;
            int i3 = 0;
            Object k = C0725i.m3082k(this.f2701a);
            byte b2 = k[0];
            Object obj3 = null;
            bufferedInputStream.mark(4096);
            while (true) {
                int read = bufferedInputStream.read(obj, 0, 4096);
                if (read >= 0) {
                    Object obj4;
                    Object obj5;
                    byte b3 = b2;
                    int i4 = i3;
                    Object obj6 = obj2;
                    i = 0;
                    while (i < read) {
                        try {
                            if (obj[i] == b3) {
                                i4++;
                                if (i4 >= k.length) {
                                    obj3 = 1;
                                    if (i < read - 1) {
                                        if (z) {
                                            System.arraycopy(obj, 0, new byte[read], 0, read);
                                            WDErreurManager.m2883a(C0745b.m3222b(f2700z[1], C0725i.m3061c(r10)));
                                        }
                                        bufferedInputStream.reset();
                                        bufferedInputStream.skip((long) (i + 1));
                                        i2 = i4;
                                        obj4 = 1;
                                        bufferedInputStream.mark(4096);
                                        if (obj4 == null) {
                                            break;
                                        }
                                        if (i2 > 0) {
                                            obj2 = new byte[i2];
                                            System.arraycopy(k, 0, obj2, 0, i2);
                                        } else {
                                            obj2 = obj6;
                                        }
                                        byteArrayOutputStream2.write(obj, 0, Math.max(0, read - i2));
                                        i3 = i2;
                                        obj3 = obj4;
                                        b2 = b3;
                                    }
                                    obj5 = obj3;
                                    i2 = i4;
                                    obj4 = obj5;
                                    bufferedInputStream.mark(4096);
                                    if (obj4 == null) {
                                        break;
                                    }
                                    if (i2 > 0) {
                                        obj2 = obj6;
                                    } else {
                                        obj2 = new byte[i2];
                                        System.arraycopy(k, 0, obj2, 0, i2);
                                    }
                                    byteArrayOutputStream2.write(obj, 0, Math.max(0, read - i2));
                                    i3 = i2;
                                    obj3 = obj4;
                                    b2 = b3;
                                } else {
                                    b3 = k[i4];
                                }
                            } else if (i4 > 0) {
                                if (obj6 != null) {
                                    byteArrayOutputStream2.write(obj6);
                                    obj6 = null;
                                }
                                i4 = 0;
                                b3 = k[0];
                            }
                            i++;
                        } catch (IOException e) {
                            throw e;
                        } catch (IOException e2) {
                            throw e2;
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                    obj5 = obj3;
                    i2 = i4;
                    obj4 = obj5;
                    bufferedInputStream.mark(4096);
                    if (obj4 == null) {
                        break;
                    }
                    if (i2 > 0) {
                        obj2 = new byte[i2];
                        System.arraycopy(k, 0, obj2, 0, i2);
                    } else {
                        obj2 = obj6;
                    }
                    byteArrayOutputStream2.write(obj, 0, Math.max(0, read - i2));
                    i3 = i2;
                    obj3 = obj4;
                    b2 = b3;
                }
                break;
            }
            byteArrayOutputStream2.write(obj, 0, Math.max(0, (i - i2) + 1));
            byte[] toByteArray = byteArrayOutputStream2.toByteArray();
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException e22) {
                    throw e22;
                }
            }
            return toByteArray;
        } catch (IOException e222) {
            throw e222;
        } catch (Throwable th3) {
            th = th3;
        }
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e2222) {
                throw e2222;
            }
        }
        throw th;
    }

    /* renamed from: c */
    private byte[] m6946c(int i) throws IOException {
        if (i <= 0) {
            return null;
        }
        InputStream b = mo3242b();
        if (b == null) {
            try {
                throw new SocketException(C0745b.m3222b(f2700z[0], new String[0]));
            } catch (IOException e) {
                throw e;
            }
        }
        Object obj = new byte[i];
        int read = b.read(obj, 0, i);
        if (read < 0) {
            return null;
        }
        if (read >= i) {
            return obj;
        }
        Object obj2 = new byte[read];
        System.arraycopy(obj, 0, obj2, 0, read);
        return obj2;
    }

    /* renamed from: i */
    private byte[] m6947i() throws IOException {
        int i = 0;
        InputStream b = mo3242b();
        if (b == null) {
            try {
                throw new SocketException(C0745b.m3222b(f2700z[0], new String[0]));
            } catch (IOException e) {
                throw e;
            }
        } else {
            DataInputStream dataInputStream = new DataInputStream(b);
            String readLine = dataInputStream.readLine();
            if (readLine != null) {
                i = C0725i.m3064d(readLine);
            }
            mo3243b(0);
            byte[] bArr = new byte[i];
            dataInputStream.readFully(bArr, 0, i);
            return bArr;
        }
    }

    /* renamed from: z */
    private static String m6948z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 14;
                    break;
                case 2:
                    i2 = 63;
                    break;
                case 3:
                    i2 = 89;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6949z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 68);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public abstract OutputStream mo3241a() throws IOException;

    /* renamed from: a */
    public void mo3252a(int i) {
        this.f2702b = i;
    }

    /* renamed from: a */
    public void m6952a(String str) {
        this.f2701a = str;
    }

    /* renamed from: a */
    public void mo3253a(byte[] bArr) throws IOException {
        try {
            if (mo3244c()) {
                OutputStream a = mo3241a();
                if (a == null) {
                    try {
                        throw new SocketException(C0745b.m3222b(f2700z[0], new String[0]));
                    } catch (IOException e) {
                        throw e;
                    }
                }
                switch (this.f2702b) {
                    case 0:
                    case 2:
                        a.write(bArr);
                        a.write(C0725i.m3082k(this.f2701a));
                        a.flush();
                        return;
                    case 1:
                        a.write(C0725i.m3082k(String.valueOf(bArr.length) + f2700z[2]));
                        a.write(bArr);
                        a.flush();
                        return;
                    case 3:
                        a.write(bArr);
                        a.flush();
                        return;
                    default:
                        throw new SocketException(f2700z[3]);
                }
            }
            throw new SocketException(C0745b.m3222b(f2700z[0], new String[0]));
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void mo3254a(byte[] bArr, String str, int i) throws IOException {
    }

    /* renamed from: a */
    public byte[] mo3255a(int i, int i2) throws IOException {
        try {
            mo3243b(i);
            if (mo3244c()) {
                try {
                    switch (this.f2702b) {
                        case 0:
                            return m6945a(true);
                        case 1:
                            return m6947i();
                        case 2:
                            return m6945a(false);
                        case 3:
                            return m6946c(i2);
                        default:
                            throw new SocketException(f2700z[3]);
                    }
                } catch (IOException e) {
                    throw e;
                }
                throw e;
            }
            throw new SocketException(C0745b.m3222b(f2700z[0], new String[0]));
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public abstract InputStream mo3242b() throws IOException;

    /* renamed from: b */
    public abstract void mo3243b(int i) throws SocketException;

    /* renamed from: c */
    public abstract boolean mo3244c() throws IOException;

    /* renamed from: d */
    public abstract C0966c mo3245d() throws IOException;

    /* renamed from: d */
    public abstract boolean mo3246d(int i) throws IOException;

    /* renamed from: e */
    public abstract String mo3247e();

    /* renamed from: f */
    public abstract int mo3248f();

    /* renamed from: g */
    public synchronized void mo3249g() throws IOException {
        if (this.f2704e != null) {
            try {
                this.f2704e.close();
            } catch (IOException e) {
            }
            this.f2704e = null;
        }
        if (this.f2703d != null) {
            try {
                this.f2703d.close();
            } catch (IOException e2) {
            }
            this.f2703d = null;
        }
    }

    /* renamed from: h */
    public void mo3250h() {
        this.f2701a = null;
        this.f2704e = null;
        this.f2703d = null;
    }

    /* renamed from: j */
    public abstract boolean mo3251j() throws IOException;
}
