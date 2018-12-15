package fr.pcsoft.wdjava.core.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/* renamed from: fr.pcsoft.wdjava.core.utils.r */
public class C0814r extends BufferedReader {
    /* renamed from: a */
    private String f2145a = null;
    /* renamed from: b */
    private int f2146b = 0;
    /* renamed from: c */
    private boolean f2147c = true;

    public C0814r(Reader reader) {
        super(reader);
    }

    /* renamed from: a */
    protected String m4120a() throws IOException {
        String readLine;
        do {
            readLine = readLine();
            if (readLine != null) {
                this.f2146b++;
            }
            if (readLine == null) {
                break;
            }
            try {
            } catch (IOException e) {
                throw e;
            }
        } while (readLine.length() == 0);
        return readLine;
    }

    /* renamed from: b */
    public final int m4121b() {
        return this.f2146b;
    }

    public String readLine() throws IOException {
        try {
            String readLine = this.f2145a == null ? super.readLine() : this.f2145a;
            if (readLine == null) {
                return null;
            }
            this.f2145a = null;
            StringBuilder stringBuilder = new StringBuilder(readLine);
            while (true) {
                String readLine2 = super.readLine();
                if (readLine2 == null) {
                    break;
                }
                try {
                    if (readLine2.length() <= 0 || !Character.isWhitespace(readLine2.charAt(0))) {
                        this.f2145a = readLine2;
                    } else {
                        int i = 1;
                        try {
                            if (!this.f2147c) {
                                while (i < readLine2.length()) {
                                    try {
                                        if (!Character.isWhitespace(readLine2.charAt(i))) {
                                            break;
                                        }
                                        i++;
                                    } catch (IOException e) {
                                        throw e;
                                    }
                                }
                                continue;
                            }
                            stringBuilder.append(readLine2.substring(i));
                        } catch (IOException e2) {
                            throw e2;
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                } catch (IOException e222) {
                    throw e222;
                }
            }
            return stringBuilder.toString();
        } catch (IOException e2222) {
            throw e2222;
        }
    }
}
