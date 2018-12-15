package fr.pcsoft.wdjava.p059n;

import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketException;

/* renamed from: fr.pcsoft.wdjava.n.f */
public class C0968f extends C0965a {
    /* renamed from: f */
    private static final int f2711f = 65000;
    /* renamed from: z */
    private static final String[] f2712z = new String[]{C0968f.m6992z(C0968f.m6993z("KD\ben-C\u0018sa8H\u0001ik+C\u000eik7^\tr`:S\u000er`")), C0968f.m6992z(C0968f.m6993z("KD\ben-C\u0018sa8H\u0014k<V\u001fcz!Y\u0013cw,^\u0013c")), C0968f.m6992z(C0968f.m6993z("KD\ben-C\u0018ok>V\u000boa-")), C0968f.m6992z(C0968f.m6993z("KD\ben-C\u0018rd![\u000bcz8V\u0016s`<H\u0012bu"))};
    /* renamed from: g */
    private int f2713g = 0;
    /* renamed from: h */
    private String f2714h = "";
    /* renamed from: i */
    private DatagramSocket f2715i = null;

    public C0968f(int i, String str) throws IOException {
        SocketAddress inetSocketAddress = new InetSocketAddress(str, i);
        try {
            if (C0969g.f2717b) {
                this.f2715i = new MulticastSocket(inetSocketAddress);
            } else {
                this.f2715i = new DatagramSocket(inetSocketAddress);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m6992z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 104;
                    break;
                case 1:
                    i2 = 23;
                    break;
                case 2:
                    i2 = 71;
                    break;
                case 3:
                    i2 = 38;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6993z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public OutputStream mo3241a() throws SocketException {
        return null;
    }

    /* renamed from: a */
    public void mo3252a(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f2712z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo3253a(byte[] bArr) throws IOException {
        WDErreurManager.m2883a(C0745b.m3222b(f2712z[1], new String[0]));
    }

    /* renamed from: a */
    public void mo3254a(byte[] bArr, String str, int i) throws IOException {
        try {
            if (!mo3244c()) {
                throw new SocketException(C0745b.m3222b(f2712z[2], new String[0]));
            } else if (bArr.length > f2711f) {
                throw new SocketException(C0745b.m3222b(f2712z[3], new String[0]));
            } else {
                this.f2715i.send(new DatagramPacket(bArr, bArr.length, InetAddress.getByName(str), i));
            }
        } catch (IOException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public byte[] mo3255a(int i, int i2) throws IOException {
        if (mo3244c()) {
            mo3243b(i);
            byte[] bArr = new byte[f2711f];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            this.f2715i.receive(datagramPacket);
            int length = datagramPacket.getLength();
            if (length < bArr.length) {
                bArr = new byte[length];
                System.arraycopy(datagramPacket.getData(), 0, bArr, 0, length);
            } else {
                bArr = datagramPacket.getData();
            }
            this.f2714h = datagramPacket.getAddress().getHostAddress();
            this.f2713g = datagramPacket.getPort();
            return bArr;
        }
        throw new SocketException(C0745b.m3222b(f2712z[2], new String[0]));
    }

    /* renamed from: b */
    public InputStream mo3242b() throws SocketException {
        return null;
    }

    /* renamed from: b */
    public void mo3243b(int i) throws SocketException {
        try {
            if (this.f2715i != null) {
                this.f2715i.setSoTimeout(i);
            }
        } catch (SocketException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public boolean mo3244c() throws IOException {
        try {
            return this.f2715i != null;
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public C0966c mo3245d() throws IOException {
        WDErreurManager.m2883a(C0745b.m3222b(f2712z[0], new String[0]));
        return null;
    }

    /* renamed from: d */
    public boolean mo3246d(int i) throws IOException {
        WDErreurManager.m2883a(C0745b.m3222b(f2712z[0], new String[0]));
        return false;
    }

    /* renamed from: e */
    public String mo3247e() {
        return this.f2714h;
    }

    /* renamed from: f */
    public int mo3248f() {
        return this.f2713g;
    }

    /* renamed from: g */
    public synchronized void mo3249g() throws IOException {
        try {
            super.mo3249g();
            if (this.f2715i != null) {
                this.f2715i.close();
            }
            this.f2714h = "";
            this.f2713g = 0;
        } catch (IOException e) {
            throw e;
        }
        return;
    }

    /* renamed from: h */
    public void mo3250h() {
        super.mo3250h();
        this.f2715i = null;
        this.f2714h = null;
    }

    /* renamed from: j */
    public boolean mo3251j() throws IOException {
        WDErreurManager.m2883a(C0745b.m3222b(f2712z[0], new String[0]));
        return false;
    }
}
