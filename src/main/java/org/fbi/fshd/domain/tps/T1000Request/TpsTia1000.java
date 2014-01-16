package org.fbi.fshd.domain.tps.T1000Request;

import org.fbi.linking.codec.dataformat.annotation.DataField;
import org.fbi.linking.codec.dataformat.annotation.SeperatedTextMessage;

@SeperatedTextMessage(separator = "\\|", mainClass = true)
public class TpsTia1000 {
    @DataField(seq = 1)
    private String billId;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @Override
    public String toString() {
        return "TpsTia1000{" +
                "billId='" + billId + '\'' +
                '}';
    }
}