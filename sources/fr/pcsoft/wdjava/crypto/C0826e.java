package fr.pcsoft.wdjava.crypto;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: fr.pcsoft.wdjava.crypto.e */
class C0826e extends C0823b {
    /* renamed from: a */
    private static final int f2188a = 19;
    /* renamed from: c */
    private static final byte[] f2189c = new byte[]{(byte) -87, (byte) -101, (byte) -56, (byte) 50, (byte) 86, (byte) 53, (byte) -29, (byte) 3};
    /* renamed from: z */
    private static final String f2190z = C0826e.m4232z(C0826e.m4233z("_4<\u0003\u0016{\u001e4\u0010JN\u0018\u001d\u0010:\\"));
    /* renamed from: b */
    private final String f2191b;

    C0826e(String str) {
        this.f2191b = str;
    }

    /* renamed from: z */
    private static String m4232z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 15;
                    break;
                case 1:
                    i2 = 118;
                    break;
                case 2:
                    i2 = 121;
                    break;
                case 3:
                    i2 = 84;
                    break;
                default:
                    i2 = C0607n.bx;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4233z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.bx);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo2758a(File file, File file2) throws Exception {
        IOException e;
        Throwable th;
        FileOutputStream fileOutputStream = null;
        Key generateSecret = SecretKeyFactory.getInstance(f2190z).generateSecret(new PBEKeySpec(this.f2191b.toCharArray(), f2189c, 19));
        Cipher instance = Cipher.getInstance(generateSecret.getAlgorithm());
        instance.init(2, generateSecret, new PBEParameterSpec(f2189c, 19));
        InputStream cipherInputStream;
        FileOutputStream fileOutputStream2;
        try {
            cipherInputStream = new CipherInputStream(new FileInputStream(file), instance);
            try {
                fileOutputStream2 = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = cipherInputStream.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                    if (cipherInputStream != null) {
                        try {
                            cipherInputStream.close();
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                } catch (IOException e222) {
                    throw e222;
                } catch (IOException e3) {
                    e222 = e3;
                    fileOutputStream = cipherInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (IOException e4) {
                e222 = e4;
                fileOutputStream2 = null;
                Object obj = cipherInputStream;
                try {
                    throw e222;
                } catch (Throwable th3) {
                    th = th3;
                    cipherInputStream = fileOutputStream;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (Throwable th4) {
                th = th4;
                if (cipherInputStream != null) {
                    try {
                        cipherInputStream.close();
                    } catch (IOException e2222) {
                        throw e2222;
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e22222) {
                        throw e22222;
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e22222 = e5;
            fileOutputStream2 = null;
            throw e22222;
        } catch (Throwable th5) {
            th = th5;
            cipherInputStream = null;
            if (cipherInputStream != null) {
                cipherInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public byte[] mo2759a(byte[] bArr) throws Exception {
        Key generateSecret = SecretKeyFactory.getInstance(f2190z).generateSecret(new PBEKeySpec(this.f2191b.toCharArray(), f2189c, 19));
        Cipher instance = Cipher.getInstance(generateSecret.getAlgorithm());
        instance.init(1, generateSecret, new PBEParameterSpec(f2189c, 19));
        return C0808l.m4045c(instance.doFinal(bArr));
    }

    /* renamed from: b */
    public void mo2760b(File file, File file2) throws Exception {
        FileInputStream fileInputStream;
        IOException e;
        Throwable th;
        OutputStream outputStream = null;
        Key generateSecret = SecretKeyFactory.getInstance(f2190z).generateSecret(new PBEKeySpec(this.f2191b.toCharArray(), f2189c, 19));
        Cipher instance = Cipher.getInstance(generateSecret.getAlgorithm());
        instance.init(1, generateSecret, new PBEParameterSpec(f2189c, 19));
        OutputStream cipherOutputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                cipherOutputStream = new CipherOutputStream(new FileOutputStream(file2), instance);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        cipherOutputStream.write(bArr, 0, read);
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                    if (cipherOutputStream != null) {
                        try {
                            cipherOutputStream.close();
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                } catch (IOException e222) {
                    throw e222;
                } catch (IOException e3) {
                    e222 = e3;
                    outputStream = fileInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = cipherOutputStream;
                }
            } catch (IOException e4) {
                e222 = e4;
                cipherOutputStream = null;
                Object obj = fileInputStream;
                try {
                    throw e222;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = outputStream;
                    outputStream = cipherOutputStream;
                }
            } catch (Throwable th4) {
                th = th4;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2222) {
                        throw e2222;
                    }
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e22222) {
                        throw e22222;
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e22222 = e5;
            cipherOutputStream = null;
            throw e22222;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public byte[] mo2761b(byte[] bArr) throws Exception {
        Key generateSecret = SecretKeyFactory.getInstance(f2190z).generateSecret(new PBEKeySpec(this.f2191b.toCharArray(), f2189c, 19));
        byte[] b = C0808l.m4039b(bArr);
        Cipher instance = Cipher.getInstance(generateSecret.getAlgorithm());
        instance.init(2, generateSecret, new PBEParameterSpec(f2189c, 19));
        return instance.doFinal(b);
    }
}
