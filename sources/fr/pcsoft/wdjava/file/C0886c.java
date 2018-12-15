package fr.pcsoft.wdjava.file;

import java.io.File;
import java.io.FileFilter;

/* renamed from: fr.pcsoft.wdjava.file.c */
final class C0886c implements FileFilter {
    C0886c() {
    }

    public boolean accept(File file) {
        return file.isDirectory();
    }
}
