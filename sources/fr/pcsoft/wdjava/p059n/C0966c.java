package fr.pcsoft.wdjava.p059n;

import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: fr.pcsoft.wdjava.n.c */
public class C0966c extends C0965a {
    /* renamed from: z */
    private static final String[] f2705z = new String[]{C0966c.m6966z(C0966c.m6967z("X[\nEy>\\\u001aO|-I\tOv>")), C0966c.m6966z(C0966c.m6967z("K&u(\u0002U8"))};
    /* renamed from: f */
    private Socket f2706f = null;

    public C0966c(int i, String str, int i2) throws IOException {
        if (str.equals("")) {
            str = f2705z[1];
        }
        this.f2706f = new Socket();
        this.f2706f.setReuseAddress(C0969g.f2717b);
        this.f2706f.setTcpNoDelay(C0969g.f2716a);
        this.f2706f.connect(new InetSocketAddress(str, i), i2);
    }

    public C0966c(Socket socket) {
        this.f2706f = socket;
    }

    /* renamed from: z */
    private static String m6966z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 123;
                    break;
                case 1:
                    i2 = 8;
                    break;
                case 2:
                    i2 = 69;
                    break;
                case 3:
                    i2 = 6;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6967z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 50);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public OutputStream mo3241a() throws IOException {
        try {
            if (this.d == null) {
                if (this.f2706f != null) {
                    this.d = this.f2706f.getOutputStream();
                }
            }
            return this.d;
        } catch (IOException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public InputStream mo3242b() throws IOException {
        try {
            if (this.e == null) {
                if (this.f2706f != null) {
                    this.e = this.f2706f.getInputStream();
                }
            }
            return this.e;
        } catch (IOException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public void mo3243b(int i) throws SocketException {
        try {
            if (this.f2706f != null) {
                this.f2706f.setSoTimeout(i);
            }
        } catch (SocketException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public boolean mo3244c() throws IOException {
        try {
            return this.f2706f != null;
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public C0966c mo3245d() throws IOException {
        throw new SocketException(C0745b.m3222b(f2705z[0], new String[0]));
    }

    /* renamed from: d */
    public boolean mo3246d(int i) throws IOException {
        throw new SocketException(C0745b.m3222b(f2705z[0], new String[0]));
    }

    /* renamed from: e */
    public String mo3247e() {
        return this.f2706f != null ? this.f2706f.getInetAddress().getHostAddress() : "0";
    }

    /* renamed from: f */
    public int mo3248f() {
        return this.f2706f != null ? this.f2706f.getPort() : -1;
    }

    /* renamed from: g */
    public synchronized void mo3249g() throws IOException {
        try {
            super.mo3249g();
            if (this.f2706f != null) {
                this.f2706f.close();
            }
        } catch (IOException e) {
            throw e;
        }
        return;
    }

    /* renamed from: h */
    public void mo3250h() {
        super.mo3250h();
        this.f2706f = null;
    }

    /* renamed from: j */
    public boolean mo3251j() throws IOException {
        return true;
    }
}
