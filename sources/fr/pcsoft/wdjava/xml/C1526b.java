package fr.pcsoft.wdjava.xml;

import java.io.IOException;
import java.io.StringReader;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: fr.pcsoft.wdjava.xml.b */
final class C1526b implements EntityResolver {
    C1526b() {
    }

    public InputSource resolveEntity(String str, String str2) throws SAXException, IOException {
        return new InputSource(new StringReader(""));
    }
}
