package fr.pcsoft.wdjava.ui.utils;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* renamed from: fr.pcsoft.wdjava.ui.utils.j */
final class C1509j extends BufferedInputStream {
    C1509j(InputStream inputStream) {
        super(inputStream);
    }

    public synchronized void mark(int i) {
        super.mark(Math.max(i, 131072));
    }
}
