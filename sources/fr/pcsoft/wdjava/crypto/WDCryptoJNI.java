package fr.pcsoft.wdjava.crypto;

public class WDCryptoJNI {
    public static final native byte[] jniCertificatSigneBuffer(byte[] bArr, String str, byte[] bArr2, String str2, int i);

    public static final native int jniCertificatVerifieSignatureBuffer(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, String[] strArr, byte[][] bArr4, int i);
}
