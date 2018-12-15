package fr.pcsoft.wdjava.core.utils;

import java.io.IOException;
import java.io.Writer;

/* renamed from: fr.pcsoft.wdjava.core.utils.s */
public class C0815s extends Writer {
    /* renamed from: z */
    private static final String f2157z = C0815s.m4130z(C0815s.m4131z("\u0016e"));
    /* renamed from: a */
    public final String f2158a = " ";
    /* renamed from: b */
    private Writer f2159b;
    /* renamed from: c */
    private int f2160c = 100;
    /* renamed from: d */
    private int f2161d = 0;

    public C0815s(Writer writer, int i) {
        this.f2159b = writer;
        if (i < 10) {
            i = 10;
        }
        this.f2160c = i;
    }

    /* renamed from: z */
    private static String m4130z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 27;
                    break;
                case 1:
                    i2 = 111;
                    break;
                case 2:
                    i2 = 67;
                    break;
                case 3:
                    i2 = 89;
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
    private static char[] m4131z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 97);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final Writer m4132a() {
        return this.f2159b;
    }

    /* renamed from: a */
    public void m4133a(String str) throws IOException {
        write(str);
        write(f2157z);
    }

    public void close() throws IOException {
        this.f2159b.close();
    }

    public void flush() throws IOException {
        this.f2159b.flush();
    }

    public String toString() {
        return this.f2159b != null ? this.f2159b.toString() : super.toString();
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        int i5 = i;
        while (i4 < i3) {
            char c = cArr[i4];
            if (c == '\n') {
                this.f2159b.write(cArr, i5, (i4 - i5) + 1);
                this.f2161d = 0;
                i5 = i4 + 1;
            } else if (c == '\r') {
                if (i4 != i3 - 1) {
                    try {
                        if (cArr[i4 + 1] == '\n') {
                            this.f2161d++;
                        }
                    } catch (IOException e) {
                        throw e;
                    }
                }
                this.f2159b.write(cArr, i5, (i4 - i5) + 1);
                this.f2161d = 0;
                i5 = i4 + 1;
            } else {
                try {
                    if (this.f2161d >= this.f2160c) {
                        if (Character.isWhitespace(c)) {
                            while (Character.isWhitespace(c) && i4 < i3 - 1) {
                                int i6 = i4 + 1;
                                i4 = i6;
                                c = cArr[i6];
                            }
                            if (i4 >= i3 - 1) {
                                break;
                            }
                        }
                        this.f2159b.write(cArr, i5, i4 - i5);
                        this.f2159b.write(f2157z);
                        this.f2159b.write(" ");
                        this.f2161d = " ".length() + 1;
                        i5 = i4;
                    } else {
                        this.f2161d++;
                    }
                } catch (IOException e2) {
                    throw e2;
                } catch (IOException e22) {
                    try {
                        throw e22;
                    } catch (IOException e222) {
                        throw e222;
                    }
                }
            }
            i4++;
        }
        this.f2159b.write(cArr, i5, i3 - i5);
    }
}
