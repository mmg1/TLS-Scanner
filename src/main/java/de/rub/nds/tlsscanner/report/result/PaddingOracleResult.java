/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rub.nds.tlsscanner.report.result;

import de.rub.nds.tlsscanner.constants.ProbeType;
import de.rub.nds.tlsscanner.report.SiteReport;

/**
 *
 * @author Robert Merget <robert.merget@rub.de>
 */
public class PaddingOracleResult extends ProbeResult {

    private final Boolean vulnerable;

    public PaddingOracleResult(Boolean vulnerable) {
        super(ProbeType.PADDING_ORACLE);
        this.vulnerable = vulnerable;
    }

    @Override
    public void merge(SiteReport report) {
        report.setPaddingOracleVulnerable(vulnerable);
    }
}
