package org.venuspj.sales.fragment.momentInterval.moment;

import org.venuspj.sales.fragment.momentInterval.MomentInterval;
import org.venuspj.sales.fragment.momentInterval.MomentIntervalDetail;
import org.venuspj.sales.fragment.momentInterval.MomentIntervalDetails;

public interface Moment<M extends Moment<M, MID, MIDs>, MID extends MomentIntervalDetail<MID>, MIDs extends MomentIntervalDetails<MIDs, MID>> extends MomentInterval<M, MID, MIDs> {
}
