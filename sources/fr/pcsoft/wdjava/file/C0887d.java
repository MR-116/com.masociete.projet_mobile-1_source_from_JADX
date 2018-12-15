package fr.pcsoft.wdjava.file;

import java.io.File;
import java.io.FileFilter;

/* renamed from: fr.pcsoft.wdjava.file.d */
final class C0887d implements FileFilter {
    C0887d() {
    }

    public boolean accept(File file) {
        return file.isDirectory();
    }
}
