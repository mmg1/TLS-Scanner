/**
 * TLS-Scanner - A TLS Configuration Analysistool based on TLS-Attacker
 *
 * Copyright 2014-2017 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsscanner.constants;

/**
 *
 * @author Robert Merget - robert.merget@rub.de
 */
public enum ProbeType {
    CERTIFICATE,
    CIPHERSUITE_ORDER,
    CIPHERSUITE,
    HEARTBLEED,
    BLEICHENBACHER,
    DROWN,
    EARLY_CCS,
    NAMED_CURVES,
    PADDING_ORACLE,
    CVE20162107,
    POODLE,
    TLS_POODLE,
    PROTOCOL_VERSION,
    INVALID_CURVE,
    SIGNATURE_AND_HASH,
    EXTENSIONS,
    COMPRESSIONS,
    INTOLERANCES,
    SNI,
}
