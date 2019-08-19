package com.ymagis.emulator.appliancestmp.asn;

import com.ymagis.emulator.appliancestmp.asn.ber.BerTlv;
import com.ymagis.emulator.appliancestmp.asn.ber.BerTlvIdentifier;
import com.ymagis.emulator.appliancestmp.asn.exception.AsnObjectValueException;
import com.ymagis.emulator.appliancestmp.asn.exception.AsnParsingException;

public class AsnNull extends AsnObject {
    public static final byte TAG_NUMBER = 5;

    public AsnNull() {
    }

    public AsnNull(BerTlv tlv) {
        this();
        setValue(tlv);
    }

    public Object getValue() {
        return null;
    }

    public void setValue(Object value) throws AsnObjectValueException {
        throw new AsnObjectValueException("AsnNull can't have any value");
    }

    public void setValue(BerTlv tlv) {
        byte buf[] = tlv.getValue();
        if (buf.length != 0)
            throw new AsnParsingException("Length of provided byte[] doesn't match expected for this object type");
    }

    public BerTlv toBerTlv() {
        BerTlvIdentifier tag = new BerTlvIdentifier();
        tag.setTagValue(5);
        BerTlv tlv = new BerTlv();
        tlv.setTag(tag);
        tlv.setLength(0);
        tlv.setValue(new byte[0]);
        return tlv;
    }

    public String toString() {
        return "Null";
    }

}
