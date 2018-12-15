package fr.pcsoft.wdjava.core.ressources.messages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: fr.pcsoft.wdjava.core.ressources.messages.a */
final class C0744a extends RandomAccessFile {
    /* renamed from: a */
    private byte[] f1905a = new byte[8];

    public C0744a(File file, String str) throws FileNotFoundException {
        super(file, str);
    }

    /* renamed from: a */
    public final long m3217a() throws IOException {
        readFully(this.f1905a, 0, 8);
        return (((((((((long) this.f1905a[7]) << 56) | (((long) (this.f1905a[6] & 255)) << 48)) | (((long) (this.f1905a[5] & 255)) << 40)) | (((long) (this.f1905a[4] & 255)) << 32)) | (((long) (this.f1905a[3] & 255)) << 24)) | (((long) (this.f1905a[2] & 255)) << 16)) | (((long) (this.f1905a[1] & 255)) << 8)) | ((long) (this.f1905a[0] & 255));
    }

    /* renamed from: b */
    public final int m3218b() throws IOException {
        super.readFully(this.f1905a, 0, 4);
        return (((this.f1905a[3] << 24) | ((this.f1905a[2] & 255) << 16)) | ((this.f1905a[1] & 255) << 8)) | (this.f1905a[0] & 255);
    }
}
