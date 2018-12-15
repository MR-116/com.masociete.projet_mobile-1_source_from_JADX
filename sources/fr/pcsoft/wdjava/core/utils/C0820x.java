package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: fr.pcsoft.wdjava.core.utils.x */
public final class C0820x extends DataInputStream {
    /* renamed from: z */
    private static final String[] f2179z = new String[]{C0820x.m4183z(C0820x.m4184z("Z3#k~kr$îuo&#qw ")), C0820x.m4183z(C0820x.m4184z("[\u0006\f**"))};

    public C0820x(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: z */
    private static String m4183z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 14;
                    break;
                case 1:
                    i2 = 82;
                    break;
                case 2:
                    i2 = 74;
                    break;
                case 3:
                    i2 = 7;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4184z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 18);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final String m4185a() throws IOException {
        boolean z = true;
        int readInt = readInt();
        if (readInt <= 0) {
            if (readInt != 0) {
                z = false;
            }
            C0691a.m2860a(z, f2179z[0]);
            return null;
        } else if (readInt == 1) {
            try {
                read();
                return "";
            } catch (IOException e) {
                throw e;
            }
        } else {
            readInt--;
            byte[] bArr = new byte[readInt];
            readFully(bArr, 0, readInt);
            read();
            return C0725i.m3035a(bArr, f2179z[1]);
        }
    }
}
