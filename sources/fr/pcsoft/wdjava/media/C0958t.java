package fr.pcsoft.wdjava.media;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.media.t */
public class C0958t extends C0957s {
    private static final String[] Ib = new String[]{C0958t.m6904z(C0958t.m6905z("4\u0012g\u001e\u0017^\u0019q\u0005\u000bR\bv\r\u0005R\u0005t")), C0958t.m6904z(C0958t.m6905z("q8V9;::Z(-")), C0958t.m6904z(C0958t.m6905z("t8[8!y\"Z9;:'\\/<b%P")), C0958t.m6904z(C0958t.m6905z("t6X):vzS>'y#")), C0958t.m6904z(C0958t.m6905z("t6X):vzW-+|")), C0958t.m6904z(C0958t.m6905z("C.E)hs2\u0015/)z¾G-h~4Z\"&b2\u0015v")), C0958t.m6904z(C0958t.m6905z("t6X):v")), C0958t.m6904z(C0958t.m6905z("\u001a]"))};
    protected C0946h Hb = null;

    /* renamed from: b */
    private int m6903b(int i) {
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        return cameraInfo.facing;
    }

    /* renamed from: z */
    private static String m6904z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 23;
                    break;
                case 1:
                    i2 = 87;
                    break;
                case 2:
                    i2 = 53;
                    break;
                case 3:
                    i2 = 76;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6905z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 72);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected void mo3229a(int i) throws ib {
        if (i >= 0) {
            try {
                if (i < mo3239m()) {
                    try {
                        if (this.r != null) {
                            if (this.h != i) {
                                try {
                                    m6900o();
                                    m6875a();
                                    this.h = i;
                                    m6894h();
                                    if (this.ab != null && !this.ab.isEmpty()) {
                                        Iterator it = this.ab.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                ((C0949k) it.next()).mo3413a();
                                            } catch (ib e) {
                                                throw e;
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                } catch (ib e2) {
                                    throw e2;
                                }
                            }
                        }
                        this.h = i;
                        return;
                    } catch (ib e22) {
                        throw e22;
                    } catch (ib e222) {
                        throw e222;
                    }
                }
            } catch (ib e2222) {
                throw e2222;
            }
        }
        throw new ib(C0745b.m3222b(Ib[0], new String[0]));
    }

    /* renamed from: a */
    protected boolean mo3230a(Camera camera) {
        camera.unlock();
        return true;
    }

    /* renamed from: b */
    public String mo3231b(String str) throws ib {
        if (!str.equals(Ib[6])) {
            return super.mo3231b(str);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int m = mo3239m();
        for (int i = 0; i < m; i++) {
            if (i > 0) {
                try {
                    stringBuilder.append(Ib[7]);
                } catch (ib e) {
                    throw e;
                }
            }
            int b = m6903b(i);
            stringBuilder.append(i + 1).append(C0607n.Gc);
            switch (b) {
                case 0:
                    stringBuilder.append(Ib[4]);
                    break;
                case 1:
                    try {
                        stringBuilder.append(Ib[3]);
                        break;
                    } catch (ib e2) {
                        throw e2;
                    }
                default:
                    C0691a.m2856a(Ib[5] + b);
                    break;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: b */
    protected void mo3232b() {
        try {
            m6884a(Ib[1], new WDChaine(Ib[2]));
        } catch (ib e) {
            try {
                if (this.Hb != null) {
                    this.Hb.m6853a();
                    this.Hb = null;
                }
                this.Hb = new C0946h(this.r);
                C0946h.access$000(this.Hb);
            } catch (ib e2) {
                throw e2;
            }
        }
    }

    /* renamed from: b */
    protected boolean mo3233b(Camera camera) {
        camera.lock();
        return true;
    }

    /* renamed from: c */
    protected final int mo3234c(String str) {
        int m = mo3239m();
        for (int i = 0; i < m; i++) {
            switch (m6903b(i)) {
                case 0:
                    if (!str.equals(Ib[4])) {
                        break;
                    }
                    return i;
                case 1:
                    if (!str.equals(Ib[3])) {
                        break;
                    }
                    return i;
                default:
                    break;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public void mo3235d() {
        if (this.Hb != null) {
            this.Hb.m6853a();
            this.Hb = null;
        }
        super.mo3235d();
    }

    /* renamed from: e */
    protected void mo3236e() {
        if (this.r != null) {
            int a = C1511l.m10519a(C1056i.m7562a());
            CameraInfo cameraInfo = new CameraInfo();
            Camera.getCameraInfo(this.h, cameraInfo);
            this.C = cameraInfo.facing == 1 ? (360 - ((a + cameraInfo.orientation) % 360)) % 360 : ((cameraInfo.orientation - a) + 360) % 360;
            this.r.setDisplayOrientation(this.C);
        }
    }

    /* renamed from: g */
    protected int mo3237g() {
        if (this.z == -1) {
            this.z = 0;
        }
        this.z = ((this.z + 45) / 90) * 90;
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(this.h, cameraInfo);
        return cameraInfo.facing == 1 ? ((cameraInfo.orientation - this.z) + 360) % 360 : (cameraInfo.orientation + this.z) % 360;
    }

    /* renamed from: k */
    protected boolean mo3238k() {
        return m6903b(this.h) == 1;
    }

    /* renamed from: m */
    public int mo3239m() {
        return Camera.getNumberOfCameras();
    }

    /* renamed from: q */
    protected Camera mo3240q() {
        if (this.h == -1) {
            int m = mo3239m();
            for (int i = 0; i < m; i++) {
                CameraInfo cameraInfo = new CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    this.h = i;
                    break;
                }
            }
            if (this.h == -1 && m > 0) {
                this.h = 0;
            }
        }
        return Camera.open(this.h);
    }
}
