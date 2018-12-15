package fr.pcsoft.wdjava.media;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ab implements PictureCallback {
    final eb this$1;

    ab(eb ebVar) {
        this.this$1 = ebVar;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        Exception e;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        try {
            File a = C0897o.m6239a(this.this$1.val$strCheminFichier, true);
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(a));
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                if (a.exists()) {
                    C1093d.m7927a().m7975a(this.this$1.val$strCheminFichier, 1, 0);
                }
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e2) {
                    }
                }
                this.this$1.m1784a();
            } catch (IOException e3) {
                throw e3;
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
            bufferedOutputStream = null;
            try {
                eb.access$100(this.this$1, e);
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e6) {
                    }
                }
                this.this$1.m1784a();
            } catch (Throwable th2) {
                th = th2;
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e7) {
                    }
                }
                this.this$1.m1784a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            this.this$1.m1784a();
            throw th;
        }
    }
}
