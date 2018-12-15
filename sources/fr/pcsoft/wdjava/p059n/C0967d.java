package fr.pcsoft.wdjava.p059n;

import fr.pcsoft.wdjava.core.debug.C0691a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/* renamed from: fr.pcsoft.wdjava.n.d */
public class C0967d extends C0965a {
    /* renamed from: z */
    private static final String f2707z = C0967d.m6979z(C0967d.m6980z("G\u0016`\u0010~gfCUid#QEilfAE;z¯IUx}#PB;m#\u0005Ctj-@D5"));
    /* renamed from: f */
    private Selector f2708f = null;
    /* renamed from: g */
    private Socket f2709g = null;
    /* renamed from: h */
    private ServerSocket f2710h = null;

    public C0967d(int i, String str) throws IOException {
        ServerSocketChannel open = ServerSocketChannel.open();
        open.configureBlocking(false);
        SocketAddress inetSocketAddress = new InetSocketAddress(InetAddress.getByName(str), i);
        this.f2710h = open.socket();
        this.f2710h.setReuseAddress(C0969g.f2717b);
        this.f2710h.bind(inetSocketAddress);
        this.f2708f = Selector.open();
        open.register(this.f2708f, 16);
    }

    /* renamed from: z */
    private static String m6979z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 9;
                    break;
                case 1:
                    i2 = 70;
                    break;
                case 2:
                    i2 = 37;
                    break;
                case 3:
                    i2 = 48;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6980z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 27);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public OutputStream mo3241a() throws IOException {
        try {
            if (this.d == null) {
                if (this.f2709g != null) {
                    this.d = this.f2709g.getOutputStream();
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
                if (this.f2709g != null) {
                    this.e = this.f2709g.getInputStream();
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
            if (this.f2709g != null) {
                this.f2709g.setSoTimeout(i);
            }
        } catch (SocketException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public boolean mo3244c() throws java.io.IOException {
        /*
        r2 = this;
        r1 = 0;
        r0 = r2.f2709g;	 Catch:{ IOException -> 0x003a }
        if (r0 == 0) goto L_0x0044;
    L_0x0005:
        r0 = r2.f2709g;	 Catch:{ IOException -> 0x003c }
        r0 = r0.isClosed();	 Catch:{ IOException -> 0x003c }
        if (r0 != 0) goto L_0x0015;
    L_0x000d:
        r0 = r2.f2709g;	 Catch:{ IOException -> 0x003e }
        r0 = r0.isConnected();	 Catch:{ IOException -> 0x003e }
        if (r0 != 0) goto L_0x0034;
    L_0x0015:
        r0 = r2.e;	 Catch:{ IOException -> 0x0040 }
        if (r0 == 0) goto L_0x0021;
    L_0x0019:
        r0 = r2.e;	 Catch:{ IOException -> 0x0040 }
        r0.close();	 Catch:{ IOException -> 0x0040 }
        r0 = 0;
        r2.e = r0;	 Catch:{ IOException -> 0x0040 }
    L_0x0021:
        r0 = r2.d;	 Catch:{ IOException -> 0x0042 }
        if (r0 == 0) goto L_0x002d;
    L_0x0025:
        r0 = r2.d;	 Catch:{ IOException -> 0x0042 }
        r0.close();	 Catch:{ IOException -> 0x0042 }
        r0 = 0;
        r2.d = r0;	 Catch:{ IOException -> 0x0042 }
    L_0x002d:
        r0 = r2.f2709g;
        r0.close();
        r2.f2709g = r1;
    L_0x0034:
        r0 = r2.f2709g;	 Catch:{ IOException -> 0x0087 }
        if (r0 == 0) goto L_0x0089;
    L_0x0038:
        r0 = 1;
    L_0x0039:
        return r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = r2.f2708f;	 Catch:{ IOException -> 0x0083 }
        if (r0 == 0) goto L_0x0034;
    L_0x0048:
        r0 = r2.f2710h;	 Catch:{ IOException -> 0x0083 }
        if (r0 == 0) goto L_0x0034;
    L_0x004c:
        r0 = r2.f2708f;
        r0.select();
        r0 = r2.f2708f;
        r0 = r0.selectedKeys();
        if (r0 == 0) goto L_0x0034;
    L_0x0059:
        r1 = r0.size();	 Catch:{ IOException -> 0x0085 }
        if (r1 <= 0) goto L_0x0034;
    L_0x005f:
        r1 = r0.iterator();
    L_0x0063:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0034;
    L_0x0069:
        r0 = r1.next();
        r0 = (java.nio.channels.SelectionKey) r0;
        r1.remove();	 Catch:{ IOException -> 0x0081 }
        r0 = r0.isAcceptable();	 Catch:{ IOException -> 0x0081 }
        if (r0 == 0) goto L_0x0063;
    L_0x0078:
        r0 = r2.f2710h;	 Catch:{ IOException -> 0x0081 }
        r0 = r0.accept();	 Catch:{ IOException -> 0x0081 }
        r2.f2709g = r0;	 Catch:{ IOException -> 0x0081 }
        goto L_0x0063;
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r0 = move-exception;
        throw r0;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = 0;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.n.d.c():boolean");
    }

    /* renamed from: d */
    public C0966c mo3245d() throws IOException {
        try {
            if (!(this.f2708f == null || this.f2710h == null)) {
                Set selectedKeys = this.f2708f.selectedKeys();
                if (selectedKeys != null) {
                    try {
                        if (selectedKeys.size() > 0) {
                            Iterator it = selectedKeys.iterator();
                            while (it.hasNext()) {
                                SelectionKey selectionKey = (SelectionKey) it.next();
                                it.remove();
                                if (selectionKey.isAcceptable()) {
                                    Socket accept = this.f2710h.accept();
                                    if (accept != null) {
                                        C0966c c0966c = new C0966c(accept);
                                        c0966c.mo3252a(this.b);
                                        c0966c.m6952a(this.a);
                                        return c0966c;
                                    }
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw e;
                    }
                }
            }
            return null;
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    public boolean mo3246d(int i) throws IOException {
        return this.f2708f != null && this.f2708f.select((long) i) > 0;
    }

    /* renamed from: e */
    public String mo3247e() {
        try {
            return this.f2709g != null ? this.f2709g.getInetAddress().getHostAddress() : "0";
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public int mo3248f() {
        try {
            return this.f2709g != null ? this.f2709g.getPort() : -1;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public synchronized void mo3249g() throws IOException {
        try {
            super.mo3249g();
            if (this.f2710h != null) {
                if (this.f2710h.getChannel() != null) {
                    this.f2710h.getChannel().close();
                }
                this.f2710h.close();
            }
            try {
                if (this.f2708f != null) {
                    try {
                        this.f2708f.close();
                    } catch (NullPointerException e) {
                        C0691a.m2856a(f2707z);
                    }
                }
                if (this.f2709g != null) {
                    this.f2709g.close();
                }
            } catch (NullPointerException e2) {
                throw e2;
            } catch (IOException e3) {
                throw e3;
            }
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        }
        return;
    }

    /* renamed from: h */
    public void mo3250h() {
        super.mo3250h();
        this.f2710h = null;
        this.f2708f = null;
        this.f2709g = null;
    }

    /* renamed from: j */
    public boolean mo3251j() throws IOException {
        try {
            if (!(this.f2708f == null || this.f2710h == null)) {
                this.f2708f.selectNow();
                Set selectedKeys = this.f2708f.selectedKeys();
                if (selectedKeys != null) {
                    try {
                        if (selectedKeys.size() > 0) {
                            Iterator it = selectedKeys.iterator();
                            while (it.hasNext()) {
                                SelectionKey selectionKey = (SelectionKey) it.next();
                                it.remove();
                                if (selectionKey.isAcceptable()) {
                                    this.f2710h.accept().close();
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw e;
                    }
                }
            }
            return true;
        } catch (IOException e2) {
            throw e2;
        }
    }
}
