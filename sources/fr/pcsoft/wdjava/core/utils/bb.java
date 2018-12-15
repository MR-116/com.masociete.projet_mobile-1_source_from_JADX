package fr.pcsoft.wdjava.core.utils;

import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.core.C0728o;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.file.C0893k;
import fr.pcsoft.wdjava.file.C0895m;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class bb {
    /* renamed from: z */
    private static final String[] f2041z = new String[]{m3847z(m3848z(">$3@y\u0004 !CoW-&\u000fl\u0012;.JxW%&\u000fl\u001b<;\u0001")), m3847z(m3848z("T\u0006\u0016yO%\u001d\u0016}O(\u0000\u000eE$\u001a\nmF2")), m3847z(m3848z("1  Gc\u0012;c[x\u00189cYe\u001b<.Fd\u0012<;\u0001")), m3847z(m3848z("T\u000f\nlB>\f\u0011pC9\u001d\u0011`_!\b\u0001cO")), m3847z(m3848z("T\n\u000bnX0\f\u000ejD#\u0016\nbZ8\u001a\u0010fH;\f"))};

    /* renamed from: a */
    public static final long m3841a(InputStream inputStream, byte[] bArr, long j) throws IOException {
        int i = 0;
        if (j > 0) {
            try {
                if (inputStream.skip(j) < j) {
                    return -1;
                }
            } catch (IOException e) {
                throw e;
            }
        }
        int[] iArr = new int[(bArr.length + 1)];
        iArr[0] = -1;
        int i2 = -1;
        int i3 = 0;
        while (i3 < bArr.length) {
            try {
                while (i2 >= 0) {
                    if (bArr[i3] == bArr[i2]) {
                        break;
                    }
                    i2 = iArr[i2];
                }
                i3++;
                i2++;
                iArr[i3] = i2;
            } catch (IOException e2) {
                throw e2;
            } catch (IOException e22) {
                throw e22;
            }
        }
        do {
            i2 = inputStream.read();
            if (i2 == -1) {
                return -1;
            }
            j++;
            while (i >= 0) {
                try {
                    if (((byte) i2) == bArr[i]) {
                        break;
                    }
                    i = iArr[i];
                } catch (IOException e222) {
                    throw e222;
                }
            }
            i++;
        } while (i != bArr.length);
        return j - ((long) bArr.length);
    }

    /* renamed from: a */
    public static final InputStream m3842a(Object obj, C0728o<C0895m> c0728o) throws C0901s {
        IOException e;
        String str = null;
        try {
            File file;
            String path;
            InputStream inputStream;
            if (obj instanceof File) {
                file = (File) obj;
                path = file.getPath();
                inputStream = null;
            } else {
                path = obj.toString();
                inputStream = C0743a.m3205b(path);
                file = inputStream == null ? C0897o.m6290j(path) : null;
            }
            if (file != null) {
                try {
                    if (file.exists()) {
                        long length = file.length();
                        if (length > 2147483647L) {
                            throw new C0901s(f2041z[2]);
                        }
                        long j = length <= 0 ? 1 : length;
                        inputStream = new BufferedInputStream(new FileInputStream(file), j > PlaybackStateCompat.ACTION_PLAY_FROM_URI ? 8192 : (int) j);
                    } else {
                        throw new C0901s(C0745b.m3222b(f2041z[1], file.toString()), C0745b.m3222b(f2041z[3], new String[0]));
                    }
                } catch (IOException e2) {
                    throw e2;
                } catch (IOException e22) {
                    throw e22;
                } catch (IOException e222) {
                    throw e222;
                } catch (IOException e3) {
                    e222 = e3;
                    str = path;
                }
            }
            if (c0728o == null) {
                return inputStream;
            }
            InputStream c0893k = new C0893k(inputStream);
            ((C0893k) c0893k).m6219a();
            c0728o.m3094a(((C0893k) c0893k).m6220b());
            return c0893k;
        } catch (IOException e4) {
            e222 = e4;
            throw new C0901s(C0745b.m3222b(f2041z[4], str), e222.getMessage());
        }
    }

    /* renamed from: a */
    public static final String m3843a(InputStream inputStream) throws IOException {
        Throwable th;
        StringBuilder stringBuilder = new StringBuilder();
        if (inputStream != null) {
            Closeable bufferedReader;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuilder.append(readLine);
                    } catch (IOException e) {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                m3844a(bufferedReader);
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                m3844a(bufferedReader);
                throw th;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static final void m3844a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                C0691a.m2857a(f2041z[0], e);
            }
        }
    }

    /* renamed from: a */
    public static final void m3845a(InputStream inputStream, File file) throws IOException {
        Throwable th;
        Closeable bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                byte[] bArr = new byte[4092];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        bufferedOutputStream.flush();
                        m3844a((Closeable) inputStream);
                        m3844a(bufferedOutputStream);
                        return;
                    }
                }
            } catch (IOException e) {
                throw e;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
            m3844a((Closeable) inputStream);
            m3844a(bufferedOutputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public static final byte[] m3846b(InputStream inputStream) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[4092];
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] toByteArray = byteArrayOutputStream.toByteArray();
                    m3844a((Closeable) inputStream);
                    return toByteArray;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            m3844a((Closeable) inputStream);
        }
    }

    /* renamed from: z */
    private static String m3847z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 73;
                    break;
                case 2:
                    i2 = 67;
                    break;
                case 3:
                    i2 = 47;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3848z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 10);
        }
        return toCharArray;
    }
}
