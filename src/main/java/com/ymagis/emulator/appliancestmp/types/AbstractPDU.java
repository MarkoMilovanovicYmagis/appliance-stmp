package com.ymagis.emulator.appliancestmp.types;

import com.ymagis.emulator.appliancestmp.asn.AsnSequence;
import com.ymagis.emulator.appliancestmp.asn.ber.BerTlv;
import com.ymagis.emulator.appliancestmp.asn.exception.AsnObjectValueException;

import java.util.List;

public abstract class AbstractPDU extends AsnSequence {

    public AbstractPDU() {
    }

    public AbstractPDU(List value) throws AsnObjectValueException {
        super(value);
    }

    public AbstractPDU(BerTlv tlv) {
        super(tlv);
    }
}
