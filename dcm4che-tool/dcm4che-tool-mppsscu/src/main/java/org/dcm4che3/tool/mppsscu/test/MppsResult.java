/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), hosted at https://github.com/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa Healthcare.
 * Portions created by the Initial Developer are Copyright (C) 2011
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See @authors listed below
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */

package org.dcm4che3.tool.mppsscu.test;

import java.util.List;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.tool.common.test.TestResult;

/**
 * @author Umberto Cappellini <umberto.cappellini@agfa.com>
 * @author Hesham elbadawi <bsdreko@gmail.com>
 */
public class MppsResult implements TestResult{


    private String testDescription;
    private String fileName;

    private int nCreateSent;  
    private int nCreateWarnings;    
    private int nCreateFailures;
    private int nSetSent;  
    private int nSetFailures;
    
    private long createtime;
    private long settime;
    private List<Attributes> nsetResponse;
    private List<Attributes> ncreateResponse;
    /**
     * @param testDescription
     * @param fileName
     * @param nCreateSent
     * @param nCreateWarnings
     * @param nCreateFailures
     * @param nSetSent
     * @param nSetFailures
     * @param createtime
     * @param settime
     */
    public MppsResult(String testDescription, String fileName, int nCreateSent,
            int nCreateWarnings, int nCreateFailures, int nSetSent,
            int nSetFailures, long createtime, long settime, List<Attributes> nCreatecmdRSP, List<Attributes> nSetcmdRSP) {
        super();
        this.testDescription = testDescription;
        this.fileName = fileName;
        this.nCreateSent = nCreateSent;
        this.nCreateWarnings = nCreateWarnings;
        this.nCreateFailures = nCreateFailures;
        this.nSetSent = nSetSent;
        this.nSetFailures = nSetFailures;
        this.createtime = createtime;
        this.settime = settime;
        this.nsetResponse = nSetcmdRSP;
        this.ncreateResponse = nCreatecmdRSP;
    }
    public String getTestDescription() {
        return testDescription;
    }
    public String getFileName() {
        return fileName;
    }
    public int getnCreateSent() {
        return nCreateSent;
    }
    public int getnCreateWarnings() {
        return nCreateWarnings;
    }
    public int getnCreateFailures() {
        return nCreateFailures;
    }
    public int getnSetSent() {
        return nSetSent;
    }
    public int getnSetFailures() {
        return nSetFailures;
    }
    public long getCreatetime() {
        return createtime;
    }
    public long getSettime() {
        return settime;
    }
    public List<Attributes> getNsetResponse() {
        return nsetResponse;
    }

    public List<Attributes> getNcreateResponse() {
        return ncreateResponse;
    }

}
