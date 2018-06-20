package org.venuspj.sales.fragment.momentInterval.interval;

import org.venuspj.sales.fragment.momentInterval.MomentInterval;
import org.venuspj.sales.fragment.momentInterval.MomentIntervalDetail;
import org.venuspj.sales.fragment.momentInterval.MomentIntervalDetails;

public interface Interval<I extends Interval<I, MID, MIDs>, MID extends MomentIntervalDetail<MID>, MIDs extends MomentIntervalDetails<MIDs, MID>> extends MomentInterval<I, MID, MIDs> {

}
