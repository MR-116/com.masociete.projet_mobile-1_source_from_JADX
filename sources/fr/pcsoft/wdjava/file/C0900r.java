package fr.pcsoft.wdjava.file;

import java.io.File;
import java.util.Comparator;

/* renamed from: fr.pcsoft.wdjava.file.r */
final class C0900r implements Comparator {
    C0900r() {
    }

    public int compare(Object obj, Object obj2) {
        return ((File) obj).getPath().compareToIgnoreCase(((File) obj2).getPath());
    }
}
