package fr.pcsoft.wdjava.crypto;

import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.jni.WDJNIException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: fr.pcsoft.wdjava.crypto.i */
public class C0827i {
    /* renamed from: a */
    public static final int f2192a = 3;
    /* renamed from: b */
    public static final int f2193b = 2;
    /* renamed from: c */
    public static final int f2194c = 1;
    /* renamed from: d */
    public static final int f2195d = 1;
    /* renamed from: e */
    public static final int f2196e = 1;
    /* renamed from: f */
    public static final int f2197f = 2;
    /* renamed from: g */
    public static final int f2198g = 2;
    /* renamed from: z */
    private static final String[] f2199z = new String[]{C0827i.m4246z(C0827i.m4247z("?\u0014cI '\u000ecl,6\u001b~\\ '\u0013lc \u0006\u0013md$!\u000fxo\u0007 \u001clo7")), C0827i.m4246z(C0827i.m4247z("v;FM\n\n9XS\u0015\u0001;MO\u001a\u001c4\\K\t\u001c>O")), C0827i.m4246z(C0827i.m4247z("v9FO\u001a\u0016(SZ\u0011\u0014=OU\f\u001b,KF\f\u0011?")), C0827i.m4246z(C0827i.m4247z("v?XX\u0000\u0000(UI\u0017\f*^K\u0002\u0010")), C0827i.m4246z(C0827i.m4247z("?\u0014cI '\u000ecl,6\u001b~Y,2\u0014oH03\u001cox")), C0827i.m4246z(C0827i.m4247z("\u0014?Y")), C0827i.m4246z(C0827i.m4247z("\u0011?Yo!0")), C0827i.m4246z(C0827i.m4247z("\u0011?Y")), C0827i.m4246z(C0827i.m4247z("v?XX\u0000\u0000(UN\u0000\u0016(SZ\u0011\u0014=O")), C0827i.m4246z(C0827i.m4247z("v?XX\u001a\u00115DD\u0000\u0010%IX\u001c\u0005.OO\u001a\u001c4\\K\t\u001c>O")), C0827i.m4246z(C0827i.m4247z("\u001b\u0015Zk!1\u0013dm")), C0827i.m4246z(C0827i.m4247z("v*KN\u0001\u001c4MU\f\u001b,KF\f\u0011?")), C0827i.m4246z(C0827i.m4247z("\u00051IYp\u0005\u001bnn,;\u001d")), C0827i.m4246z(C0827i.m4247z("\u00109H")), C0827i.m4246z(C0827i.m4247z("\u00168I")), C0827i.m4246z(C0827i.m4247z("v7EN\u0000\n5ZO\u0017\u0014.CE\u000b\n3D\\\u0004\u00193NO"))};

    /* renamed from: a */
    private static final int m4238a(int i) throws C0829k {
        switch (i) {
            case 1:
                return 16;
            case 2:
                return 8;
            case 3:
                return 24;
            default:
                throw new C0829k(C0745b.m3222b(f2199z[1], new String[0]));
        }
    }

    /* renamed from: a */
    public static final int m4239a(byte[] bArr, byte[] bArr2, String str, String str2, String[] strArr, int i) throws WDJNIException, C0901s {
        byte[] bArr3 = null;
        try {
            byte[][] bArr4;
            byte[][] bArr5 = (byte[][]) null;
            if (strArr != null) {
                bArr4 = new byte[strArr.length][];
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    bArr4[i2] = C0897o.m6254a(strArr[i2], null);
                }
            } else {
                bArr4 = bArr5;
            }
            if (!C0808l.m4053k(str)) {
                bArr3 = C0897o.m6254a(str, null);
            }
            return WDCryptoJNI.jniCertificatVerifieSignatureBuffer(bArr, bArr2, str, bArr3, str2, strArr, bArr4, i);
        } catch (UnsatisfiedLinkError e) {
            throw e;
        } catch (UnsatisfiedLinkError e2) {
            throw e2;
        } catch (UnsatisfiedLinkError e22) {
            throw new WDJNIException(f2199z[0], e22);
        }
    }

    /* renamed from: a */
    private static final Cipher m4240a(int i, int i2, int i3) throws C0829k {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(C0827i.m4244b(i)).append('/');
            switch (i2) {
                case 1:
                    stringBuilder.append(f2199z[13]);
                    break;
                case 2:
                    stringBuilder.append(f2199z[14]);
                    break;
                default:
                    throw new C0829k(C0745b.m3222b(f2199z[15], new String[0]));
            }
            try {
                stringBuilder.append('/');
                switch (i3) {
                    case 1:
                        stringBuilder.append(f2199z[12]);
                        break;
                    case 2:
                        stringBuilder.append(f2199z[10]);
                        break;
                    default:
                        throw new C0829k(C0745b.m3222b(f2199z[11], new String[0]));
                }
                try {
                    return Cipher.getInstance(stringBuilder.toString());
                } catch (NoSuchAlgorithmException e) {
                    throw new C0829k(C0745b.m3222b(f2199z[1], new String[0]), e.getMessage());
                } catch (NoSuchPaddingException e2) {
                    throw new C0829k(C0745b.m3222b(f2199z[11], new String[0]), e2.getMessage());
                }
            } catch (NoSuchAlgorithmException e3) {
                throw e3;
            }
        } catch (NoSuchAlgorithmException e32) {
            throw e32;
        }
    }

    /* renamed from: a */
    private static final SecretKey m4241a(byte[] bArr, int i) throws C0829k {
        int a = C0827i.m4238a(i);
        int length = bArr.length;
        if (length != a) {
            Object obj = new byte[a];
            System.arraycopy(bArr, 0, obj, 0, Math.min(a, length));
            bArr = obj;
        }
        return new SecretKeySpec(bArr, C0827i.m4244b(i));
    }

    /* renamed from: a */
    public static final byte[] m4242a(byte[] bArr, String str, String str2, int i) throws WDJNIException, C0901s {
        try {
            return WDCryptoJNI.jniCertificatSigneBuffer(bArr, str, C0897o.m6254a(str, null), str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2199z[4], e);
        }
    }

    /* renamed from: a */
    public static final byte[] m4243a(byte[] bArr, byte[] bArr2, int i, int i2, int i3) throws C0829k {
        Cipher a = C0827i.m4240a(i, i2, i3);
        try {
            Object obj;
            a.init(1, C0827i.m4241a(bArr2, i));
            if (i3 == 2) {
                int blockSize = a.getBlockSize();
                int length = bArr.length;
                if (length % blockSize != 0) {
                    obj = new byte[(blockSize * ((int) Math.ceil(((double) length) / ((double) blockSize))))];
                    System.arraycopy(bArr, 0, obj, 0, length);
                    bArr = obj;
                }
            }
            Object doFinal = a.doFinal(bArr);
            Object iv = a.getIV();
            if (iv == null || i2 == 1) {
                return doFinal;
            }
            obj = new byte[(doFinal.length + iv.length)];
            System.arraycopy(iv, 0, obj, 0, iv.length);
            System.arraycopy(doFinal, 0, obj, iv.length, doFinal.length);
            return obj;
        } catch (InvalidKeyException e) {
            throw new C0829k(C0745b.m3222b(f2199z[2], new String[0]), e.getMessage());
        } catch (Exception e2) {
            throw new C0829k(C0745b.m3222b(f2199z[3], new String[0]), e2.getMessage());
        }
    }

    /* renamed from: b */
    private static final String m4244b(int i) throws C0829k {
        switch (i) {
            case 1:
                try {
                    return f2199z[5];
                } catch (C0829k e) {
                    throw e;
                }
            case 2:
                return f2199z[7];
            case 3:
                return f2199z[6];
            default:
                throw new C0829k(C0745b.m3222b(f2199z[1], new String[0]));
        }
    }

    /* renamed from: b */
    public static final byte[] m4245b(byte[] bArr, byte[] bArr2, int i, int i2, int i3) throws C0829k {
        Cipher a = C0827i.m4240a(i, i2, i3);
        if (i2 != 1) {
            try {
                int blockSize = a.getBlockSize();
                if (blockSize >= bArr.length) {
                    throw new C0829k(C0745b.m3222b(f2199z[9], new String[0]));
                }
                Object obj = new byte[blockSize];
                Object obj2 = new byte[(bArr.length - blockSize)];
                System.arraycopy(bArr, 0, obj, 0, blockSize);
                System.arraycopy(bArr, blockSize, obj2, 0, obj2.length);
                a.init(2, C0827i.m4241a(bArr2, i), new IvParameterSpec(obj));
                bArr = obj2;
            } catch (InvalidKeyException e) {
                throw e;
            } catch (Exception e2) {
                throw new C0829k(C0745b.m3222b(f2199z[8], new String[0]), e2.getMessage());
            } catch (InvalidKeyException e3) {
                throw new C0829k(C0745b.m3222b(f2199z[2], new String[0]), e3.getMessage());
            }
        }
        a.init(2, C0827i.m4241a(bArr2, i));
        return a.doFinal(bArr);
    }

    /* renamed from: z */
    private static String m4246z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 122;
                    break;
                case 2:
                    i2 = 10;
                    break;
                case 3:
                    i2 = 10;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4247z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 69);
        }
        return toCharArray;
    }
}
