package org.venuspj.sales.fragment.momentInterval;

import org.venuspj.ddd.model.value.ListValue;

public interface MomentIntervalDetails<MIDs extends MomentIntervalDetails<MIDs, MID>, MID extends MomentIntervalDetail<MID>> extends ListValue<MID> {
}
