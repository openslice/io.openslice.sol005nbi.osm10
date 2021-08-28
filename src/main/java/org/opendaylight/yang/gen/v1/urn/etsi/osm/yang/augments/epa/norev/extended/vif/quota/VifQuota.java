package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.vif.quota;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.AllocationProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedVifQuota;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Virtual interfaces quota describes the virtual interface bandwidth resource 
 * allocation policy. Limit and Reserve values are defined in Mbps
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * container vif-quota {
 *   uses allocation-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-vif-quota/vif-quota</i>
 * 
 * <p>To create instances of this class use {@link VifQuotaBuilder}.
 * @see VifQuotaBuilder
 *
 */
public interface VifQuota
    extends
    ChildOf<ExtendedVifQuota>,
    Augmentable<VifQuota>,
    AllocationProperties
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vif-quota");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.vif.quota.VifQuota> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.vif.quota.VifQuota.class;
    }

}

