package fr.pcsoft.wdjava.file;

import java.io.File;
import java.io.FileFilter;

/* renamed from: fr.pcsoft.wdjava.file.i */
final class C0891i implements FileFilter {
    C0891i() {
    }

    public boolean accept(File file) {
        return file.isDirectory();
    }
}
