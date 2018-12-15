package android.support.v4.graphics;

import android.os.ParcelFileDescriptor;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

@RequiresApi(21)
@RestrictTo({Scope.LIBRARY_GROUP})
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static final String TAG = "TypefaceCompatApi21Impl";

    TypefaceCompatApi21Impl() {
    }

    private File getFile(ParcelFileDescriptor fd) {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return new File(path);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface createFromFontInfo(android.content.Context r12, android.os.CancellationSignal r13, @android.support.annotation.NonNull android.support.v4.provider.FontsContractCompat.FontInfo[] r14, int r15) {
        /*
        r11 = this;
        r6 = r14.length;
        r7 = 1;
        if (r6 >= r7) goto L_0x0006;
    L_0x0004:
        r6 = 0;
    L_0x0005:
        return r6;
    L_0x0006:
        r0 = r11.findBestInfo(r14, r15);
        r5 = r12.getContentResolver();
        r6 = r0.getUri();	 Catch:{ IOException -> 0x0047 }
        r7 = "r";
        r4 = r5.openFileDescriptor(r6, r7, r13);	 Catch:{ IOException -> 0x0047 }
        r8 = 0;
        r2 = r11.getFile(r4);	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        if (r2 == 0) goto L_0x0025;
    L_0x001f:
        r6 = r2.canRead();	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        if (r6 != 0) goto L_0x007c;
    L_0x0025:
        r3 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        r6 = r4.getFileDescriptor();	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        r3.<init>(r6);	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        r7 = 0;
        r6 = super.createFromInputStream(r12, r3);	 Catch:{ Throwable -> 0x0068 }
        if (r3 == 0) goto L_0x003a;
    L_0x0035:
        if (r7 == 0) goto L_0x005d;
    L_0x0037:
        r3.close();	 Catch:{ Throwable -> 0x004a, all -> 0x0061 }
    L_0x003a:
        if (r4 == 0) goto L_0x0005;
    L_0x003c:
        if (r8 == 0) goto L_0x0064;
    L_0x003e:
        r4.close();	 Catch:{ Throwable -> 0x0042 }
        goto L_0x0005;
    L_0x0042:
        r7 = move-exception;
        r8.addSuppressed(r7);	 Catch:{ IOException -> 0x0047 }
        goto L_0x0005;
    L_0x0047:
        r1 = move-exception;
        r6 = 0;
        goto L_0x0005;
    L_0x004a:
        r9 = move-exception;
        r7.addSuppressed(r9);	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        goto L_0x003a;
    L_0x004f:
        r6 = move-exception;
        throw r6;	 Catch:{ all -> 0x0051 }
    L_0x0051:
        r7 = move-exception;
        r10 = r7;
        r7 = r6;
        r6 = r10;
    L_0x0055:
        if (r4 == 0) goto L_0x005c;
    L_0x0057:
        if (r7 == 0) goto L_0x0099;
    L_0x0059:
        r4.close();	 Catch:{ Throwable -> 0x0094 }
    L_0x005c:
        throw r6;	 Catch:{ IOException -> 0x0047 }
    L_0x005d:
        r3.close();	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        goto L_0x003a;
    L_0x0061:
        r6 = move-exception;
        r7 = r8;
        goto L_0x0055;
    L_0x0064:
        r4.close();	 Catch:{ IOException -> 0x0047 }
        goto L_0x0005;
    L_0x0068:
        r7 = move-exception;
        throw r7;	 Catch:{ all -> 0x006a }
    L_0x006a:
        r6 = move-exception;
        if (r3 == 0) goto L_0x0072;
    L_0x006d:
        if (r7 == 0) goto L_0x0078;
    L_0x006f:
        r3.close();	 Catch:{ Throwable -> 0x0073, all -> 0x0061 }
    L_0x0072:
        throw r6;	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
    L_0x0073:
        r9 = move-exception;
        r7.addSuppressed(r9);	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        goto L_0x0072;
    L_0x0078:
        r3.close();	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        goto L_0x0072;
    L_0x007c:
        r6 = android.graphics.Typeface.createFromFile(r2);	 Catch:{ Throwable -> 0x004f, all -> 0x0061 }
        if (r4 == 0) goto L_0x0005;
    L_0x0082:
        if (r8 == 0) goto L_0x008f;
    L_0x0084:
        r4.close();	 Catch:{ Throwable -> 0x0089 }
        goto L_0x0005;
    L_0x0089:
        r7 = move-exception;
        r8.addSuppressed(r7);	 Catch:{ IOException -> 0x0047 }
        goto L_0x0005;
    L_0x008f:
        r4.close();	 Catch:{ IOException -> 0x0047 }
        goto L_0x0005;
    L_0x0094:
        r8 = move-exception;
        r7.addSuppressed(r8);	 Catch:{ IOException -> 0x0047 }
        goto L_0x005c;
    L_0x0099:
        r4.close();	 Catch:{ IOException -> 0x0047 }
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.TypefaceCompatApi21Impl.createFromFontInfo(android.content.Context, android.os.CancellationSignal, android.support.v4.provider.FontsContractCompat$FontInfo[], int):android.graphics.Typeface");
    }
}
