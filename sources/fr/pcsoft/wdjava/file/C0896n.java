package fr.pcsoft.wdjava.file;

import java.io.File;
import java.io.FileFilter;

/* renamed from: fr.pcsoft.wdjava.file.n */
final class C0896n implements FileFilter {
    C0896n() {
    }

    public boolean accept(File file) {
        return file.isDirectory();
    }
}
