package fr.pcsoft.wdjava.core;

import android.support.v4.view.InputDeviceCompat;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.ui.p065b.p067a.C1084x;
import fr.pcsoft.wdjava.ui.p069g.C1409j;

/* renamed from: fr.pcsoft.wdjava.core.q */
/* synthetic */ class C0742q {
    /* renamed from: a */
    static final int[] f1885a = new int[EWDPropriete.values().length];

    static {
        try {
            f1885a[EWDPropriete.PROP_ABREVIATION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f1885a[EWDPropriete.PROP_ACCES.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f1885a[EWDPropriete.PROP_ALIAS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f1885a[EWDPropriete.PROP_ALTITUDE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f1885a[EWDPropriete.PROP_ANCRAGE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f1885a[EWDPropriete.PROP_ANIMATION.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f1885a[EWDPropriete.PROP_ANIMATIONINITIALE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f1885a[EWDPropriete.PROP_ANNEE.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f1885a[EWDPropriete.PROP_AVANCERAPIDE.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
        }
        try {
            f1885a[EWDPropriete.PROP_BARREDEMESSAGE.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f1885a[EWDPropriete.PROP_BASEDEDONNEES.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f1885a[EWDPropriete.PROP_BINAIRE.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
        }
        try {
            f1885a[EWDPropriete.PROP_BORNEMAX.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
        }
        try {
            f1885a[EWDPropriete.PROP_BORNEMIN.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
        }
        try {
            f1885a[EWDPropriete.PROP_BULLE.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
        }
        try {
            f1885a[EWDPropriete.PROP_BULLETITRE.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
        }
        try {
            f1885a[EWDPropriete.PROP_CADRAGEHORIZONTAL.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
        }
        try {
            f1885a[EWDPropriete.PROP_CADRAGEVERTICAL.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
        }
        try {
            f1885a[EWDPropriete.PROP_CLECOMPOSEE.ordinal()] = 19;
        } catch (NoSuchFieldError e19) {
        }
        try {
            f1885a[EWDPropriete.PROP_CLICDROIT.ordinal()] = 20;
        } catch (NoSuchFieldError e20) {
        }
        try {
            f1885a[EWDPropriete.PROP_COCHEE.ordinal()] = 21;
        } catch (NoSuchFieldError e21) {
        }
        try {
            f1885a[EWDPropriete.PROP_COLONNE.ordinal()] = 22;
        } catch (NoSuchFieldError e22) {
        }
        try {
            f1885a[EWDPropriete.PROP_CONDITIONFILTRE.ordinal()] = 23;
        } catch (NoSuchFieldError e23) {
        }
        try {
            f1885a[EWDPropriete.PROP_CONNEXION.ordinal()] = 24;
        } catch (NoSuchFieldError e24) {
        }
        try {
            f1885a[EWDPropriete.PROP_CONTENU.ordinal()] = 25;
        } catch (NoSuchFieldError e25) {
        }
        try {
            f1885a[EWDPropriete.PROP_CONTENUINITIAL.ordinal()] = 26;
        } catch (NoSuchFieldError e26) {
        }
        try {
            f1885a[EWDPropriete.PROP_COULEUR.ordinal()] = 27;
        } catch (NoSuchFieldError e27) {
        }
        try {
            f1885a[EWDPropriete.PROP_COULEURFOND.ordinal()] = 28;
        } catch (NoSuchFieldError e28) {
        }
        try {
            f1885a[EWDPropriete.PROP_COULEURJAUGE.ordinal()] = 29;
        } catch (NoSuchFieldError e29) {
        }
        try {
            f1885a[EWDPropriete.PROP_CURSEUR.ordinal()] = 30;
        } catch (NoSuchFieldError e30) {
        }
        try {
            f1885a[EWDPropriete.PROP_CURSEURSOURIS.ordinal()] = 31;
        } catch (NoSuchFieldError e31) {
        }
        try {
            f1885a[EWDPropriete.PROP_DATEDEBUT.ordinal()] = 32;
        } catch (NoSuchFieldError e32) {
        }
        try {
            f1885a[EWDPropriete.PROP_DATEFIN.ordinal()] = 33;
        } catch (NoSuchFieldError e33) {
        }
        try {
            f1885a[EWDPropriete.PROP_DEPLACABLE.ordinal()] = 34;
        } catch (NoSuchFieldError e34) {
        }
        try {
            f1885a[EWDPropriete.PROP_DNDCIBLE.ordinal()] = 35;
        } catch (NoSuchFieldError e35) {
        }
        try {
            f1885a[EWDPropriete.PROP_DNDSOURCE.ordinal()] = 36;
        } catch (NoSuchFieldError e36) {
        }
        try {
            f1885a[EWDPropriete.PROP_DOUBLECLIC.ordinal()] = 37;
        } catch (NoSuchFieldError e37) {
        }
        try {
            f1885a[EWDPropriete.PROP_ELLIPSE.ordinal()] = 38;
        } catch (NoSuchFieldError e38) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENFONCE.ordinal()] = 39;
        } catch (NoSuchFieldError e39) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENROULE.ordinal()] = 40;
        } catch (NoSuchFieldError e40) {
        }
        try {
            f1885a[EWDPropriete.PROP_ETAT.ordinal()] = 41;
        } catch (NoSuchFieldError e41) {
        }
        try {
            f1885a[EWDPropriete.PROP_ETATINITIAL.ordinal()] = 42;
        } catch (NoSuchFieldError e42) {
        }
        try {
            f1885a[EWDPropriete.PROP_FENETRESOURCE.ordinal()] = 43;
        } catch (NoSuchFieldError e43) {
        }
        try {
            f1885a[EWDPropriete.PROP_FICHIERORIGINE.ordinal()] = 44;
        } catch (NoSuchFieldError e44) {
        }
        try {
            f1885a[EWDPropriete.PROP_FICHIERPARCOURU.ordinal()] = 45;
        } catch (NoSuchFieldError e45) {
        }
        try {
            f1885a[EWDPropriete.PROP_FILTRE.ordinal()] = 46;
        } catch (NoSuchFieldError e46) {
        }
        try {
            f1885a[EWDPropriete.PROP_FILTREAVECBORNES.ordinal()] = 47;
        } catch (NoSuchFieldError e47) {
        }
        try {
            f1885a[EWDPropriete.PROP_FINCURSEUR.ordinal()] = 48;
        } catch (NoSuchFieldError e48) {
        }
        try {
            f1885a[EWDPropriete.PROP_FORMATMEMORISE.ordinal()] = 49;
        } catch (NoSuchFieldError e49) {
        }
        try {
            f1885a[EWDPropriete.PROP_GROUPE.ordinal()] = 50;
        } catch (NoSuchFieldError e50) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEUR.ordinal()] = 51;
        } catch (NoSuchFieldError e51) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURIMAGE.ordinal()] = 52;
        } catch (NoSuchFieldError e52) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURINITIALE.ordinal()] = 53;
        } catch (NoSuchFieldError e53) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURLIGNE.ordinal()] = 54;
        } catch (NoSuchFieldError e54) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURLIGNEMAX.ordinal()] = 55;
        } catch (NoSuchFieldError e55) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURMAX.ordinal()] = 56;
        } catch (NoSuchFieldError e56) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURMIN.ordinal()] = 57;
        } catch (NoSuchFieldError e57) {
        }
        try {
            f1885a[EWDPropriete.PROP_HEURE.ordinal()] = 58;
        } catch (NoSuchFieldError e58) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENHEURES.ordinal()] = 59;
        } catch (NoSuchFieldError e59) {
        }
        try {
            f1885a[EWDPropriete.PROP_IMAGE.ordinal()] = 60;
        } catch (NoSuchFieldError e60) {
        }
        try {
            f1885a[EWDPropriete.PROP_IMAGEDEROULEE.ordinal()] = 61;
        } catch (NoSuchFieldError e61) {
        }
        try {
            f1885a[EWDPropriete.PROP_IMAGEENROULEE.ordinal()] = 62;
        } catch (NoSuchFieldError e62) {
        }
        try {
            f1885a[EWDPropriete.PROP_IMAGEETAT.ordinal()] = 63;
        } catch (NoSuchFieldError e63) {
        }
        try {
            f1885a[EWDPropriete.PROP_IMAGEFOND.ordinal()] = 64;
        } catch (NoSuchFieldError e64) {
        }
        try {
            f1885a[EWDPropriete.PROP_IMAGEFONDETAT.ordinal()] = 65;
        } catch (NoSuchFieldError e65) {
        }
        try {
            f1885a[EWDPropriete.PROP_IMAGEMODE.ordinal()] = 66;
        } catch (NoSuchFieldError e66) {
        }
        try {
            f1885a[EWDPropriete.PROP_INDICATION.ordinal()] = 67;
        } catch (NoSuchFieldError e67) {
        }
        try {
            f1885a[EWDPropriete.PROP_INDICE.ordinal()] = 68;
        } catch (NoSuchFieldError e68) {
        }
        try {
            f1885a[EWDPropriete.PROP_INFOSETENDUES.ordinal()] = 69;
        } catch (NoSuchFieldError e69) {
        }
        try {
            f1885a[EWDPropriete.PROP_JOUR.ordinal()] = 70;
        } catch (NoSuchFieldError e70) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENJOURS.ordinal()] = 71;
        } catch (NoSuchFieldError e71) {
        }
        try {
            f1885a[EWDPropriete.PROP_LARGEUR.ordinal()] = 72;
        } catch (NoSuchFieldError e72) {
        }
        try {
            f1885a[EWDPropriete.PROP_LARGEURIMAGE.ordinal()] = 73;
        } catch (NoSuchFieldError e73) {
        }
        try {
            f1885a[EWDPropriete.PROP_LARGEURINITIALE.ordinal()] = 74;
        } catch (NoSuchFieldError e74) {
        }
        try {
            f1885a[EWDPropriete.PROP_LARGEURMAX.ordinal()] = 75;
        } catch (NoSuchFieldError e75) {
        }
        try {
            f1885a[EWDPropriete.PROP_LARGEURMIN.ordinal()] = 76;
        } catch (NoSuchFieldError e76) {
        }
        try {
            f1885a[EWDPropriete.PROP_LIAISONFICHIER.ordinal()] = 77;
        } catch (NoSuchFieldError e77) {
        }
        try {
            f1885a[EWDPropriete.PROP_LIBELLE.ordinal()] = 78;
        } catch (NoSuchFieldError e78) {
        }
        try {
            f1885a[EWDPropriete.PROP_LIGNE.ordinal()] = 79;
        } catch (NoSuchFieldError e79) {
        }
        try {
            f1885a[EWDPropriete.PROP_MASQUESAISIE.ordinal()] = 80;
        } catch (NoSuchFieldError e80) {
        }
        try {
            f1885a[EWDPropriete.PROP_MEMO.ordinal()] = 81;
        } catch (NoSuchFieldError e81) {
        }
        try {
            f1885a[EWDPropriete.PROP_MEMOIRE.ordinal()] = 82;
        } catch (NoSuchFieldError e82) {
        }
        try {
            f1885a[EWDPropriete.PROP_MENUCONTEXTUEL.ordinal()] = 83;
        } catch (NoSuchFieldError e83) {
        }
        try {
            f1885a[EWDPropriete.PROP_MILLISECONDE.ordinal()] = 84;
        } catch (NoSuchFieldError e84) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENMILLISECONDES.ordinal()] = 85;
        } catch (NoSuchFieldError e85) {
        }
        try {
            f1885a[EWDPropriete.PROP_MINIATURE.ordinal()] = 86;
        } catch (NoSuchFieldError e86) {
        }
        try {
            f1885a[EWDPropriete.PROP_MINUTE.ordinal()] = 87;
        } catch (NoSuchFieldError e87) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENMINUTES.ordinal()] = 88;
        } catch (NoSuchFieldError e88) {
        }
        try {
            f1885a[EWDPropriete.PROP_MODELISTEIMAGE.ordinal()] = 89;
        } catch (NoSuchFieldError e89) {
        }
        try {
            f1885a[EWDPropriete.PROP_MODIFIE.ordinal()] = 90;
        } catch (NoSuchFieldError e90) {
        }
        try {
            f1885a[EWDPropriete.PROP_MOIS.ordinal()] = 91;
        } catch (NoSuchFieldError e91) {
        }
        try {
            f1885a[EWDPropriete.PROP_MOTDEPASSE.ordinal()] = 92;
        } catch (NoSuchFieldError e92) {
        }
        try {
            f1885a[EWDPropriete.PROP_MULTILIGNE.ordinal()] = 93;
        } catch (NoSuchFieldError e93) {
        }
        try {
            f1885a[EWDPropriete.PROP_MULTISELECTION.ordinal()] = 94;
        } catch (NoSuchFieldError e94) {
        }
        try {
            f1885a[EWDPropriete.PROP_NBCOMPOSANTE.ordinal()] = 95;
        } catch (NoSuchFieldError e95) {
        }
        try {
            f1885a[EWDPropriete.PROP_NBRUBRIQUE.ordinal()] = 96;
        } catch (NoSuchFieldError e96) {
        }
        try {
            f1885a[EWDPropriete.PROP_NBRUBRIQUECLE.ordinal()] = 97;
        } catch (NoSuchFieldError e97) {
        }
        try {
            f1885a[EWDPropriete.PROP_NBRUBRIQUEMEMO.ordinal()] = 98;
        } catch (NoSuchFieldError e98) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOM.ordinal()] = 99;
        } catch (NoSuchFieldError e99) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOMBRECOLONNE.ordinal()] = 100;
        } catch (NoSuchFieldError e100) {
        }
        try {
            f1885a[EWDPropriete.PROP_LARGEURCOLONNE.ordinal()] = 101;
        } catch (NoSuchFieldError e101) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOMCOMPLET.ordinal()] = 102;
        } catch (NoSuchFieldError e102) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOMDECRIT.ordinal()] = 103;
        } catch (NoSuchFieldError e103) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOMPHYSIQUE.ordinal()] = 104;
        } catch (NoSuchFieldError e104) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOMPHYSIQUEDECRIT.ordinal()] = 105;
        } catch (NoSuchFieldError e105) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOTE.ordinal()] = 106;
        } catch (NoSuchFieldError e106) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOUVEAU.ordinal()] = 107;
        } catch (NoSuchFieldError e107) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOUVELENREGISTREMENT.ordinal()] = 108;
        } catch (NoSuchFieldError e108) {
        }
        try {
            f1885a[EWDPropriete.PROP_NULL.ordinal()] = 109;
        } catch (NoSuchFieldError e109) {
        }
        try {
            f1885a[EWDPropriete.PROP_NULLSUPPORTE.ordinal()] = 110;
        } catch (NoSuchFieldError e110) {
        }
        try {
            f1885a[EWDPropriete.PROP_NUMERIQUE.ordinal()] = 111;
        } catch (NoSuchFieldError e111) {
        }
        try {
            f1885a[EWDPropriete.PROP_NUMTAB.ordinal()] = 112;
        } catch (NoSuchFieldError e112) {
        }
        try {
            f1885a[EWDPropriete.PROP_OCCURRENCE.ordinal()] = 113;
        } catch (NoSuchFieldError e113) {
        }
        try {
            f1885a[EWDPropriete.PROP_ORIENTATIONVERTICALE.ordinal()] = 114;
        } catch (NoSuchFieldError e114) {
        }
        try {
            f1885a[EWDPropriete.PROP_PARTIEDATE.ordinal()] = 115;
        } catch (NoSuchFieldError e115) {
        }
        try {
            f1885a[EWDPropriete.PROP_PARTIEHEURE.ordinal()] = 116;
        } catch (NoSuchFieldError e116) {
        }
        try {
            f1885a[EWDPropriete.PROP_PLAN.ordinal()] = 117;
        } catch (NoSuchFieldError e117) {
        }
        try {
            f1885a[EWDPropriete.PROP_POLICEBARREE.ordinal()] = 118;
        } catch (NoSuchFieldError e118) {
        }
        try {
            f1885a[EWDPropriete.PROP_POLICEGRAS.ordinal()] = 119;
        } catch (NoSuchFieldError e119) {
        }
        try {
            f1885a[EWDPropriete.PROP_POLICEITALIQUE.ordinal()] = C0607n.co;
        } catch (NoSuchFieldError e120) {
        }
        try {
            f1885a[EWDPropriete.PROP_POLICENOM.ordinal()] = 121;
        } catch (NoSuchFieldError e121) {
        }
        try {
            f1885a[EWDPropriete.PROP_POLICESOULIGNEE.ordinal()] = 122;
        } catch (NoSuchFieldError e122) {
        }
        try {
            f1885a[EWDPropriete.PROP_POLICETAILLE.ordinal()] = 123;
        } catch (NoSuchFieldError e123) {
        }
        try {
            f1885a[EWDPropriete.PROP_PROVIDER.ordinal()] = C0607n.Hn;
        } catch (NoSuchFieldError e124) {
        }
        try {
            f1885a[EWDPropriete.PROP_RUBRIQUEAFFICHEE.ordinal()] = 125;
        } catch (NoSuchFieldError e125) {
        }
        try {
            f1885a[EWDPropriete.PROP_RUBRIQUEFILTREE.ordinal()] = 126;
        } catch (NoSuchFieldError e126) {
        }
        try {
            f1885a[EWDPropriete.PROP_RUBRIQUEMEMORISEE.ordinal()] = C0607n.bx;
        } catch (NoSuchFieldError e127) {
        }
        try {
            f1885a[EWDPropriete.PROP_RUBRIQUEORIGINE.ordinal()] = 128;
        } catch (NoSuchFieldError e128) {
        }
        try {
            f1885a[EWDPropriete.PROP_RUBRIQUEPARCOURUE.ordinal()] = C0607n.Wj;
        } catch (NoSuchFieldError e129) {
        }
        try {
            f1885a[EWDPropriete.PROP_SECONDE.ordinal()] = 130;
        } catch (NoSuchFieldError e130) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENSECONDES.ordinal()] = 131;
        } catch (NoSuchFieldError e131) {
        }
        try {
            f1885a[EWDPropriete.PROP_SECURITEHTML.ordinal()] = C0538a.tb;
        } catch (NoSuchFieldError e132) {
        }
        try {
            f1885a[EWDPropriete.PROP_SELECTIONNEE.ordinal()] = 133;
        } catch (NoSuchFieldError e133) {
        }
        try {
            f1885a[EWDPropriete.PROP_SERVEUR.ordinal()] = C0607n.Fb;
        } catch (NoSuchFieldError e134) {
        }
        try {
            f1885a[EWDPropriete.PROP_SOURCE.ordinal()] = C0538a.Nb;
        } catch (NoSuchFieldError e135) {
        }
        try {
            f1885a[EWDPropriete.PROP_SOUSLIBELLE.ordinal()] = 136;
        } catch (NoSuchFieldError e136) {
        }
        try {
            f1885a[EWDPropriete.PROP_STYLEFOND.ordinal()] = 137;
        } catch (NoSuchFieldError e137) {
        }
        try {
            f1885a[EWDPropriete.PROP_TAILLE.ordinal()] = 138;
        } catch (NoSuchFieldError e138) {
        }
        try {
            f1885a[EWDPropriete.PROP_TAUXANCRAGEBAS.ordinal()] = 139;
        } catch (NoSuchFieldError e139) {
        }
        try {
            f1885a[EWDPropriete.PROP_TAUXANCRAGEDROITE.ordinal()] = C0542t.f1193i;
        } catch (NoSuchFieldError e140) {
        }
        try {
            f1885a[EWDPropriete.PROP_TAUXANCRAGEHAUTEUR.ordinal()] = 141;
        } catch (NoSuchFieldError e141) {
        }
        try {
            f1885a[EWDPropriete.PROP_TAUXANCRAGELARGEUR.ordinal()] = C0536n.f995G;
        } catch (NoSuchFieldError e142) {
        }
        try {
            f1885a[EWDPropriete.PROP_TEXTE.ordinal()] = 143;
        } catch (NoSuchFieldError e143) {
        }
        try {
            f1885a[EWDPropriete.PROP_TITRE.ordinal()] = C0538a.Lb;
        } catch (NoSuchFieldError e144) {
        }
        try {
            f1885a[EWDPropriete.PROP_TRIABLE.ordinal()] = 145;
        } catch (NoSuchFieldError e145) {
        }
        try {
            f1885a[EWDPropriete.PROP_TRIEE.ordinal()] = 146;
        } catch (NoSuchFieldError e146) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPE.ordinal()] = 147;
        } catch (NoSuchFieldError e147) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPECLE.ordinal()] = 148;
        } catch (NoSuchFieldError e148) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPEREMPLISSAGE.ordinal()] = 149;
        } catch (NoSuchFieldError e149) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPESAISIE.ordinal()] = C0536n.f1006y;
        } catch (NoSuchFieldError e150) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPETRI.ordinal()] = 151;
        } catch (NoSuchFieldError e151) {
        }
        try {
            f1885a[EWDPropriete.PROP_UTILISATEUR.ordinal()] = 152;
        } catch (NoSuchFieldError e152) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEUR.ordinal()] = 153;
        } catch (NoSuchFieldError e153) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEURPARDEFAUT.ordinal()] = 154;
        } catch (NoSuchFieldError e154) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEURAFFICHEE.ordinal()] = 155;
        } catch (NoSuchFieldError e155) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEURINITIALE.ordinal()] = 156;
        } catch (NoSuchFieldError e156) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEURMEMORISEE.ordinal()] = 157;
        } catch (NoSuchFieldError e157) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEURRENVOYEE.ordinal()] = 158;
        } catch (NoSuchFieldError e158) {
        }
        try {
            f1885a[EWDPropriete.PROP_VERTICAL.ordinal()] = 159;
        } catch (NoSuchFieldError e159) {
        }
        try {
            f1885a[EWDPropriete.PROP_VIDE.ordinal()] = 160;
        } catch (NoSuchFieldError e160) {
        }
        try {
            f1885a[EWDPropriete.PROP_VISIBLE.ordinal()] = C0607n.kh;
        } catch (NoSuchFieldError e161) {
        }
        try {
            f1885a[EWDPropriete.PROP_VISIBLEINITIAL.ordinal()] = C0607n.Ru;
        } catch (NoSuchFieldError e162) {
        }
        try {
            f1885a[EWDPropriete.PROP_X.ordinal()] = C0607n.Ao;
        } catch (NoSuchFieldError e163) {
        }
        try {
            f1885a[EWDPropriete.PROP_XIMAGE.ordinal()] = 164;
        } catch (NoSuchFieldError e164) {
        }
        try {
            f1885a[EWDPropriete.PROP_XINITIAL.ordinal()] = 165;
        } catch (NoSuchFieldError e165) {
        }
        try {
            f1885a[EWDPropriete.PROP_Y.ordinal()] = 166;
        } catch (NoSuchFieldError e166) {
        }
        try {
            f1885a[EWDPropriete.PROP_YIMAGE.ordinal()] = 167;
        } catch (NoSuchFieldError e167) {
        }
        try {
            f1885a[EWDPropriete.PROP_YINITIAL.ordinal()] = 168;
        } catch (NoSuchFieldError e168) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENCODAGE.ordinal()] = 169;
        } catch (NoSuchFieldError e169) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOEUDRACINE.ordinal()] = C0536n.f1002n;
        } catch (NoSuchFieldError e170) {
        }
        try {
            f1885a[EWDPropriete.PROP_VERSION.ordinal()] = 171;
        } catch (NoSuchFieldError e171) {
        }
        try {
            f1885a[EWDPropriete.PROP_ATTRIBUT.ordinal()] = 172;
        } catch (NoSuchFieldError e172) {
        }
        try {
            f1885a[EWDPropriete.PROP_EXISTE.ordinal()] = 173;
        } catch (NoSuchFieldError e173) {
        }
        try {
            f1885a[EWDPropriete.PROP_NAMESPACE.ordinal()] = 174;
        } catch (NoSuchFieldError e174) {
        }
        try {
            f1885a[EWDPropriete.PROP_NAMESPACEDECLARE.ordinal()] = C0607n.hu;
        } catch (NoSuchFieldError e175) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOEUDFILS.ordinal()] = C0607n.aw;
        } catch (NoSuchFieldError e176) {
        }
        try {
            f1885a[EWDPropriete.PROP_SOURCEXML.ordinal()] = C0607n.Nr;
        } catch (NoSuchFieldError e177) {
        }
        try {
            f1885a[EWDPropriete.PROP_URI.ordinal()] = C0607n.Gk;
        } catch (NoSuchFieldError e178) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPECODEBARRES.ordinal()] = C0607n.yt;
        } catch (NoSuchFieldError e179) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPECONTENU.ordinal()] = 180;
        } catch (NoSuchFieldError e180) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEURBRUTE.ordinal()] = 181;
        } catch (NoSuchFieldError e181) {
        }
        try {
            f1885a[EWDPropriete.PROP_MESSAGE.ordinal()] = 182;
        } catch (NoSuchFieldError e182) {
        }
        try {
            f1885a[EWDPropriete.PROP_ICONE.ordinal()] = 183;
        } catch (NoSuchFieldError e183) {
        }
        try {
            f1885a[EWDPropriete.PROP_TEXTEDEROULANT.ordinal()] = 184;
        } catch (NoSuchFieldError e184) {
        }
        try {
            f1885a[EWDPropriete.PROP_SON.ordinal()] = 185;
        } catch (NoSuchFieldError e185) {
        }
        try {
            f1885a[EWDPropriete.PROP_VIBRATION.ordinal()] = C0607n.pw;
        } catch (NoSuchFieldError e186) {
        }
        try {
            f1885a[EWDPropriete.PROP_AFFICHAGELED.ordinal()] = 187;
        } catch (NoSuchFieldError e187) {
        }
        try {
            f1885a[EWDPropriete.PROP_COULEURLED.ordinal()] = 188;
        } catch (NoSuchFieldError e188) {
        }
        try {
            f1885a[EWDPropriete.PROP_ACTIONCLIC.ordinal()] = 189;
        } catch (NoSuchFieldError e189) {
        }
        try {
            f1885a[EWDPropriete.PROP_SUPPRIMABLE.ordinal()] = 190;
        } catch (NoSuchFieldError e190) {
        }
        try {
            f1885a[EWDPropriete.PROP_ACTIVEAPPLICATION.ordinal()] = 191;
        } catch (NoSuchFieldError e191) {
        }
        try {
            f1885a[EWDPropriete.PROP_MAXJAUGE.ordinal()] = 192;
        } catch (NoSuchFieldError e192) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEURJAUGE.ordinal()] = 193;
        } catch (NoSuchFieldError e193) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPEJAUGE.ordinal()] = C0607n.nn;
        } catch (NoSuchFieldError e194) {
        }
        try {
            f1885a[EWDPropriete.PROP_LATITUDE.ordinal()] = C0607n.oq;
        } catch (NoSuchFieldError e195) {
        }
        try {
            f1885a[EWDPropriete.PROP_LONGITUDE.ordinal()] = C0607n.Uk;
        } catch (NoSuchFieldError e196) {
        }
        try {
            f1885a[EWDPropriete.PROP_ALTITUDEVALIDE.ordinal()] = C0607n.Eg;
        } catch (NoSuchFieldError e197) {
        }
        try {
            f1885a[EWDPropriete.PROP_DIRECTION.ordinal()] = C0607n.jk;
        } catch (NoSuchFieldError e198) {
        }
        try {
            f1885a[EWDPropriete.PROP_DIRECTIONVALIDE.ordinal()] = 199;
        } catch (NoSuchFieldError e199) {
        }
        try {
            f1885a[EWDPropriete.PROP_PRECISION.ordinal()] = C0607n.Dt;
        } catch (NoSuchFieldError e200) {
        }
        try {
            f1885a[EWDPropriete.PROP_PRECISIONVALIDE.ordinal()] = C0607n.Bf;
        } catch (NoSuchFieldError e201) {
        }
        try {
            f1885a[EWDPropriete.PROP_VITESSE.ordinal()] = C0607n.Ug;
        } catch (NoSuchFieldError e202) {
        }
        try {
            f1885a[EWDPropriete.PROP_VITESSEVALIDE.ordinal()] = C0607n.f1465w;
        } catch (NoSuchFieldError e203) {
        }
        try {
            f1885a[EWDPropriete.PROP_DATEMESURE.ordinal()] = 204;
        } catch (NoSuchFieldError e204) {
        }
        try {
            f1885a[EWDPropriete.PROP_ADRESSE.ordinal()] = C0607n.f1441Y;
        } catch (NoSuchFieldError e205) {
        }
        try {
            f1885a[EWDPropriete.PROP_PORT.ordinal()] = C0607n.me;
        } catch (NoSuchFieldError e206) {
        }
        try {
            f1885a[EWDPropriete.PROP_IGNOREERREUR.ordinal()] = C0607n.Px;
        } catch (NoSuchFieldError e207) {
        }
        try {
            f1885a[EWDPropriete.PROP_RUE.ordinal()] = C0607n.qj;
        } catch (NoSuchFieldError e208) {
        }
        try {
            f1885a[EWDPropriete.PROP_VILLE.ordinal()] = C0607n.af;
        } catch (NoSuchFieldError e209) {
        }
        try {
            f1885a[EWDPropriete.PROP_CODEPOSTAL.ordinal()] = C0607n.Bs;
        } catch (NoSuchFieldError e210) {
        }
        try {
            f1885a[EWDPropriete.PROP_REGION.ordinal()] = C0607n.lh;
        } catch (NoSuchFieldError e211) {
        }
        try {
            f1885a[EWDPropriete.PROP_PAYS.ordinal()] = C0607n.Ep;
        } catch (NoSuchFieldError e212) {
        }
        try {
            f1885a[EWDPropriete.PROP_POSITION.ordinal()] = 213;
        } catch (NoSuchFieldError e213) {
        }
        try {
            f1885a[EWDPropriete.PROP_DESCRIPTION.ordinal()] = 214;
        } catch (NoSuchFieldError e214) {
        }
        try {
            f1885a[EWDPropriete.PROP_ZOOM.ordinal()] = 215;
        } catch (NoSuchFieldError e215) {
        }
        try {
            f1885a[EWDPropriete.PROP_AVECZOOM.ordinal()] = 216;
        } catch (NoSuchFieldError e216) {
        }
        try {
            f1885a[EWDPropriete.PROP_MODECARTE.ordinal()] = 217;
        } catch (NoSuchFieldError e217) {
        }
        try {
            f1885a[EWDPropriete.PROP_INFOREALITEAUGMENTEE.ordinal()] = 218;
        } catch (NoSuchFieldError e218) {
        }
        try {
            f1885a[EWDPropriete.PROP_INFOTRAFICROUTIER.ordinal()] = 219;
        } catch (NoSuchFieldError e219) {
        }
        try {
            f1885a[EWDPropriete.PROP_MODETEST.ordinal()] = C0607n.Tv;
        } catch (NoSuchFieldError e220) {
        }
        try {
            f1885a[EWDPropriete.PROP_PUBLICITECHARGEE.ordinal()] = C0607n.Qt;
        } catch (NoSuchFieldError e221) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOMAFFICHE.ordinal()] = C0607n.Cv;
        } catch (NoSuchFieldError e222) {
        }
        try {
            f1885a[EWDPropriete.PROP_FAVORI.ordinal()] = 223;
        } catch (NoSuchFieldError e223) {
        }
        try {
            f1885a[EWDPropriete.PROP_ETIQUETTE.ordinal()] = 224;
        } catch (NoSuchFieldError e224) {
        }
        try {
            f1885a[EWDPropriete.PROP_NUMERO.ordinal()] = 225;
        } catch (NoSuchFieldError e225) {
        }
        try {
            f1885a[EWDPropriete.PROP_TELEPHONE.ordinal()] = 226;
        } catch (NoSuchFieldError e226) {
        }
        try {
            f1885a[EWDPropriete.PROP_PRENOM.ordinal()] = 227;
        } catch (NoSuchFieldError e227) {
        }
        try {
            f1885a[EWDPropriete.PROP_EMAIL.ordinal()] = 228;
        } catch (NoSuchFieldError e228) {
        }
        try {
            f1885a[EWDPropriete.PROP_SIP.ordinal()] = C0607n.Yw;
        } catch (NoSuchFieldError e229) {
        }
        try {
            f1885a[EWDPropriete.PROP_SITEWEB.ordinal()] = C0607n.no;
        } catch (NoSuchFieldError e230) {
        }
        try {
            f1885a[EWDPropriete.PROP_MESSAGERIEINSTANTANEE.ordinal()] = 231;
        } catch (NoSuchFieldError e231) {
        }
        try {
            f1885a[EWDPropriete.PROP_PROTOCOLE.ordinal()] = 232;
        } catch (NoSuchFieldError e232) {
        }
        try {
            f1885a[EWDPropriete.PROP_EVENEMENT.ordinal()] = 233;
        } catch (NoSuchFieldError e233) {
        }
        try {
            f1885a[EWDPropriete.PROP_SOCIETE.ordinal()] = C0607n.Jn;
        } catch (NoSuchFieldError e234) {
        }
        try {
            f1885a[EWDPropriete.PROP_EMPLOI.ordinal()] = 235;
        } catch (NoSuchFieldError e235) {
        }
        try {
            f1885a[EWDPropriete.PROP_SERVICE.ordinal()] = 236;
        } catch (NoSuchFieldError e236) {
        }
        try {
            f1885a[EWDPropriete.PROP_POSTE.ordinal()] = C0607n.yk;
        } catch (NoSuchFieldError e237) {
        }
        try {
            f1885a[EWDPropriete.PROP_DATEBRUTE.ordinal()] = 238;
        } catch (NoSuchFieldError e238) {
        }
        try {
            f1885a[EWDPropriete.PROP_TAILLEMAX.ordinal()] = C0607n.Au;
        } catch (NoSuchFieldError e239) {
        }
        try {
            f1885a[EWDPropriete.PROP_LECTURESEULE.ordinal()] = 240;
        } catch (NoSuchFieldError e240) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPEMIME.ordinal()] = C0607n.bh;
        } catch (NoSuchFieldError e241) {
        }
        try {
            f1885a[EWDPropriete.PROP_LANGUE.ordinal()] = 242;
        } catch (NoSuchFieldError e242) {
        }
        try {
            f1885a[EWDPropriete.PROP_LANGUEDECRIT.ordinal()] = C0607n.Xn;
        } catch (NoSuchFieldError e243) {
        }
        try {
            f1885a[EWDPropriete.PROP_DONNEE.ordinal()] = C0607n.uw;
        } catch (NoSuchFieldError e244) {
        }
        try {
            f1885a[EWDPropriete.PROP_IDENTIFIANT.ordinal()] = 245;
        } catch (NoSuchFieldError e245) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALIDE.ordinal()] = 246;
        } catch (NoSuchFieldError e246) {
        }
        try {
            f1885a[EWDPropriete.PROP_BITPARPIXEL.ordinal()] = 247;
        } catch (NoSuchFieldError e247) {
        }
        try {
            f1885a[EWDPropriete.PROP_AVECALPHA.ordinal()] = 248;
        } catch (NoSuchFieldError e248) {
        }
        try {
            f1885a[EWDPropriete.PROP_COULEURREMPLISSAGE.ordinal()] = 249;
        } catch (NoSuchFieldError e249) {
        }
        try {
            f1885a[EWDPropriete.PROP_ROUGE.ordinal()] = C0607n.Ux;
        } catch (NoSuchFieldError e250) {
        }
        try {
            f1885a[EWDPropriete.PROP_VERT.ordinal()] = 251;
        } catch (NoSuchFieldError e251) {
        }
        try {
            f1885a[EWDPropriete.PROP_BLEU.ordinal()] = 252;
        } catch (NoSuchFieldError e252) {
        }
        try {
            f1885a[EWDPropriete.PROP_OPACITE.ordinal()] = 253;
        } catch (NoSuchFieldError e253) {
        }
        try {
            f1885a[EWDPropriete.PROP_TEINTE.ordinal()] = 254;
        } catch (NoSuchFieldError e254) {
        }
        try {
            f1885a[EWDPropriete.PROP_SATURATION.ordinal()] = 255;
        } catch (NoSuchFieldError e255) {
        }
        try {
            f1885a[EWDPropriete.PROP_LUMINOSITE.ordinal()] = 256;
        } catch (NoSuchFieldError e256) {
        }
        try {
            f1885a[EWDPropriete.PROP_PIXEL.ordinal()] = InputDeviceCompat.SOURCE_KEYBOARD;
        } catch (NoSuchFieldError e257) {
        }
        try {
            f1885a[EWDPropriete.PROP_NUM1ERJOURDELASEMAINE.ordinal()] = 258;
        } catch (NoSuchFieldError e258) {
        }
        try {
            f1885a[EWDPropriete.PROP_FOCUSAUCLIC.ordinal()] = 259;
        } catch (NoSuchFieldError e259) {
        }
        try {
            f1885a[EWDPropriete.PROP_NOMCOMPTE.ordinal()] = 260;
        } catch (NoSuchFieldError e260) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPECOMPTE.ordinal()] = 261;
        } catch (NoSuchFieldError e261) {
        }
        try {
            f1885a[EWDPropriete.PROP_ID.ordinal()] = 262;
        } catch (NoSuchFieldError e262) {
        }
        try {
            f1885a[EWDPropriete.PROP_AUTEUR.ordinal()] = 263;
        } catch (NoSuchFieldError e263) {
        }
        try {
            f1885a[EWDPropriete.PROP_AVECREPETITION.ordinal()] = C0607n.Fn;
        } catch (NoSuchFieldError e264) {
        }
        try {
            f1885a[EWDPropriete.PROP_INVITE.ordinal()] = 265;
        } catch (NoSuchFieldError e265) {
        }
        try {
            f1885a[EWDPropriete.PROP_LIEU.ordinal()] = C0607n.Gu;
        } catch (NoSuchFieldError e266) {
        }
        try {
            f1885a[EWDPropriete.PROP_REPETITION.ordinal()] = C0607n.Cw;
        } catch (NoSuchFieldError e267) {
        }
        try {
            f1885a[EWDPropriete.PROP_RAPPEL.ordinal()] = 268;
        } catch (NoSuchFieldError e268) {
        }
        try {
            f1885a[EWDPropriete.PROP_CALENDRIER.ordinal()] = 269;
        } catch (NoSuchFieldError e269) {
        }
        try {
            f1885a[EWDPropriete.PROP_DELAI.ordinal()] = C0607n.al;
        } catch (NoSuchFieldError e270) {
        }
        try {
            f1885a[EWDPropriete.PROP_FUSEAUHORAIRE.ordinal()] = 271;
        } catch (NoSuchFieldError e271) {
        }
        try {
            f1885a[EWDPropriete.PROP_JOURNEEENTIERE.ordinal()] = C0607n.hp;
        } catch (NoSuchFieldError e272) {
        }
        try {
            f1885a[EWDPropriete.PROP_PRIX.ordinal()] = C0607n.Hw;
        } catch (NoSuchFieldError e273) {
        }
        try {
            f1885a[EWDPropriete.PROP_AXEXMIN.ordinal()] = C0607n.vk;
        } catch (NoSuchFieldError e274) {
        }
        try {
            f1885a[EWDPropriete.PROP_AXEXMAX.ordinal()] = C0607n.wf;
        } catch (NoSuchFieldError e275) {
        }
        try {
            f1885a[EWDPropriete.PROP_AXEYMIN.ordinal()] = 276;
        } catch (NoSuchFieldError e276) {
        }
        try {
            f1885a[EWDPropriete.PROP_AXEYMAX.ordinal()] = 277;
        } catch (NoSuchFieldError e277) {
        }
        try {
            f1885a[EWDPropriete.PROP_AXESECONDAIRE.ordinal()] = 278;
        } catch (NoSuchFieldError e278) {
        }
        try {
            f1885a[EWDPropriete.PROP_COULEURSERIE.ordinal()] = 279;
        } catch (NoSuchFieldError e279) {
        }
        try {
            f1885a[EWDPropriete.PROP_EPAISSEUR.ordinal()] = 280;
        } catch (NoSuchFieldError e280) {
        }
        try {
            f1885a[EWDPropriete.PROP_LEGENDE.ordinal()] = 281;
        } catch (NoSuchFieldError e281) {
        }
        try {
            f1885a[EWDPropriete.PROP_MAJAUTOMATIQUE.ordinal()] = 282;
        } catch (NoSuchFieldError e282) {
        }
        try {
            f1885a[EWDPropriete.PROP_SOURCEDESCRIPTION.ordinal()] = 283;
        } catch (NoSuchFieldError e283) {
        }
        try {
            f1885a[EWDPropriete.PROP_DUREEANIMATION.ordinal()] = 284;
        } catch (NoSuchFieldError e284) {
        }
        try {
            f1885a[EWDPropriete.PROP_GRANDEICONE.ordinal()] = 285;
        } catch (NoSuchFieldError e285) {
        }
        try {
            f1885a[EWDPropriete.PROP_MESSAGESECONDAIRE.ordinal()] = 286;
        } catch (NoSuchFieldError e286) {
        }
        try {
            f1885a[EWDPropriete.PROP_CHRONOMETRE.ordinal()] = 287;
        } catch (NoSuchFieldError e287) {
        }
        try {
            f1885a[EWDPropriete.PROP_PRIORITE.ordinal()] = 288;
        } catch (NoSuchFieldError e288) {
        }
        try {
            f1885a[EWDPropriete.PROP_LOCALE.ordinal()] = 289;
        } catch (NoSuchFieldError e289) {
        }
        try {
            f1885a[EWDPropriete.PROP_LIBELLEACTION.ordinal()] = 290;
        } catch (NoSuchFieldError e290) {
        }
        try {
            f1885a[EWDPropriete.PROP_CHOIXREPONSE.ordinal()] = 291;
        } catch (NoSuchFieldError e291) {
        }
        try {
            f1885a[EWDPropriete.PROP_LIBELLEQUESTION.ordinal()] = 292;
        } catch (NoSuchFieldError e292) {
        }
        try {
            f1885a[EWDPropriete.PROP_ACTIONSUPPLEMENTAIRE.ordinal()] = 293;
        } catch (NoSuchFieldError e293) {
        }
        try {
            f1885a[EWDPropriete.PROP_FORMAT.ordinal()] = 294;
        } catch (NoSuchFieldError e294) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEURRECHERCHE.ordinal()] = 295;
        } catch (NoSuchFieldError e295) {
        }
        try {
            f1885a[EWDPropriete.PROP_LARGEURUTILE.ordinal()] = 296;
        } catch (NoSuchFieldError e296) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURUTILE.ordinal()] = 297;
        } catch (NoSuchFieldError e297) {
        }
        try {
            f1885a[EWDPropriete.PROP_BALAYAGEACTIF.ordinal()] = 298;
        } catch (NoSuchFieldError e298) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENSAISIE.ordinal()] = 299;
        } catch (NoSuchFieldError e299) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURTITRE.ordinal()] = C1409j.f4188e;
        } catch (NoSuchFieldError e300) {
        }
        try {
            f1885a[EWDPropriete.PROP_RESSOURCE.ordinal()] = 301;
        } catch (NoSuchFieldError e301) {
        }
        try {
            f1885a[EWDPropriete.PROP_CATEGORIE.ordinal()] = 302;
        } catch (NoSuchFieldError e302) {
        }
        try {
            f1885a[EWDPropriete.PROP_IMPORTANCE.ordinal()] = 303;
        } catch (NoSuchFieldError e303) {
        }
        try {
            f1885a[EWDPropriete.PROP_DEBUTETENDUETOTALE.ordinal()] = 304;
        } catch (NoSuchFieldError e304) {
        }
        try {
            f1885a[EWDPropriete.PROP_DEBUTETENDUEVISIBLE.ordinal()] = 305;
        } catch (NoSuchFieldError e305) {
        }
        try {
            f1885a[EWDPropriete.PROP_FINETENDUETOTALE.ordinal()] = 306;
        } catch (NoSuchFieldError e306) {
        }
        try {
            f1885a[EWDPropriete.PROP_FINETENDUEVISIBLE.ordinal()] = 307;
        } catch (NoSuchFieldError e307) {
        }
        try {
            f1885a[EWDPropriete.PROP_DEPLACEMENTRDV.ordinal()] = 308;
        } catch (NoSuchFieldError e308) {
        }
        try {
            f1885a[EWDPropriete.PROP_GRANULARITEDEPLACEMENT.ordinal()] = 309;
        } catch (NoSuchFieldError e309) {
        }
        try {
            f1885a[EWDPropriete.PROP_GRANULARITEDUREE.ordinal()] = 310;
        } catch (NoSuchFieldError e310) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURRESSOURCE.ordinal()] = 311;
        } catch (NoSuchFieldError e311) {
        }
        try {
            f1885a[EWDPropriete.PROP_HEUREOUVRABLEDEBUT.ordinal()] = 312;
        } catch (NoSuchFieldError e312) {
        }
        try {
            f1885a[EWDPropriete.PROP_HEUREOUVRABLEFIN.ordinal()] = 313;
        } catch (NoSuchFieldError e313) {
        }
        try {
            f1885a[EWDPropriete.PROP_MASQUETITREDATE.ordinal()] = 314;
        } catch (NoSuchFieldError e314) {
        }
        try {
            f1885a[EWDPropriete.PROP_MASQUETITREHEURE.ordinal()] = 315;
        } catch (NoSuchFieldError e315) {
        }
        try {
            f1885a[EWDPropriete.PROP_NBJOURAFFICHE.ordinal()] = 316;
        } catch (NoSuchFieldError e316) {
        }
        try {
            f1885a[EWDPropriete.PROP_JOURDELASEMAINE.ordinal()] = 317;
        } catch (NoSuchFieldError e317) {
        }
        try {
            f1885a[EWDPropriete.PROP_JOURDUMOIS.ordinal()] = 318;
        } catch (NoSuchFieldError e318) {
        }
        try {
            f1885a[EWDPropriete.PROP_JOURDUMOISOUDELASEMAINE.ordinal()] = 319;
        } catch (NoSuchFieldError e319) {
        }
        try {
            f1885a[EWDPropriete.PROP_NBOCCURRENCE.ordinal()] = 320;
        } catch (NoSuchFieldError e320) {
        }
        try {
            f1885a[EWDPropriete.PROP_TYPEFIN.ordinal()] = 321;
        } catch (NoSuchFieldError e321) {
        }
        try {
            f1885a[EWDPropriete.PROP_VERIFIEORTHOGRAPHE.ordinal()] = 322;
        } catch (NoSuchFieldError e322) {
        }
        try {
            f1885a[EWDPropriete.PROP_APPID.ordinal()] = 323;
        } catch (NoSuchFieldError e323) {
        }
        try {
            f1885a[EWDPropriete.PROP_APPSECRET.ordinal()] = 324;
        } catch (NoSuchFieldError e324) {
        }
        try {
            f1885a[EWDPropriete.PROP_PERMISSION.ordinal()] = 325;
        } catch (NoSuchFieldError e325) {
        }
        try {
            f1885a[EWDPropriete.PROP_RESSOURCESELECTIONNEE.ordinal()] = 326;
        } catch (NoSuchFieldError e326) {
        }
        try {
            f1885a[EWDPropriete.PROP_AUTORISEMASQUAGEACTIONBAR.ordinal()] = 327;
        } catch (NoSuchFieldError e327) {
        }
        try {
            f1885a[EWDPropriete.PROP_TAUXPARALLAXEHAUTEUR.ordinal()] = 328;
        } catch (NoSuchFieldError e328) {
        }
        try {
            f1885a[EWDPropriete.PROP_TAUXPARALLAXEY.ordinal()] = 329;
        } catch (NoSuchFieldError e329) {
        }
        try {
            f1885a[EWDPropriete.PROP_BOUTONSUPPRESSION.ordinal()] = 330;
        } catch (NoSuchFieldError e330) {
        }
        try {
            f1885a[EWDPropriete.PROP_ALIGNEMENT.ordinal()] = 331;
        } catch (NoSuchFieldError e331) {
        }
        try {
            f1885a[EWDPropriete.PROP_IMAGEFONDLIGNE.ordinal()] = 332;
        } catch (NoSuchFieldError e332) {
        }
        try {
            f1885a[EWDPropriete.PROP_UUID.ordinal()] = 333;
        } catch (NoSuchFieldError e333) {
        }
        try {
            f1885a[EWDPropriete.PROP_CARACTERISTIQUE.ordinal()] = 334;
        } catch (NoSuchFieldError e334) {
        }
        try {
            f1885a[EWDPropriete.PROP_DESCRIPTEUR.ordinal()] = 335;
        } catch (NoSuchFieldError e335) {
        }
        try {
            f1885a[EWDPropriete.PROP_NBTHREADATTENTE.ordinal()] = 336;
        } catch (NoSuchFieldError e336) {
        }
        try {
            f1885a[EWDPropriete.PROP_AJOUTTERMINE.ordinal()] = 337;
        } catch (NoSuchFieldError e337) {
        }
        try {
            f1885a[EWDPropriete.PROP_RETRAITGAUCHE.ordinal()] = 338;
        } catch (NoSuchFieldError e338) {
        }
        try {
            f1885a[EWDPropriete.PROP_COULEURTEXTEAUTOMATIQUE.ordinal()] = 339;
        } catch (NoSuchFieldError e339) {
        }
        try {
            f1885a[EWDPropriete.PROP_ECHELLEDESSIN.ordinal()] = 340;
        } catch (NoSuchFieldError e340) {
        }
        try {
            f1885a[EWDPropriete.PROP_MEMBRE.ordinal()] = 341;
        } catch (NoSuchFieldError e341) {
        }
        try {
            f1885a[EWDPropriete.PROP_CLASSE.ordinal()] = 342;
        } catch (NoSuchFieldError e342) {
        }
        try {
            f1885a[EWDPropriete.PROP_AVANT.ordinal()] = 343;
        } catch (NoSuchFieldError e343) {
        }
        try {
            f1885a[EWDPropriete.PROP_APRES.ordinal()] = 344;
        } catch (NoSuchFieldError e344) {
        }
        try {
            f1885a[EWDPropriete.PROP_COMPACTEOPTION.ordinal()] = 345;
        } catch (NoSuchFieldError e345) {
        }
        try {
            f1885a[EWDPropriete.PROP_LARGEURELEMENT.ordinal()] = 346;
        } catch (NoSuchFieldError e346) {
        }
        try {
            f1885a[EWDPropriete.PROP_HAUTEURELEMENT.ordinal()] = 347;
        } catch (NoSuchFieldError e347) {
        }
        try {
            f1885a[EWDPropriete.PROP_MARGEHAUTEUR.ordinal()] = 348;
        } catch (NoSuchFieldError e348) {
        }
        try {
            f1885a[EWDPropriete.PROP_MARGELARGEUR.ordinal()] = 349;
        } catch (NoSuchFieldError e349) {
        }
        try {
            f1885a[EWDPropriete.PROP_CRYPTAGE.ordinal()] = 350;
        } catch (NoSuchFieldError e350) {
        }
        try {
            f1885a[EWDPropriete.PROP_PROPRIETE.ordinal()] = 351;
        } catch (NoSuchFieldError e351) {
        }
        try {
            f1885a[EWDPropriete.PROP_ACCUSERECEPTION.ordinal()] = 352;
        } catch (NoSuchFieldError e352) {
        }
        try {
            f1885a[EWDPropriete.PROP_ADRESSEEXPEDITEUR.ordinal()] = 353;
        } catch (NoSuchFieldError e353) {
        }
        try {
            f1885a[EWDPropriete.PROP_CC.ordinal()] = 354;
        } catch (NoSuchFieldError e354) {
        }
        try {
            f1885a[EWDPropriete.PROP_CCI.ordinal()] = 355;
        } catch (NoSuchFieldError e355) {
        }
        try {
            f1885a[EWDPropriete.PROP_CONFIDENTIALITE.ordinal()] = 356;
        } catch (NoSuchFieldError e356) {
        }
        try {
            f1885a[EWDPropriete.PROP_DATERECEPTION.ordinal()] = 357;
        } catch (NoSuchFieldError e357) {
        }
        try {
            f1885a[EWDPropriete.PROP_CONFIRMATIONLECTURE.ordinal()] = 358;
        } catch (NoSuchFieldError e358) {
        }
        try {
            f1885a[EWDPropriete.PROP_DESTINATAIRE.ordinal()] = 359;
        } catch (NoSuchFieldError e359) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENDEHORS.ordinal()] = 360;
        } catch (NoSuchFieldError e360) {
        }
        try {
            f1885a[EWDPropriete.PROP_EXPEDITEUR.ordinal()] = 361;
        } catch (NoSuchFieldError e361) {
        }
        try {
            f1885a[EWDPropriete.PROP_HTML.ordinal()] = 362;
        } catch (NoSuchFieldError e362) {
        }
        try {
            f1885a[EWDPropriete.PROP_MESSAGEID.ordinal()] = 363;
        } catch (NoSuchFieldError e363) {
        }
        try {
            f1885a[EWDPropriete.PROP_REFERENCE.ordinal()] = 364;
        } catch (NoSuchFieldError e364) {
        }
        try {
            f1885a[EWDPropriete.PROP_SUJET.ordinal()] = 365;
        } catch (NoSuchFieldError e365) {
        }
        try {
            f1885a[EWDPropriete.PROP_TEXTEBRUT.ordinal()] = 366;
        } catch (NoSuchFieldError e366) {
        }
        try {
            f1885a[EWDPropriete.PROP_ATTACHE.ordinal()] = 367;
        } catch (NoSuchFieldError e367) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENTETE.ordinal()] = 368;
        } catch (NoSuchFieldError e368) {
        }
        try {
            f1885a[EWDPropriete.PROP_CONTENTTYPE.ordinal()] = 369;
        } catch (NoSuchFieldError e369) {
        }
        try {
            f1885a[EWDPropriete.PROP_CONTENTDESCRIPTION.ordinal()] = 370;
        } catch (NoSuchFieldError e370) {
        }
        try {
            f1885a[EWDPropriete.PROP_EMAILPARINDICE.ordinal()] = 371;
        } catch (NoSuchFieldError e371) {
        }
        try {
            f1885a[EWDPropriete.PROP_ASYNCHRONE.ordinal()] = 372;
        } catch (NoSuchFieldError e372) {
        }
        try {
            f1885a[EWDPropriete.PROP_URL.ordinal()] = 373;
        } catch (NoSuchFieldError e373) {
        }
        try {
            f1885a[EWDPropriete.PROP_AGENTUTILISATEUR.ordinal()] = 374;
        } catch (NoSuchFieldError e374) {
        }
        try {
            f1885a[EWDPropriete.PROP_METHODE.ordinal()] = 375;
        } catch (NoSuchFieldError e375) {
        }
        try {
            f1885a[EWDPropriete.PROP_DUREENONREPONSE.ordinal()] = 376;
        } catch (NoSuchFieldError e376) {
        }
        try {
            f1885a[EWDPropriete.PROP_AVANCEMENTTELECHARGEMENT.ordinal()] = 377;
        } catch (NoSuchFieldError e377) {
        }
        try {
            f1885a[EWDPropriete.PROP_AVANCEMENTENVOI.ordinal()] = 378;
        } catch (NoSuchFieldError e378) {
        }
        try {
            f1885a[EWDPropriete.PROP_TIMEOUTCONNEXION.ordinal()] = 379;
        } catch (NoSuchFieldError e379) {
        }
        try {
            f1885a[EWDPropriete.PROP_JAUGE.ordinal()] = 380;
        } catch (NoSuchFieldError e380) {
        }
        try {
            f1885a[EWDPropriete.PROP_FREQUENCE.ordinal()] = 381;
        } catch (NoSuchFieldError e381) {
        }
        try {
            f1885a[EWDPropriete.PROP_PROCEDURE.ordinal()] = 382;
        } catch (NoSuchFieldError e382) {
        }
        try {
            f1885a[EWDPropriete.PROP_ENTETEBRUT.ordinal()] = 383;
        } catch (NoSuchFieldError e383) {
        }
        try {
            f1885a[EWDPropriete.PROP_CODEETAT.ordinal()] = 384;
        } catch (NoSuchFieldError e384) {
        }
        try {
            f1885a[EWDPropriete.PROP_DESCRIPTIONCODEETAT.ordinal()] = 385;
        } catch (NoSuchFieldError e385) {
        }
        try {
            f1885a[EWDPropriete.PROP_DOMAINE.ordinal()] = 386;
        } catch (NoSuchFieldError e386) {
        }
        try {
            f1885a[EWDPropriete.PROP_CHEMIN.ordinal()] = 387;
        } catch (NoSuchFieldError e387) {
        }
        try {
            f1885a[EWDPropriete.PROP_EXPIRATION.ordinal()] = 388;
        } catch (NoSuchFieldError e388) {
        }
        try {
            f1885a[EWDPropriete.PROP_MASQUEAFFICHAGE.ordinal()] = 389;
        } catch (NoSuchFieldError e389) {
        }
        try {
            f1885a[EWDPropriete.PROP_CADRE.ordinal()] = 390;
        } catch (NoSuchFieldError e390) {
        }
        try {
            f1885a[EWDPropriete.PROP_MARQUEUR.ordinal()] = 391;
        } catch (NoSuchFieldError e391) {
        }
        try {
            f1885a[EWDPropriete.PROP_PERIPHERIQUEMOBILE.ordinal()] = 392;
        } catch (NoSuchFieldError e392) {
        }
        try {
            f1885a[EWDPropriete.PROP_ZONE.ordinal()] = 393;
        } catch (NoSuchFieldError e393) {
        }
        try {
            f1885a[EWDPropriete.PROP_POINT.ordinal()] = 394;
        } catch (NoSuchFieldError e394) {
        }
        try {
            f1885a[EWDPropriete.PROP_LETTRE.ordinal()] = 395;
        } catch (NoSuchFieldError e395) {
        }
        try {
            f1885a[EWDPropriete.PROP_ECHELLE.ordinal()] = 396;
        } catch (NoSuchFieldError e396) {
        }
        try {
            f1885a[EWDPropriete.PROP_FORMULERUBRIQUECALCULEE.ordinal()] = 397;
        } catch (NoSuchFieldError e397) {
        }
        try {
            f1885a[EWDPropriete.PROP_PERSISTANCERUBRIQUECALCULEE.ordinal()] = 398;
        } catch (NoSuchFieldError e398) {
        }
        try {
            f1885a[EWDPropriete.PROP_TIMESTAMPTYPE.ordinal()] = 399;
        } catch (NoSuchFieldError e399) {
        }
        try {
            f1885a[EWDPropriete.PROP_TIMESTAMPUTC.ordinal()] = C1084x.f3269t;
        } catch (NoSuchFieldError e400) {
        }
        try {
            f1885a[EWDPropriete.PROP_VALEURPARDEFAUTCALCULEE.ordinal()] = 401;
        } catch (NoSuchFieldError e401) {
        }
        try {
            f1885a[EWDPropriete.PROP_TITRENOTE.ordinal()] = 402;
        } catch (NoSuchFieldError e402) {
        }
        try {
            f1885a[EWDPropriete.PROP_COULEURBARRESYSTEME.ordinal()] = 403;
        } catch (NoSuchFieldError e403) {
        }
        try {
            f1885a[EWDPropriete.PROP_ZOOMAUDOIGT.ordinal()] = 404;
        } catch (NoSuchFieldError e404) {
        }
        try {
            f1885a[EWDPropriete.PROP_SCROLLAUDOIGT.ordinal()] = 405;
        } catch (NoSuchFieldError e405) {
        }
        try {
            f1885a[EWDPropriete.PROP_RENDEZVOUSCONTINU.ordinal()] = 406;
        } catch (NoSuchFieldError e406) {
        }
        try {
            f1885a[EWDPropriete.PROP_ORDRE.ordinal()] = 407;
        } catch (NoSuchFieldError e407) {
        }
        try {
            f1885a[EWDPropriete.PROP_CLIENTID.ordinal()] = 408;
        } catch (NoSuchFieldError e408) {
        }
        try {
            f1885a[EWDPropriete.PROP_CLIENTSECRET.ordinal()] = 409;
        } catch (NoSuchFieldError e409) {
        }
        try {
            f1885a[EWDPropriete.PROP_PARAMETRESSUPPLEMENTAIRES.ordinal()] = 410;
        } catch (NoSuchFieldError e410) {
        }
        try {
            f1885a[EWDPropriete.PROP_SCOPE.ordinal()] = 411;
        } catch (NoSuchFieldError e411) {
        }
        try {
            f1885a[EWDPropriete.PROP_URLAUTH.ordinal()] = 412;
        } catch (NoSuchFieldError e412) {
        }
        try {
            f1885a[EWDPropriete.PROP_URLREDIRECTION.ordinal()] = 413;
        } catch (NoSuchFieldError e413) {
        }
        try {
            f1885a[EWDPropriete.PROP_URLTOKEN.ordinal()] = 414;
        } catch (NoSuchFieldError e414) {
        }
        try {
            f1885a[EWDPropriete.PROP_REPONSESERVEUR.ordinal()] = 415;
        } catch (NoSuchFieldError e415) {
        }
        try {
            f1885a[EWDPropriete.PROP_BALAYAGEVERTICAL.ordinal()] = 416;
        } catch (NoSuchFieldError e416) {
        }
        try {
            f1885a[EWDPropriete.PROP_PARAMETRE.ordinal()] = 417;
        } catch (NoSuchFieldError e417) {
        }
        try {
            f1885a[EWDPropriete.PROP_TERMINEE.ordinal()] = 418;
        } catch (NoSuchFieldError e418) {
        }
        try {
            f1885a[EWDPropriete.PROP_ANNULEE.ordinal()] = 419;
        } catch (NoSuchFieldError e419) {
        }
        try {
            f1885a[EWDPropriete.PROP_AUTHTOKEN.ordinal()] = 420;
        } catch (NoSuchFieldError e420) {
        }
        try {
            f1885a[EWDPropriete.PROP_COULEURFONDTITRE.ordinal()] = 421;
        } catch (NoSuchFieldError e421) {
        }
        try {
            f1885a[EWDPropriete.PROP_RETRAITBAS.ordinal()] = 422;
        } catch (NoSuchFieldError e422) {
        }
        try {
            f1885a[EWDPropriete.PROP_RETRAITDROIT.ordinal()] = 423;
        } catch (NoSuchFieldError e423) {
        }
        try {
            f1885a[EWDPropriete.PROP_RETRAITHAUT.ordinal()] = 424;
        } catch (NoSuchFieldError e424) {
        }
        try {
            f1885a[EWDPropriete.PROP_FICHIERASSOCIE.ordinal()] = 425;
        } catch (NoSuchFieldError e425) {
        }
        try {
            f1885a[EWDPropriete.PROP_MAJOR.ordinal()] = 426;
        } catch (NoSuchFieldError e426) {
        }
        try {
            f1885a[EWDPropriete.PROP_MINOR.ordinal()] = 427;
        } catch (NoSuchFieldError e427) {
        }
        try {
            f1885a[EWDPropriete.PROP_DISTANCE.ordinal()] = 428;
        } catch (NoSuchFieldError e428) {
        }
        try {
            f1885a[EWDPropriete.PROP_PROXIMITE.ordinal()] = 429;
        } catch (NoSuchFieldError e429) {
        }
        try {
            f1885a[EWDPropriete.PROP_ANCRAGEAUCONTENU.ordinal()] = 430;
        } catch (NoSuchFieldError e430) {
        }
        try {
            f1885a[EWDPropriete.PROP_MARGEINTERCELLULES.ordinal()] = 431;
        } catch (NoSuchFieldError e431) {
        }
    }
}
