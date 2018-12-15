package fr.pcsoft.wdjava.ui.p065b;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* renamed from: fr.pcsoft.wdjava.ui.b.c */
final class C1092c extends BufferedInputStream {
    C1092c(InputStream inputStream) {
        super(inputStream);
    }

    public synchronized void mark(int i) {
        super.mark(Math.max(i, 131072));
    }
}
